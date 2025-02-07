import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        int secim;
        do {
            System.out.println("------İşleminizi seçin------");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. bölme");
            System.out.println("5. çıkış ");
            System.out.println("Seçiminizi giriniz");
            secim=scan.nextInt();

            if(secim==1){
                System.out.println("Toplama işeminizin sonucu: "+ (sayi1 + sayi2)+  " \n-Yardım Edebileceğim farklı bi konu varmı\n");
            }else if(secim==2){
                System.out.println("Çıkarma işleminizin sonucu: " + (sayi1 - sayi2)+  " \n-Yardım Edebileceğim farklı bi konu varmı\n");
            }else if(secim==3){
                System.out.println("Çarpma işleminizin sonucu: " + (sayi1 * sayi2)+  " \n-Yardım Edebileceğim farklı bi konu varmı\n");
            }else if(secim==4){
                System.out.println("Bölme işleminizin sonucu: " + (float) sayi1 / sayi2 +  " \n-Yardım Edebileceğim farklı bi konu varmı\n");
            }else if(secim==5){
                System.out.println("Çıkış yapılıyor");
            }
            else{
                System.out.println("yanlış seçim yaptınız lütfen tekrar deneyiniz");
            }
        }while (secim != 5);

    }
}
