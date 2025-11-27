import java.util.Scanner;

public class PozitifNegatifSifir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alma
        System.out.print("Bir sayi girin: ");
        int sayi = input.nextInt();

        // Koşullarla kontrol
        if (sayi > 0) {
            System.out.println("Sayi pozitif.");
        } else if (sayi < 0) {
            System.out.println("Sayi negatif.");
        } else {
            System.out.println("Sayi sıfır.");
        }
    }
}
