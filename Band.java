package musician.management.system;

/**
 * This class keeps track of the bands that are available for the venue owner.
 * @author Armin
 *
 */
public class Band {
	private String id;
	private String name;
	private String genre;
	private int numMember; // number of members in the band
	private int rating;
	private double nightlyPrice;
	private double totalPaid;
	private int numBooked; //number of times the band was booked
	private int hrsExp;
	private String[] avail;

	public Band(String id, String name, String genre, int numMember, int rating, int hrsExp, String[] avail, double nightlyPrice) {
		this.totalPaid = 0;
		this.numBooked = 0;
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.numMember = numMember;
		this.rating = rating;
		this.hrsExp = hrsExp;
		this.avail = avail;
		this.nightlyPrice = nightlyPrice;
	}

	// Set methods
	//Band name, id, and genre will not be altered.
	// update total bill will only accept positive integers
	public void setMember(int numMember) {
		this.numMember=numMember;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	public void setHrsExp(int hrsExp) {
		this.hrsExp=hrsExp;
	}
	public void setAvail(String[] avail) {
		this.avail=avail;
	}
	public void setNightlyPrice(double nightlyPrice) {
		this.nightlyPrice=nightlyPrice;
	}
	public void updateTotalPaid(int bill) {
		if (bill>0)
			this.totalPaid += bill;
		else
			System.out.println("Enter a positive integer");
	}
	
	//add a book method
	
	// get methods
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public int getNumMember() {
		return numMember;
	}
	public int getRating() {
		return rating;
	}
	public int getHrsExp() {
		return hrsExp;
	}
	public String[] getAvail() {
		return avail;
	}
	public double getNightlyPrice() {
		return nightlyPrice;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public int getNumBooked() {
		return numBooked;
	}
	
	// toString method
	public String toString() {
		String temp = "\n";
		System.out.printf("Id: %s\n", id);
		System.out.printf("Name: %s\n", name);
		System.out.printf("Genre: %s\n", genre);
		System.out.printf("Rating: %d\n", rating);
		System.out.printf("Nightly price: $%.2f\n", nightlyPrice);
		System.out.printf("Number of times booked to date: %d\n", numBooked);
		System.out.printf("Hours of experience: %d\n", hrsExp);
		System.out.printf("Number of band memebrs: %d\n", numMember);
		System.out.printf("Total amount paid to this artist to date: $%.2f\n", totalPaid);
		System.out.print("Availability: ");
		for (int i = 0; i < avail.length; i++)
			if (i == avail.length - 1)
				System.out.print(avail[i]);
			else	
				System.out.print(avail[i] + "," + " ");
		return temp;
	}
}
	
