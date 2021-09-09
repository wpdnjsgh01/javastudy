package song;

public class Good_Day_Bean {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	private int track;
	
	public void Song() {
		
		this.setTitle("좋은날");
		this.setArtist("아이유");
		this.setAlbum("Real");
		this.setTrack(3);
		this.setComposer("이민수");
		this.setYear("2010");
		
		System.out.println(this.getArtist());
		
	}
	
}
