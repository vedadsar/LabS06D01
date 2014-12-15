public class Toy {
	private String name;
	private String type;
	private double price;
	private int manYear;
	private int ageRestriction;
	private int quantity;
/**
 * Konstruktor sa 3 parametra
 * @param name = ime igracke 
 * @param type = tip igracke
 * @param price = cijena igracke
 */
	public Toy(String name, String type, double price) {
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(2014);
		setAgeRestriction(0);
		quantity = 1;

	}
/**
 * Konstruktor sa 5 parametara
 * @param name ime 
 * @param type tip
 * @param price cijena
 * @param manYearOrAgeRestr ogranicenje godista za igracku ili godinja proizvodnje u zavisnosti od unesenog broja.
 * @param quantity kolicina
 */
	public Toy(String name, String type, double price, int manYearOrAgeRestr,
			int quantity) {
		setName(name);
		setType(type);
		setPrice(price);
		setQuantity(quantity);
		if (manYearOrAgeRestr < 100) {
			setAgeRestriction(manYearOrAgeRestr);
		} else {
			setManYear(manYearOrAgeRestr);
		}
	}
/**
 * Konstruktor sa 6 parametara
 * @param name ime
 * @param type tip
 * @param price cijena
 * @param manYear godina proizvodnje
 * @param ageRestriction ogranicenje godina za koristenje igracke
 * @param quantity kolicina
 */
	public Toy(String name, String type, double price, int manYear,
			int ageRestriction, int quantity) {
		setName(name);
		setType(type);
		setPrice(price);
		setManYear(manYear);
		setAgeRestriction(ageRestriction);
		setQuantity(quantity);
	}
/**
 * Konstruktor kopija.
 * @param other kopija konstruktora
 */
	public Toy(Toy other) {
		this.name = other.name;
		this.type = other.type;
		this.price = other.price;
		this.manYear = other.manYear;
		this.ageRestriction = other.ageRestriction;
		this.quantity = other.quantity;

	}
/**
 * toString metoda
 */
	public String toString() {
		String toyToString = "Name:" + name + "\n\tType:" + type + "\n\tPrice="
				+ price + "\n\tManYear=" + manYear + "\n\tAgeRestriction="
				+ ageRestriction + "\n\tQuantity: " +quantity +"\n\n";
		return toyToString;
	}
	/**
	 * Metoda koja uvelicava kolicinu ( kasnije cemo koristiti u slucaju da se doda ista igracka, da se samo poveca kolicina postojeceg objekta)
	 * @param additional
	 */
	 public void increaseQuantity(int additional){
	    	this.quantity += additional;
	        }
// name setter
	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("ime prazno!");
		} else {
			this.name = name;
		}
	}
// tip setter
	public void setType(String type) {

		if (type.length() < 1) {
			throw new IllegalArgumentException("tip prazno!");
		} else {
			this.type = type;
		}
	}
// setter kolicine
	public void setQuantity(int quantity) {
		if (quantity < 1) {
			throw new IllegalArgumentException("Kolicina ne moze biti 0");
		} else {
			this.quantity = quantity;
		}
	}
// getter kolicine
	public int getQuantity() {
		return quantity;
	}
//setter cijene
	public void setPrice(double price) {
		if (price < 1) {
			throw new IllegalArgumentException("cijena prazno!");
		} else {
			this.price = price;
		}
	}
//setter godine proizvodnje
	public void setManYear(int manYear) {
		this.manYear = manYear;
	}
// setter za age restriction
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
//name getter
	public String getName() {
		return name;
	}
//tip getter
	public String getType() {
		return type;
	}
// cijena getter
	public double getPrice() {
		return price;
	}
//getter za godinu proizvodnje
	public int getManYear() {
		return manYear;
	}
	// age restriction getter
		public int getAgeRestriction() {
			return ageRestriction;
		}
/**
 * Equal metoda provjerava ukoliko je nas objekat jednak drugom objektu ( ne provjerava kolicinu jer ne mora biti ista)
 * @param other objekat Toy koji poredimo
 * @return
 */
public boolean equals(Toy other) {
	 if(this.name.equals(other.name) && this.type.equals(other.type) && this.price==other.price && this.manYear==other.manYear && this.ageRestriction==other.ageRestriction ){
		 return true;
	 }else{
		 return false;
	 }
}


}
