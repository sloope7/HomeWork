import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Vvedite pervoe celoe chislo");
        int firstNumber = scanner1.nextInt();
        System.out.println("Vvedite vtoroe celoe chislo");
        int secondNumber = scanner1.nextInt();
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
