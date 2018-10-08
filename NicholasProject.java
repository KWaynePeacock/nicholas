package nicholasProject;

public class NicholasProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator1 = -1;
		int numerator2 = -1;
		int denominator1 = -1;
		int denominator2 = -1;
		System.out.println(addThem(3,4,1,2));
	}
	
	public static String addThem(int num1, int den1, int num2, int den2) {
		int newDenom = den1 * den2;
		int newNum1 = den2 * num1;
		int newNum2 = den1 * num2;
		int addResult = newNum1 + newNum2;
		String returnValue = addResult + "/" + newDenom;
		return returnValue;
	}
	

}
