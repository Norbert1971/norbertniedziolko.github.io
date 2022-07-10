import java.util.Scanner;

public class OperatoryPorownania {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int firstNumber = scanner.nextInt();
           //  Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int secondNumber = scanner.nextInt();
           //  int result = firstNumber * firstNumber;
           // int result = firstNumber * firstNumber;
           // int firstNumber =4;
           // int secondNumber =6;
        boolean result = firstNumber < secondNumber;
        System.out.println(result);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);







    }


}
