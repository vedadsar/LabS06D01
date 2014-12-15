public class ToyStore {

	private String name;
	private Toy[] inventory;
	private int numToys;

	/**
	 * Konstruktor kojem samo proslijedili parametar ime invetara
	 * 
	 * @param name
	 */
	public ToyStore(String name) {
		setName(name);
		inventory = new Toy[1];
	}

	/**
	 * Name getter
	 * 
	 * @return
	 */
	public String getName() {
		return name;

	}

	/**
	 * Name setter
	 * 
	 * @param name
	 */
	public void setName(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Ime je prazno");
		} else {

			this.name = name;
		}
	}

	/**
	 * Stavlja nas inventar u String ( da bi mogli ispisati i vidjeti sta smo
	 * napravili)
	 */
	public String toString() {

		String inventoryToString = "";
		inventoryToString += "Name of store: " + name + " contains:\n";
		for (int i = 0; i < numToys; i++) {
			inventoryToString += "\t" + inventory[i].toString();
		}
		inventoryToString += "\n";
		return inventoryToString;
	}

	/**
	 * Metoda dodaje novu igracku u inventar.
	 * 
	 * @param newToy
	 *            = nova igracka
	 */
	public void addToy(Toy newToy) {

		/* Check if in inventory */
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				inventory[i].increaseQuantity(newToy.getQuantity());
                return;
			}

		}

		inventory[numToys] = new Toy(newToy);
		numToys++;
		// Ukoliko je broj igracaka jednak velicini inventara prosiriti inventar
		if (numToys == inventory.length) {
			resizeInventory();

		}
	}

	/**
	 * Metoda za promjenu velicine inventara, svaku put ga uduplamo.
	 */
	private void resizeInventory() {

		int newLenght = 2 * inventory.length;
		Toy[] temp = new Toy[newLenght];

		for (int i = 0; i < inventory.length; i++) {
			temp[i] = inventory[i];

		}

		inventory = temp;

	}

	public void removeToy(Toy newToy) {
		
		for (int i = 0; i < numToys; i++) {
			if (inventory[i].equals(newToy)) {
				for (int j = i; j < numToys - 1; j++) {
					inventory[j] = inventory[j + 1];
				}
				inventory[numToys] = null;
				numToys--;
			}
		}

	}
}
