package decoratorDP;

public class MozzarellaTopping extends ToppingDecorator{
	 
	public MozzarellaTopping(Pizza pizza) {
		super(pizza);
		
	}
 
	@Override
	public String getDetails() {
		return pizza.getDetails() + " Mozarrela";
	}
 
	@Override
	public double getCost() {
		return pizza.getCost() + 0.5;
	}
}