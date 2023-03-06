package day1_project;

public class ex_6 {

	public static void main(String[] args) {

		int a = 10;
		a++;
		System.out.println("a++ : " + a);
		
		int b = 10;
		b += 1;
		System.out.println("b += 1 : " + b);
		
		int c = 10;
		c = c + 1;
		System.out.println("c = c + 1 : " + c);
		
		// 증감연산자
		
		int num1 = 10;
		int num2 = num1++;
		System.out.println(num2);		// 10
		
		int num3 = --num2;
		System.out.println(num2);		// 9
		System.out.println(num3);		// 9
		
		int num4 = num3++;
		System.out.println(num3);		// 10
		System.out.println(num4);		// 9
		
		
	}

}
