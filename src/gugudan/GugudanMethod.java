package gugudan;

public class GugudanMethod {

	//메소드로 구구단구현
	/*해당 함수에서 int[]는 반환받는 타입이며 calculate(-)에서 -부분은 값을 집어넣는 지역변수의 타입을 지정*/
	public static int[] calculate(int times){
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void printGugudan(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++){
			int[] result = calculate(i);
			printGugudan(result);
		}
	}
}
