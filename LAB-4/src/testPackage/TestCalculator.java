package testPackage;
import mypackage.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		int sum=calc.add(10,5);
		int difference=calc.subtract(10, 5);
		System.out.println("Sum: "+sum);
		System.out.println("Differnce: "+difference);
		
		

	}

}
