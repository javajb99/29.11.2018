package decoratorDP;

public class ChadderTopping extends ToppingDecorator{
	 
	public ChadderTopping(Pizza pizza) {
		super(pizza);
		
	}
 
	@Override
	public String getDetails() {
		return pizza.getDetails() + " Chadder";
	}
 
	@Override
	public double getCost() {
		return pizza.getCost() + 0.5;
	}
}