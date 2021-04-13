package lab4ex3;

public class Client {

	public static void main(String[] args)
	{
		Book book = new Book(1, 5, "SamJam", "KomJohn");
		Journal journal = new Journal(15, 6, "Iceberg", "Iceland of ocean", 1993);
		CD cd = new CD ("Kims Johns", "Timberley Horror");
		Video video = new Video("Horroswh", "Jammer", 1992);
		book.print();
		journal.print();
		cd.print();
		video.print();
		System.out.println(cd.getArtist());
		
	}
}
		
