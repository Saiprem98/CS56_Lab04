// Sai Kathika 5528633

public abstract class MusicTrack implements MusicTrackInterface {
	private String title;
	private String length;
	private String artist;
	private String album;
	private int year;
	
	public MusicTrack(String title,String length, String artist, String album, int year) {
		this.title= title;
		this.length = length;
		this.artist = artist;
		this.album = album;
		this.year = year; 
	}
	public String getTitle() {
		return title;
	}
	//Returns the Music Track title.
	public String getLength() {
		return length;
	}
	//Returns the Music Track length.
	public String getArtist() {
		return artist;
	}
	//Returns the Music Track Artist name.
	public String getAlbum() {
		return album;
	}
	//Returns the Music Track Album name.
	public int getYear() {
		return year;
	}
	
	public void setTitle(String t) {
		title = t;
	}
	public void setLength(String t) {
		length = t;
	}
	public void setArtist(String t) {
		artist = t;
	}
	public void setAlbum(String t) {
		album = t;
	}
	public void setYear(int y) {
		year = y;
	}
	//Returns the Music Track year.
	public abstract String getAdditionalInfo();
	//Returns a String containing additional information based on the type
	//(Digital or Vinyl) of the Music Tracks.
}