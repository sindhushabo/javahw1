package hw1;

public class testcase {

	public static void main(String[] args) {
		
		char ch = '1';
		
		if (Character.isUpperCase(ch)) {
			
			System.out.println("The letter is in upper case");
						
		}
		else if (Character.isLowerCase(ch)){
			
			System.out.println("The letter is in lower case");
		}
		else {
			
			System.out.println("The character entered is not an alphabet");
			
		}

	}

}
