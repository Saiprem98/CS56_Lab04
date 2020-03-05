import java.util.ArrayList;

public class TitleBucket implements BucketInterface {
	private ArrayList<ArrayList<MusicTrack>> buckets = new ArrayList<ArrayList<MusicTrack>>();
	
	public TitleBucket() {
		for (int x =0 ; x<26;x++) {
			buckets.add(new ArrayList<MusicTrack>());
		}
	}
	@Override
	public void addItem(MusicTrack itemToAdd) {
		//System.out.println("here Title addItem");
		String title = itemToAdd.getTitle();
		int ascii = (int) title.toUpperCase().charAt(0);
		int index = ascii - 65;
		//System.out.println("here Title addItem 1");
		//ArrayList<MusicTrack> inner = new ArrayList<MusicTrack>();
//		for (int x =0 ; x<26;x++) {
//			buckets.add(new ArrayList<MusicTrack>());
//		}
		//System.out.println("here Title addItem 2"+ itemToAdd.getTitle());
		//System.out.println("here Title addItem 3");
		buckets.get(index).add(itemToAdd);
		//System.out.println(buckets.size()+" "+buckets.get(1).size());
		//System.out.println(buckets.size()+" "+buckets.get(0).size);
		//System.out.println(buckets.get(0).get(0).getArtist()+" "+buckets.get(0).get(0).getArtist());
		//System.out.println("here Title addItem 4");
		if(buckets.get(index).size()==1 || buckets.get(index).size()==0 ) {
			// dont need to compare 
			//System.out.println("here addItem5");
			return;
		//	exit();
		}
		for (int j = 0; j < buckets.get(index).size()-1 ; j++) {
			for(int k = j+1; k<buckets.get(index).size();k++) {
				if(buckets.get(index).get(j).getTitle().compareTo(buckets.get(index).get(k).getTitle()) > 0) {
					//System.out.println(buckets.get(i).get(j).getTitle());
					MusicTrack temp = buckets.get(index).get(k);
					buckets.get(index).set(k,buckets.get(index).get(j));
					buckets.get(index).set(j,temp);
				}
				if(buckets.get(index).get(j).getTitle().compareTo(buckets.get(index).get(k).getTitle()) == 0) {
					if(buckets.get(index).get(j).getArtist().compareTo(buckets.get(index).get(k).getArtist()) > 0) {
						MusicTrack temp = buckets.get(index).get(k);
						buckets.get(index).set(k,buckets.get(index).get(j));
						buckets.get(index).set(j,temp);
					}
				}
//				eachLetter.add(buckets.get(i).get(j));
//				Collections.sort(eachLetter);
			}
		}
		
	}
	
	public void sortArrayList() {
		
	}
	@Override
	public ArrayList<ArrayList<MusicTrack>> getBuckets() {
		// TODO Auto-generated method stub
		return buckets;
	}

}
