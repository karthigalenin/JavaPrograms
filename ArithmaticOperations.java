package ArithmaticApp;

public class ArithmaticOperations {
	
	private int firstNumber;
	private int secondNumber;

	public static void main(String[] args) {
		
		ArithmaticInterface calc = new ArithmaticImpl();
		
		calc.add(10,20);
		
	}

}
