public class Playlist {

	// Attributes..
	private Song first;
	  
	// Constructor.
	public Playlist(){
	
		first = null;
		
	}
	 
	// add song.
	public void addSong(Song song){

		if (first == null) {
			first = song;
		} else {
			
			Song current = first;
			if(current.getTrack().compareTo(song.getTrack()) > 0) {
				song.setNext(first);
				first = song;
				return;
			}
			Song previous = first;
			current = first.getNext();
			while(current != null) {
				if(current.getTrack().compareTo(song.getTrack()) > 0) {
					previous.setNext(song);
					song.setNext(current);
					return;
				}
				previous = current;
				current = current.getNext();
			}
			previous.setNext(song);
			
		}
	
	}
	
	public void print() {
		System.out.println("print..........");
		Song current = first;
		while(current != null) {
			System.out.println(current.getTrack());
			current = current.getNext();
		}
		
	}
	
	// listen to song.
	public Song listenToSong(){
	
		if(first != null) {
			Song current = first;
			first = first.getNext();
			return current;
		}
		
		return null;
		
	}

}
