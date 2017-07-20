package assignments;

public class Assignment1 {
	
	public static void main(String args[]) {
		int var1 = 3;
		int var2 = 4;
		
		int resultMain = 0;
		resultMain = multiplication(var1, var2);
		System.out.println("result is : " +resultMain);
		
	}

	private static int multiplication(int var1, int var2) {
		int result = 0;
		result = var1 * var2;
		return result;
		
		
	}

	
	
}
