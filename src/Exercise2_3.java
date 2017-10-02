import java.util.Scanner;

public class Exercise2_3 {

	public static void main(String[] args) {
		    Scanner scanner1 = new Scanner(System.in);
	        Scanner scanner2 = new Scanner(System.in);
	        System.out.println("Vvedite pervoe chislo");
	        double firstNumber = scanner1.nextDouble();
	        System.out.println("Vvedite vtoroe chislo");
	        double secondNumber = scanner1.nextDouble();
	        System.out.println("Vvedite simvol operacii");
	        String symbol = scanner2.nextLine();
	        switch (symbol){
	            case "+":{
	                System.out.println(firstNumber + secondNumber);
	                break;
	            }
	            case "-":{
	                System.out.println(firstNumber - secondNumber);
	                break;
	            }
	            case "*":{
	                System.out.println(firstNumber * secondNumber);
	                break;
	            }
	            case "/":{
	                System.out.println(firstNumber / secondNumber);
	                break;
	            }
	            default:{
	                System.out.println("Vi vveli nevernii simvol operacii");
	            }
	        }

	}

}
