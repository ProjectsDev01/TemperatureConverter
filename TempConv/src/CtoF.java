import java.util.Scanner;

public class CtoF {

    public static void CtoF(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperaturę w Celcjuszach: ");
        float C = scan.nextFloat();
        float F = (float) ((9.0/5.0)*C + 32);
        System.out.println("Temperatura w Fahrenheitach wynosi: " + F);
    }
}
