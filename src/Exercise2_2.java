import java.util.Scanner;

public class Exercise2_2 {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
        System.out.println("Vvedite pervoe celoe chislo");
        int firstNumber = 0;
            if(scanner1.hasNextInt()){
                firstNumber = scanner1.nextInt();
            } else{
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
        System.out.println("Vvedite vtoroe celoe chislo");
        int secondNumber = 0;
            if(scanner1.hasNextInt()){
                secondNumber = scanner1.nextInt();
            } else{
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
        System.out.println("Vvedite simvol operacii");
        Scanner scanner2 = new Scanner(System.in);
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
