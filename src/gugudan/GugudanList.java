package gugudan;

public class GugudanList {
	public static void main(String[] args) {
		int[] result = new int[9];
		for(int j=2; j<10; j++) {
			for(int i=0; i<result.length; i++) {
				result[i] = j*(i+1);
				System.out.println(result[i]);
			}
		}
		
		
//		for(int i = 0; i<result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		int[] result3 = new int[9];
//		for(int i=0; i<result3.length; i++) {
//			result3[i] = 3*(i+1);
//		}
//		for(int i = 0; i<result3.length; i++) {
//			System.out.println(result3[i]);
//		}
//		
//		int[] result4 = new int[9];
//		for(int i=0; i<result4.length; i++) {
//			result4[i] = 4*(i+1);
//		}
//		for(int i = 0; i<result4.length; i++) {
//			System.out.println(result4[i]);
//		}
	}
}
