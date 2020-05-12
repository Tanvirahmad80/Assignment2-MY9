import java.util.ArrayList;
import java.util.Scanner;

public class MyApp {

	// Main method.
	public static void main(String[] args) {

		String[] files = {"data/usdataweek3.csv", "data/usdataweek4.csv",
				"data/usdataweek5.csv"};
		ArrayList<MyQueue> allWeekQueues = new ArrayList<>();
		for(int i = 0; i < files.length; i++) {
			
			MyQueue queue = new MyQueue(files[i]);
			allWeekQueues.add(queue);
		
		}
		// Creating play list.
		Playlist playlist = new Playlist();
		// Creating play list history.
		SongHistoryList history = new SongHistoryList();
		// merging all queues in 1 queue.
		MyQueue completeQueue = new MyQueue();
		for(int i = 0; i < allWeekQueues.size(); i++) {			
		
			completeQueue = MyQueue.mergingFunction(completeQueue, allWeekQueues.get(i));			
		
		}
		// adding songs to play list.
		int size = completeQueue.size();
		for(int i = 0; i < size; i++) {
		
			Song song = completeQueue.removeFirst();
			playlist.addSong(song);
		
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.print("** Menu **\n"
					+ "1: Play Song\n"
					+ "2: Last Played Song\n"
					+ "3: Exit\n"
					+ "Your Option: ");
			int option = scan.nextInt();
			if(option == 1) {
			
				Song song = playlist.listenToSong();
				history.addSong(new Song(song.getTrack()));
				System.out.println("Listing to song: "+song.getTrack());
			
			} else if(option == 2) {
			
				Song song = history.lastListened();
				String data = "";
				if(song != null) {
					data = song.getTrack();
				}
				System.out.println("Last Listened Song: "+data);
			
			} else if(option == 3) {
			
				break;
			
			} else {
			
				System.out.println("Select correct option.");
			
			}
			
		}
		scan.close();
		
	}

}
