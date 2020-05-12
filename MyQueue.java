import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyQueue extends LinkedList {

	// Default..
	public MyQueue() {
		
	}
	
	// Reading the queue.
	public MyQueue(String filename) {

		// Reading the file.
		try {

			Scanner scan = new Scanner(new File(filename));
			scan.nextLine();
			scan.nextLine();
			// reading.
			while (scan.hasNextLine()) {

				String[] tokens = scan.nextLine().split(",");
				String track = tokens[1];
				track = track.replaceAll("\"", "").trim();
				track = track.substring(0, 1).toUpperCase() + track.substring(1);
				Song song = new Song(track);
				if(!this.contains(song)) {
					this.add(song);
				}
				
			}
			scan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	// merging..
	public static MyQueue mergingFunction(MyQueue q1, MyQueue q2){
		
		MyQueue queue = new MyQueue();
		for(int i = 0; i < q1.size(); i++) {
			Song song = q1.get(i);
			if(!queue.contains(song)) {
				queue.add(song);
			}
		}
		for(int i = 0; i < q2.size(); i++) {
			Song song = q2.get(i);
			if(!queue.contains(song)) {
				queue.add(song);
			}
		}
		return queue;

	}

}
