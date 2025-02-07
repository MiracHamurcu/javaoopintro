import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 2000;

        System.out.println("Hoş geldiniz bakiyeniz: "+bakiye);
        System.out.println("1 = Para yatırma");
        System.out.println("2 = Para çekme");
        System.out.println("3 = Bakiye sorgulama");
        System.out.println("4 = Çıkış");
        System.out.println("Hangi işlemi yapmak istersiniz? ");

        int secim = scan.nextInt();

        switch (secim){
            case 1:
                System.out.print("Ne kadar yatırmak istersiniz: ");
                int yatirilacakpara = scan.nextInt();
                bakiye += yatirilacakpara;
                System.out.println("Yeni bakiyeniz: " +bakiye);
                break;
            case 2:
                System.out.print("Ne kadar çekmek istersiniz: ");
                int cekilecekpara = scan.nextInt();
                bakiye -= cekilecekpara;
                System.out.println("Yeni bakiyeniz: " +bakiye);
                break;
            case 3:
                System.out.println("Hesapınızdaki para: "+bakiye);
                break;
            case 4:
                System.out.println("Çıkış yapılıyor.");
                break;
            default:
                System.out.println("Yanlış işlem seçtiniz. 1-2-3-4 şeklinde giriniz.");
                break;
        }
    }
}