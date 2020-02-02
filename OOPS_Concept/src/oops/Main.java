package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Porsche = new Car();
		//Porsche = null;
		Car Honda = new Car();
		
		System.out.println("Model is " + Porsche.getmodel() );
		
		Porsche.setmodel("123");
		
		System.out.println("Model is " + Porsche.getmodel() );

	}

}
