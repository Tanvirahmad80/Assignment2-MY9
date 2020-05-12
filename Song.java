public class Song {

	// Attributes..
	private String track;
	private Song next;
	
	// Constructors..
	public Song(String track) {
	
		this.track = track;
		this.next = null;
	
	}
	
	public Song(String track, Song next) {
	
		this.track = track;
		this.next = next;
	
	}
	
	// Getter and Setters..
	
	public String getTrack() {
	
		return track;
	
	}
	
	public void setTrack(String track) {
	
		this.track = track;
	
	}
	
	public Song getNext() {
	
		return next;
	
	}
	
	public void setNext(Song next) {
	
		this.next = next;
	
	}
	
}
