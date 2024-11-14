package ch03_01;

public class Ch03_01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		
		System.out.println(10 > a);  // true
		System.out.println(10 > a && 5 < a);  // false
		System.out.println(10 > a || 5 < a);  // true
		System.out.println(10 > a ^ 5 < a);   // true
		System.out.println(10 > a ^ 5 > a);   // false
		System.out.println(!(10 > a ^ 5 > a));   // true
			

	}

}
