public class SongHistoryList {

	// Attributes..
	private Song first;

	// Constructor.
	public SongHistoryList() {
	
		this.first = null;
		
	}

	// adding song.
	public void addSong(Song song) {

		// adding at front.
		if(first == null) {
			first = song;
		} else {			
			song.setNext(first);
			first = song;
		}
		
	}

	// last listened.
	public Song lastListened() {
	
		// listened.
		if(first == null) {
			return null;
		} else {
			Song current = first;
			first = first.getNext();
			return current;
		}
		
	}

}
