import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarıçap alma
        System.out.print("Dairenin yaricapini girin: ");
        double r = input.nextDouble();

        // Alan hesaplama (A = π * r * r)
        double alan = Math.PI * r * r;

        // Sonuç gösterimi
        System.out.println("Dairenin alani: " + alan);
    }
}
