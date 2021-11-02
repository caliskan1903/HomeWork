package java;

public class Array2 {

	public static void main(String[] args) {
		
		String [] animals=new String[6];
		animals[0]="bear";
		animals[1]="eagle";
		animals[2]="panda";
		animals[3]="bee";
		animals[4]="dog";
		animals[5]="fish";
		
		for(int i=0; i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println("-----------------------------------");
		
		for(String animal :animals) {
			System.out.println(animal);
		}
// TODO Auto-generated method stub

	}

}
