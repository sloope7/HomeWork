import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (count<10){
            System.out.println("Vvedite chislo " + (count + 1));
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }else { 	
                System.out.println("Vi vveli neceloe chislo");
                return;
            }
            sum+= number;
            count++;
        }
        System.out.println("Summa chisel " + sum);
	}
}
