import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Przelicz:");
            System.out.println("1. Celcjusze na Fahrenheity");
            System.out.println("2. Fahrenheity na Celcjusze");
            System.out.println("3. Wyjście");
            int x = s.nextInt();
            if (x == 3){
                break;
            }
            switch (x) {
                case 1:
                    CtoF F = new CtoF();
                    F.CtoF();
                    break;

                case 2:
                    FtoC C = new FtoC();
                    C.FtoC();
                    break;

            }
        }

    }
}