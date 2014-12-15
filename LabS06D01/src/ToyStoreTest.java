
public class ToyStoreTest {
public static void main(String[] args) {
	Toy prva = new Toy("name", "tip1",12.12);
	Toy druga = new Toy("name", "tip1",12.12, 4,5);
	Toy treca= new Toy("name", "tip5",12.12, 1989,15);
	Toy cetvrta= new Toy("name", "tip2",12.12,1989,4);
	
	ToyStore store = new ToyStore("Vedadova prodavnica");
	 store.addToy(prva);
	 store.addToy(druga);
	 store.addToy(treca);
	 store.addToy(cetvrta);
	 store.addToy(druga);// Samo ce promjeniti kolicinu.
	 
	 System.out.println(store.toString());
}	 

}
