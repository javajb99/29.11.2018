package decoratorDP;

public class Main {

	public static void main(String[] args) {

		Pizza basePizza = new BasePizza();
		System.out.println("details = " + basePizza.getDetails());
		System.out.println("price = " + basePizza.getCost());
		
		Pizza tomatoTopping = new TomatoSauceTopping(basePizza);
		
		System.out.println("details = " + tomatoTopping.getDetails());
		System.out.println("price = " + tomatoTopping.getCost());		


		Pizza chadderTopping = new ChadderTopping(tomatoTopping);
		
		System.out.println("details = " + chadderTopping.getDetails());
		System.out.println("price = " + chadderTopping.getCost());		

		
	}

}
