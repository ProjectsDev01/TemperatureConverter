import java.util.Scanner;
public class FtoC {

    public static void FtoC(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperaturę w Fahrenheitach: ");
        float F = scan.nextFloat();
        float C = (float) (5.0/9.0) * (F - 32);
        System.out.println("Temperatura w Celcjuszach wynosi: " + C);
    }
}
