package decoratorDP;


//this is the base pizza- we will add toppings to it in decorator mechanism
public class BasePizza implements Pizza {

	@Override
	public String getDetails() {
		return "Thin doe";
	}

	@Override
	public double getCost() {
		return 4.00;
	}
	
	

}