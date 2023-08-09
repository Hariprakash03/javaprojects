package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shape=new ShapeFactory();
		//shape.printArea(shape, 2, 4);
		
		//lambda
		//shape.printArea((double x,double y)->System.out.println("Area using lambda"+(Math.PI*x*y))), 4, 5);
		shape.printArea((double x,double y)->{System.out.println("Area using lambda"+(Math.PI*x*y));
		return (Math.PI*x*y);
		}, 4, 5);

		
		

	}

}
