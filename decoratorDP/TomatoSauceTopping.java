package decoratorDP;


public class TomatoSauceTopping extends ToppingDecorator{

	public TomatoSauceTopping(Pizza pizza) {
		super(pizza);
		
	}

	@Override
	public String getDetails() {
		return pizza.getDetails() + " TomatoSauce";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 0.5;
	}
}
