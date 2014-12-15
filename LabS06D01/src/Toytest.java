
public class Toytest {
public static void main(String[] args) {
	Toy prva = new Toy("name", "tip1",12.12);
	Toy druga = new Toy("name", "tip1",12.12, 4,5);
	Toy treca= new Toy("name", "tip1",12.12, 1989,15);
	Toy cetvrta= new Toy("name", "tip1",12.12,1989,4);
	Toy kopija = new Toy(prva);
	
	System.out.println(prva.toString());
	System.out.println(druga.toString());
	System.out.println(treca.toString());
	System.out.println(cetvrta.toString());
	System.out.println(kopija.equals(prva));
	
}
}
