public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int sum = first + second;
		int dif = first - second;
		int mult = first * second;
		int dev = first / second;
		System.out.println("Sum = " + sum);
		System.out.println("Dif = " + dif);
		System.out.println("Mult = " + mult);
		System.out.println("Dev = " + dev);
		
	}
}