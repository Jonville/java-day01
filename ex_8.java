package day1_project;

public class ex_8 {

	public static void main(String[] args) {

		// true and true => true
		// true and false => false
		// true or true => true
		// true or false => true
		
		int a = 20;
		int b = 10;
		System.out.println(a > b | a > 30);		// 뒤에 까지 연산함
		System.out.println(a > b || a > 30);	// 앞에만 계산
		
		System.out.println(a > b || a > 30);
		System.out.println(!(a > b || a > 30));
		
		System.out.println(!false);
		
		
	}

}
