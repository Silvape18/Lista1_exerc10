import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double cel;
        double fah; 

        System.out.print("Por Favor, Digite um valor Celsius: ");
        cel = entrada.nextDouble();
        fah = 32 +((cel/5 )*9);
        System.out.print("O valor em Fahrenheit é: " + fah);

         }
}
