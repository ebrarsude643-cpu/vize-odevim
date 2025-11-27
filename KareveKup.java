import java.util.Scanner;

public class KareVeKup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alma
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        // Kare ve küp hesaplama
        int kare = sayi * sayi;
        int kup = sayi * sayi * sayi;

        // Sonuçları gösterme
        System.out.println("Sayının karesi: " + kare);
        System.out.println("Sayının küpü: " + kup);
    }
}
