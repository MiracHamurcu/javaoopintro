import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        sayiBul();
        mesajVer("Kod çalıştı");
    }
    public static void sayiBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int aranan = scanner.nextInt();
        int[] sayilar = {1, 2, 3, 4, 5, 6};
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            System.out.println("Aranan sayı dizide mevcut");
        } else {
            System.out.println("Sayi Yok");
        }
    }

    public static void mesajVer(String mesaj) {

        System.out.println("Mesaj: " + mesaj);
    }
}
