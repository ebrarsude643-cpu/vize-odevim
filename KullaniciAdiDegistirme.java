import java.util.Scanner;

public class KullaniciAdiDegistirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mevcut kullanıcı adı
        String kullaniciAdi = "admin";

        System.out.println("Mevcut kullanici adi: " + kullaniciAdi);

        // Yeni kullanıcı adı alma
        System.out.print("Yeni kullanici adini girin: ");
        String yeniAdi = input.nextLine();

        // Kullanıcı adını değiştirme
        kullaniciAdi = yeniAdi;

        System.out.println("Kullanici adi basariyla degistirildi!");
        System.out.println("Yeni kullanici adi: " + kullaniciAdi);
    }
}
