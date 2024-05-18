package pack2;

import pack1.Circle;

public class Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		System.out.println(c1.getArea());
		System.out.println(c1.toString());		
		
		Circle c2 = new Circle(5);
		System.out.println(c2.getArea());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
				

	}

}
