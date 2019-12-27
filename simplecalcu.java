// prgramme for additon,substraction,division,multiplication in java
import java.io.*;
class Cal{
	public static void main(String[] args) {
		Console c = System.console();
		int res,choice,num1,num2;
		num1=Integer.parseInt(c.readLine("enter the first number -"));
		num2=Integer.parseInt(c.readLine("enter the second number -"));
		 System.out.println("Enter '1' for addition");
            System.out.println("Enter '2' for subtraction");
            System.out.println("Enter '3' for multiplication");
            System.out.println("Enter '4' for division");
            System.out.println("Enter '5' to Exit");
            choice=Integer.parseInt(c.readLine("choice= "));
            switch(choice){
            	case 1:
            	res=num1+num2;
            	System.out.println("additon = " + res);
            	break;
            	case 2:
            	res=num1-num2;
            	System.out.println("substraction =  " +res);
            	break;
            	case 3:
            	res=num1*num2;
            	System.out.println("multiply = " +res);
            	break;
            	case 4:
            	res=num1/num2;
            	System.out.println("divison = " +res);
            	break;
            	case 5:
            	System.exit(0);
            }
	}
}
