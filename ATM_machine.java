package program;
import java.util.Random;
import java.util.Scanner;
public class ATM_machine {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Random ran=new Random();
		 int num=ran.nextInt(4); 
		 System.out.println("Enter the pin :");
		 int pin=sc.nextInt();

		 
		 if(num==pin) {
			
		 int balance=500000;
		
		 while(true) {
			 System.out.println("Automated Teller Machine");
			 System.out.println("Choose 1 for withdrawl");
			 System.out.println("Choose 2 for deposit");
			 System.out.println("Choose 3 for Balance");
			 System.out.println("Exit");
		 
			 int ch=sc.nextInt();
			 switch(ch) {
			 case 1: 	System.out.println("Enter money to be withdrawn :");
			 			int withdraw=sc.nextInt();
			 			if(balance>=withdraw) {
			        	balance=balance-withdraw;
			        	System.out.println("Please collect the  money");
			 			}
			         else {
			        	 System.out.println("Insufficient balance"); 
			         	}
				       break;
			 case 2: 	System.out.println("money to deposit");
			     		int deposit=sc.nextInt();
			     		balance=balance+deposit;
			     		System.out.println("your money deposit successfully");
			     		break;
			       
			 case 3: 	System.out.println("check balance "+balance);
			 			break;
			 			
			 case 4:	System.exit(0);			
			 
			 }

		 }
		
	}
		 
		 else {
			 System.out.println("Incoorect Pin :");
		 }

	}
}
