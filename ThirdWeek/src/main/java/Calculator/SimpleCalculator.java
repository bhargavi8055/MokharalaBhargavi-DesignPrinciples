package Calculator;



import java.util.Scanner;

public class SimpleCalculator extends Operations{
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		double res=0;
		
		while(true) {
		try {
			System.out.println("Enter your choice");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod ");
			System.out.println("6.exit");
			String choice1=scan.next();
			int choice=Integer.parseInt(choice1);
			if (choice!=1 &&choice!=2&&choice!=3&&choice!=4&&choice!=5&&choice!=6) {
				System.out.println("please enter a valid choice");
				continue;
			}
			
			if(choice==6) {
				System.out.println("You are exited");
				break;
			}
			int a = 0,b = 0;
			try {
				System.out.println("Enter the first number");
				String a1=scan.next();
				 a=Integer.parseInt(a1);
				System.out.println("Enter thr second number");
				String b1=scan.next();
				
				 b=Integer.parseInt(b1);
			}
			catch(Exception e) {
				System.out.println("please enter valid numbers");
				continue;
			}
			Operations ob=new Operations();
			
			
			if (choice==1){
				res=ob.add(a, b);
				System.out.println("The addition of two numbers is:"+res);
				break;
			}
			else if(choice==2) {
				res=ob.sub(a, b);
				System.out.println("The subtraction of two numbers is:"+res);
				break;
			}
			else if(choice==3) {
				res=ob.mul(a, b);
				System.out.println("The multiplication of two numbers is:"+res);
				break;
			}
			else if(choice==4) {
				res=ob.div(a, b);
				System.out.println("The division of two numbers is:"+ res);
				break;
			}
			else if(choice==5) {
				res=ob.mod(a, b);
				System.out.println("The modular division of two numbers is:"+ res);
				break;
			}
			
			System.out.println("invalid choice");
		 }
		catch(Exception e) {
			System.out.println("Please enter a valid choice to perform operation");
			
			
		}
		}
		
		
		
		
		
	}
	
}

