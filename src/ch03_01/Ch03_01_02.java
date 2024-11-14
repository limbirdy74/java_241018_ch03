package ch03_01;

public class Ch03_01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;  // a = a + 1
		System.out.println(a);
		++a;  // a = a + 1
		System.out.println(a);
		
		int i = 10;
		int j = 10;
		int result1;
		result1 = ++i + 1;  // 12. 증감연산자가 앞에 있으면 우선순위가 높아서 먼저 계산된다.
		int result2;
		result2 = j++ + 1;  // 11. 증감연산자가 뒤에 있으면 우선순위가 낮아져서 나중에 계산된다
		
		System.out.println(result1);  // 12  
		System.out.println(result2);  // 11
		System.out.println(i);  // 11
		System.out.println(j);  // 11
		
		String str1 = "korea" + 10;
		System.out.println(str1);  // korea10. 문자열로 바뀌면서 뒤에 붙음
	}

}
