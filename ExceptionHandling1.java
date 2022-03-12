package InClassWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String [] args)
	{
		//read input from user
		int num1 = 10, num2;
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter the denominator ");

		
		try {
			num2 = kb.nextInt();//it has to start from when user enteres input
			int result = num1/num2;
			System.out.print(num1/num2);
		} catch (Exception e) //catch all block -
		//catch block is examined in sequence 
		{
			System.out.print(e.getMessage());
		}
//		catch (InputMismatchException e)
//		{
//			System.out.print("Wrong input\n" + e.getMessage());
//		} 
//		catch (ArithmeticException e)
//		{
//			System.out.print("Wrong input 2\n" + e.getMessage());
//		} 
		//enter 0 for num2
	}
}
