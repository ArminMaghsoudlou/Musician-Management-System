package musician.management.system;

import java.util.List;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		//Venue objects
		Venue bluebirdCafe = new Venue("Bluebird Cafe" ,"Nashville, TN");       //bluebird is one word
		Venue theProphetBar = new Venue("The Prophet Bar" ,"Dallas, TX");
		Venue barracuda = new Venue("Barracuda" ,"Austin, TX");
		
		//List of all the venues that the user either owns or manages
		ArrayList<Venue> venueList = new ArrayList<>();
		venueList.add(bluebirdCafe);
		venueList.add(theProphetBar);
		venueList.add(barracuda);
		
		// Musician + bands have the following availabilities to choose from
		String[] everyday = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		String[] weekends = {"Sunday","Saturday"};
		String[] fss = {"Sunday","Friday","Saturday"};
		String[] mwf = {"Monday","Wednesday","Friday",};
		String[] thursfri = {"Thursday","Friday"};
		
		//Musician objects
		Musician taylorSwift = new Musician("0001","Taylor Swift", "Pop", 7, 10000, thursfri, 10000, venueList );
		Musician jBieber = new Musician("0002","Justin Bieber", "Pop", 8, 10000, weekends, 11000, venueList );
		Musician tomPetty = new Musician("0003","Tom Petty", "Rock", 10, 10000, fss, 12000 , venueList);
		Musician eminem = new Musician("0004","Eminem", "Rap", 5, 9000, mwf, 8000 , venueList);
		Musician kanyeWest = new Musician("0005","Kanye West", "Rap", 6, 6000, weekdays, 5000 , venueList);
		Musician frankSinatra = new Musician("0006","Frank Sinatra", "Pop", 10, 10000, everyday, 20000 , venueList);
		Musician beyonce = new Musician("0007","Beyonce", "Pop", 4, 10000, thursfri, 4000.50, venueList );
		Musician johnDoe = new Musician("0008","John Doe", "Jazz", 1, 1000, thursfri, 150.25 , venueList );
		Musician janeDoe = new Musician("0009","Jane Doe", "Rock", 2, 2000, mwf, 200.32, venueList );
		Musician leonardCohen = new Musician("0010","Leonard Cohen", "Folk", 9, 10000, everyday, 19000.99, venueList );
		Musician georgeStrait = new Musician("0011","George Strait", "Country", 9, 10000, everyday, 30000, venueList);
		
		//List of available musicians for Bluebird Cafe
		List<Musician> bluebirdMusicianList = new ArrayList<>();
		bluebirdMusicianList.add(taylorSwift);
		bluebirdMusicianList.add(jBieber);
		bluebirdMusicianList.add(tomPetty);
		bluebirdMusicianList.add(eminem);
		bluebirdMusicianList.add(kanyeWest);
		bluebirdMusicianList.add(frankSinatra);
		bluebirdMusicianList.add(johnDoe);
		bluebirdMusicianList.add(janeDoe);
		bluebirdMusicianList.add(leonardCohen);
		
		//List of available musicians for The Prophet Bar
		List<Musician> theProphetBarMusicianList = new ArrayList<>();
		theProphetBarMusicianList.add(frankSinatra);
		theProphetBarMusicianList.add(tomPetty);
		theProphetBarMusicianList.add(leonardCohen);
		theProphetBarMusicianList.add(georgeStrait);
		
		// List of available musicians for Barracuda
		List<Musician> barracudaMusicianList = new ArrayList<>();
		barracudaMusicianList.add(georgeStrait);
		barracudaMusicianList.add(taylorSwift);
		barracudaMusicianList.add(janeDoe);
		barracudaMusicianList.add(beyonce);
		
		//Band objects
		Band nirvana = new Band("0012", "Nirvana", "Alternative Rock",6, 9, 10000, weekends, 50000);
		Band theBeatles = new Band("0013", "The Beatles", "Rock",5, 10, 10000, weekends, 100000);
		Band pinkFloyd = new Band("0014", "Pink Floyd", "Rock",4, 8, 10000, everyday, 80000);
		Band lynyrdSkynyrd = new Band("0015", "Lynyrd Skynyrd", "Rock",3, 7, 10000, mwf, 70000);
		
		// List of available bands for Bluebird cafe
		List<Band> bluebirdBandList = new ArrayList<>();
		bluebirdBandList.add(nirvana);
		
		// List of available bands for The Prophet Bar
		List<Band> theProphetBarBandList = new ArrayList<>();
		theProphetBarBandList.add(pinkFloyd);
		theProphetBarBandList.add(lynyrdSkynyrd);

		// List of available bands for barracuda
		List<Band> barracudaBandList = new ArrayList<>();
		barracudaBandList.add(nirvana);
		barracudaBandList.add(lynyrdSkynyrd);
		barracudaBandList.add(theBeatles);
		
		//debug the commented code 
		// add the musician lists that were created to the venue object (These are the musicians that are available to the particular venue)
		//bluebirdCafe.addMusicianList(bluebirdMusicianList);
		//theProphetBar.addMusicianList(theProphetBarMusicianList);
		//barracuda.addMusicianList(barracudaMusicianList);
		
		//Add the band lists that were created to the venue object (These are the bands that are available to the particular venue)
		//bluebirdCafe.addBandList(bluebirdBandList);
		//theProphetBar.addBandList(theProphetBarBandList);
		//barracuda.addBandList(barracudaBandList);
		
		//tests
		System.out.println(georgeStrait);
		System.out.println(nirvana);
		georgeStrait.book("Bluebird Cafe");
		georgeStrait.book("Bluebird Cafe");
		georgeStrait.book("The Prophet Bar");
		System.out.println("The total number of times George Strait was booked is " + georgeStrait.getNumBooked());
		System.out.printf("The total amount George Strait has been paid so far is $%.2f\n",georgeStrait.getTotalPaid());
		
		System.out.println(theProphetBar.getName());
		System.out.printf("The total money spent at %s is $%.2f\n", bluebirdCafe.getName(), bluebirdCafe.getTotalMoneySpent());
		System.out.printf("The total money spent at %s is $%.2f\n", theProphetBar.getName(), theProphetBar.getTotalMoneySpent());
		System.out.printf("The total money spent at %s is $%.2f\n", barracuda.getName(), barracuda.getTotalMoneySpent());
	}
}
