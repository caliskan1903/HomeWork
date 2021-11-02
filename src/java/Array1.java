package java;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] cars = {"merco" ,"bmw","mazda","audi","toyota"};
		for(String automotive:cars) {
			System.out.println(automotive);
		}
		System.out.println("-----------------------");
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}
