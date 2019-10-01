package musician.management.system;

import java.util.List;

// This class keeps track of data regarding the venues themselves  
public class Venue {
	private List<Musician> musicians;
	private List<Band> bands;
	private static double totalMoneySpent;
	private String name;
	private String location;
	private int totalNumBookings;
	
	public Venue(List<Musician> musicians, List<Band> bands, String name, String location) {
		this.musicians = musicians;
		this.bands = bands;
		this.name = name;
		this.location = location;
		totalMoneySpent = 0;
		totalNumBookings = 0;
		}
	
	public Venue(String name, String location) {
		this.musicians = null;
		this.bands = null;
		this.name = name;
		this.location = location;
		totalMoneySpent = 0;
		totalNumBookings = 0;
		}

	
	// set methods
	public void addMusician(Musician musician) {
		musicians.add(musician);
	}
	
	public void addMusicianList(List<Musician> musicianList) {
		for (int i = 0; i < musicianList.size(); i++) {
				musicians.add(musicianList.get(i));
		}
	}
	
	public void addBand(Band band) {
		bands.add(band);
	}
	
	public void addBandList(List<Band> bandList) {
		for (int i = 0; i < bandList.size(); i++) {
			bands.add(bandList.get(i));
		}
	}
	public void updateTotalMoneySpent(double moneySpent) {
		totalMoneySpent += moneySpent;
	}
	
	// get methods
	public List<Musician> getMusicians(){
		return musicians;
	}
	public List<Band> getBands(){
		return bands;
	}
	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getTotalNumBookings() {
		return totalNumBookings;
	}
}
