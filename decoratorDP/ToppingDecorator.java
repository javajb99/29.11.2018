package decoratorDP;

//The decorator base abstract  also implements Pizza and all decorators will inherit from it
public abstract class ToppingDecorator implements Pizza
{
	
	protected Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

}