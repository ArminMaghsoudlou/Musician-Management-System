package musician.management.system;
/**
 * This class keeps tracks of the musicians/singers that are available for the venue owner.
 * @author Armin
 *
 */
import java.util.List;
import java.util.ArrayList;

public class Musician {
	private String id;
	private String name;
	private String genre;
	private int rating;
	private double nightlyPrice;
	private double totalPaid;
	private int numBooked;         //number of times the musician was booked
	private int hrsExp;
	private String[] avail;
	private ArrayList<Venue> venueList;
	
	/**
	 * Musicians can also include singers or any other solo musical acts.
	 * Total paid to the musician will be initialized to 0
	 * @param id id for the musician
	 * @param name name of the musician
	 * @param rating rating for the musician on a scale of 1-10. 10 being the best score.
	 * @param hrsExp hours experience of the musician 
	 * @param avail The nights they are available to play. 
	 * @param nightlyPrice What the musician is charging for one gig. Gigs are 2 hours each.
	 */
	public Musician(String id, String name, String genre, int rating, int hrsExp, String[] avail, double nightlyPrice, ArrayList<Venue> venueList) {
		this.totalPaid = 0;
		this.numBooked = 0;
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.hrsExp = hrsExp;
		this.avail = avail;
		this.nightlyPrice = nightlyPrice;
		this.venueList = venueList;
	}
	
	// set methods
	// Musician name,id, and genre will not be altered.
	// setNightlyPrice will only accept positive numbers since it doesn't make sense to charge a negative amount
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
	public void book(String venue) {
		totalPaid += nightlyPrice;
		numBooked++;
		for (int i = 0; i < venueList.size() ;i++) {
			if (venueList.get(i).getName() == venue)
				venueList.get(i).updateTotalMoneySpent(nightlyPrice);
		}
	}	
	
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
