package java;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers=new int[6];
		int result=0;
		numbers[0]=63;
		numbers[1]=46;
		numbers[2]=13;
		numbers[3]=41;
		numbers[4]=82;
		numbers[5]=4;
		
		for(int i=0; i<numbers.length; i++) {
			result += numbers[i];
			
		}
		System.out.println(result);
	}

}
