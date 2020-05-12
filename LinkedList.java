public class LinkedList {

	// linked list.
	private Song first;

	// Constructor.
	public LinkedList() {

		this.first = null;

	}

	// Adding..
	public void add(Song song) {

		if (first == null) {
			first = song;
		} else {

			Song current = first;
			while (current.getNext() != null) {

				current = current.getNext();

			}
			current.setNext(song);

		}

	}

	// contains..
	public boolean contains(Song song) {

		Song current = first;
		while (current != null) {

			if (current.getTrack().equals(song.getTrack())) {
				return true;
			}
			current = current.getNext();

		}
		return false;

	}

	// get value at..
	public Song get(int index) {

		int i = 0;
		Song current = first;
		while (current != null) {

			if(i == index) {
				return new Song(current.getTrack());
			}
			i++;
			current = current.getNext();

		}
		return null;

	}
	
	// removing first.
	public Song removeFirst() {
		
		if(first != null) {
			Song current = first;
			first = first.getNext();
			return current;
		}
		return null;
		
	}
	
	// size..
	public int size() {

		int size = 0;
		Song current = first;
		while (current != null) {

			size++;
			current = current.getNext();

		}
		return size;

	}

}
