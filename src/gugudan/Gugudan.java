package gugudan;

import java.util.Iterator;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//5단
//		System.out.println("구구단을 출력할 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number*1);
//		System.out.println(number*2);
//		System.out.println(number*3);
//		System.out.println(number*4);
//		System.out.println(number*5);
//		System.out.println(number*6);
//		System.out.println(number*7);
//		System.out.println(number*8);
//		System.out.println(number*9);
		
		//6단
		int i = 1;
		while(i < 9) {
			System.out.println(6*i);
			i ++;
		}
		//7단
		for(int j = 1; j <10; j++) {
			System.out.println(7*j);
		}
//		System.out.println("구구단을 출력할 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		for (int i = 1; i < 10; i++) {
//			int result = number*i;
//			System.out.println(result);		
//		}
		
	}
}
