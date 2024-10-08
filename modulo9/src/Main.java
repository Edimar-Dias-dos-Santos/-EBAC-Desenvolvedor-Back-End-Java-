import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro primitivo:");
        int integerNumber = scanner.nextInt();

        Integer wrappedNumber = integerNumber;
        System.out.println(wrappedNumber);
    }
}