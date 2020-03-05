
public class VinylTrack extends MusicTrack {
	private String RPM;
	
	public VinylTrack( String title,String length, String artist, String album, int year,String RPM) {
		super(title, length, artist, album, year);
		this.RPM = RPM;
	}
	@Override
	public String getAdditionalInfo() {
		return RPM;
	}

}