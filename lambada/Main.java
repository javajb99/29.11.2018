package lambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				// 	Creating a list
				List<Person> list = new ArrayList<Person>();
				list.add(new Person("itay", 1.90f, 40, 1, 120));
				list.add(new Person("danna", 1.95f, 38, 2, 56));
				list.add(new Person("zohan", 1.88f, 35, 3, 100));
				list.add(new Person("ortal", 2.05f, 42, 4, 75));
				
				//1
				// simple way of sorting, using Comparator<Person> class + instance
				Collections.sort(list, new PersonComparatorByAge());
				
				//2 - by name
				// sorting by name using lambda
				
//				Comparator<Person> anon = new Comparator<Person> ()
//				{
//
//					@Override
//					public int compare(Person arg0, Person arg1) {
//						// TODO Auto-generated method stub
//						return 0;
//					}
//					
//				};

				Collections.sort(list, new Comparator<Person> ()
								{
									@Override
									public int compare(Person arg0, Person arg1) {
										return arg0.getWeight() - arg1.getWeight();
									}
								}
				);
				
				
				//3
				Collections.sort(list, (arg0, arg1) -> arg0.getWeight() - arg1.getWeight());			

				// thread 1 
				Thread t = new Thread(new MyRunnable());
				t.start();
				
				Thread t1 = new Thread(new Runnable() {

					@Override
					public void run() {
						System.out.println("I am running!");
						
					}
					
				});
				
				new Thread(() ->  System.out.println("I am running!")).start();
				
				TwoImplementor two = new TwoImplementor();
				dothedo( two );
				
				dothedo(new TwoMethodsInterface() {
					
					@Override
					public int do2() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int do1() {
						// TODO Auto-generated method stub
						return 0;
					}
				});
				
				
				
				ImplementBase b = new ImplementBase();
				dothedo2 ( b );
				
				dothedo2( new BaseCoupon() {
					
					@Override
					public void purchase() {

						
					}
				});
				
				//dothedo2( () -> System.out.println("éhello") ); // cannot lambda an abstract class
				
				dothedo3(() -> System.out.println("éhello"));

	}
	
	public static void dothedo(TwoMethodsInterface two)
	{
		two.do1();
		two.do2();
	}
	
	public static void dothedo2(BaseCoupon base)
	{
		base.purchase();
	}
	
	public static void dothedo3(BaseInterface base)
	{
		base.purchase();
	}

}
