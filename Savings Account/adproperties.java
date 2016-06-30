
public class adproperties {

	public static void main(String[] args) {

		
		SavingsAccount mySavings = new SavingsAccount();
		mySavings.accountNo = 12345678;
		mySavings.balance = 4588;
		mySavings.pin = 3369;
		mySavings.status = "active";
		mySavings.dateOfOpening = "2/21/2016";
		mySavings.branch = "Towson";
		System.out.println("Account No:"+mySavings.accountNo);
		System.out.println("Balance:"+mySavings.balance);
		System.out.println("Pin:"+mySavings.pin);
		System.out.println("Status:"+mySavings.status);
		System.out.println("Date of Opening:"+mySavings.dateOfOpening);
		System.out.println("Branch:"+mySavings.branch);

	}

}
