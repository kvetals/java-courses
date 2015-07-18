import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Enter first number: ");
				String first = reader.next();
				System.out.println("Enter second number: ");
				String second = reader.next();
				calc.add(Integer.valueOf(first)+Integer.valueOf(second));
				System.out.println("Sum = " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit? If \"Yes\" type \"yes\"");
				exit = reader.next();
			}
		}finally{
				reader.close();
		}
	}
}