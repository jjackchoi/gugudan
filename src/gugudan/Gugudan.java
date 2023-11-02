package gugudan;

import java.util.Iterator;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		//6단
//		int i = 1;
//		while(i < 9) {
//			System.out.println(6*i);
//			i ++;
//		}
//		//7단
//		for(int j = 1; j <10; j++) {
//			System.out.println(7*j);
//		}
//		System.out.println("구구단을 출력할 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		for (int i = 1; i < 10; i++) {
//			int result = number*i;
//			System.out.println(result);		
//		}
		//8,9단
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : "+ num);
		if (num<2) {
			System.out.println("값을 잘못 입력했습니다");
		}else if(num > 9) {
			System.out.println("값을 잘못 입력했습니다.");
		}else {
			for(int i = 1; i < 10; i++) {
				System.out.println(num * i);
			}
		}
		
		
	}
}
