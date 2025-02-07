import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // scannerı tanımladık
    hesap hesap1 = new hesap(1234567890,123456,123456789,1500,"Ahmet", "Yılmaz","ahmet@gmail.com","0543 384 03 86"); 
    // değerleri verdik
    int denemehakki=0; // deneme hakkını 0 dan başlattık 3 kere deneyebilecek toplam.
    int hak=2; // kaç hakkının kaldığını görmesi için bir değişken daha tanımladık
        System.out.println("Hoşgeldiniz.");
        while (denemehakki <= 2) // 0 dan 2 ye kadar gelecek ve döngü kapanacak.
        {
        System.out.println("Tc giriniz:");
        long tc = scanner.nextInt(); // tc aldık
        System.out.println("Şifre giriniz:");
        int sifre = scanner.nextInt(); // şifre aldık
        if (tc == hesap1.getTc() && sifre == hesap1.getSifre()) // tc ve şifre kontrol ediliyor. && kullandık 2 sorgunun da doğru olması lazım.
        {
            denemehakki = 3; // eğer işlem başarılı ise döngüden çıkması için 3 yaptık
            islemler(hesap1, scanner); // işlemleri methodunu çağırdık tc ve şifre doğru
        }
        else {
            System.out.println("TC veya Şifre hatalı.");
            denemehakki++;
            System.out.println("Kalan Deneme Hakkı :  " +hak--); // kaç hakkının kaldığını gösterdik
        }
    }

    }
    public static void islemler(hesap hesap1, Scanner scanner){ // işlemleri yapacağımız metodu oluşturduk
        System.out.println("Merhaba! "+hesap1.isim+" "+hesap1.soyIsim);
        int islem;
        do {
            System.out.println("-----------");
            System.out.println("Yapmak istediğiniz işlemi seçiniz. \n Para yatırma: 1 \n Para çekme: 2 \n Bakiye sorgulama: 3 \n Hesap bilgileri: 4 \n Çıkış: 5");
            islem = scanner.nextInt(); // isleme değer aldık.
          switch (islem)
          {
              case 1 -> {
                  // eğer 1 seçilirse dedik.
                  System.out.println("Bakiyeniz "+hesap1.getBakiye()); // get ile bakiyeyi ekrana yazdırdık
                  System.out.println("Yatırmak istediğiniz tutarı girin.");
                  int tutar = scanner.nextInt();
                   tutar += hesap1.getBakiye();
                   hesap1.setBakiye(tutar); // girilen tutarı tanımladık
                  System.out.println("Para yatırma işlemi gerçekleşti yeni bakiyeniz: "+hesap1.getBakiye()); // yeni bakiyeyi yazdırdık
              }
              case 2-> {
                  // eğer 2 deçilirse
                  System.out.println("Bakiyeniz "+hesap1.getBakiye()); //bakiyeyi yazdırdık
                  System.out.println("Not: Günlük en fazla 1500₺ çekebilirsiniz!");
                  System.out.println("Çekmek istediğiniz tutarı girin.");
                  double cekilcektutar = scanner.nextDouble();
                  //cekilecek tutarı aldık.
                  if(cekilcektutar > 1500){ //eğer cekilecek tutar 1500 üstü ise çekilemez dedik
                      System.out.println("Günlük 1500₺ üstünü çekemezsiniz.");
                  } else if (cekilcektutar > hesap1.getBakiye()) { // ve yine eğer çekilecek tutar bakiyeden fazlaysa çekilemez uyarısı verdik.
                      System.out.println("Hesabınızda yeteri kadar para bulunmamaktadır. \n Bakiyeniz: "+hesap1.getBakiye());
                  }
                  else{ // eğer 2 şartta uygun değilse bu kodumuz çalışacak ve çıkarma işlemi gerçekleşecek
                      hesap1.setBakiye(hesap1.getBakiye() - cekilcektutar); // bakiyemizi aldık ve çekilecek tutardan çıkardık. ve bunu set ile direkt tanımladık
                      System.out.println("Para çekme işlemi gerçekleşti yeni bakiyeniz: "+hesap1.getBakiye()); // yeni bakiyeyi yazdırdık
                  }
              }
              case 3 ->{
                  System.out.println("Bakiyeniz: "+hesap1.getBakiye()); // bakiye sorgulama işlemi yaptık
              }
              case 4 ->{
                  listele(hesap1); // listeleme metodunu çağırdık ve nesne 1 i yolladık.
              }
              case 5->{
                  System.out.println("Çıkış yapılıyor"); // 5i seçerse ekrana cıkıs yapılıyor yazdırdık

              }
              default -> System.out.println("1-2-3-4-5 harici seçim yapmayınız."); // hatalı seçim.
          }
        }while (islem != 5); // eğer 5 dışında ise döngü devam edecek.

    }
    public static void listele(hesap hesap1) {
        hesap[] hesaplar = {hesap1}; // hesabı dizimize ekledik
        for (hesap hesap : hesaplar) {
            {
                System.out.println("Tc: "+hesap.getTc());
                System.out.println("Hesap no: "+hesap.HesapNo);
                System.out.println("İsim: "+hesap.isim);
                System.out.println("Soyisim: "+hesap.soyIsim);
                System.out.println("E posta: "+hesap.mail);
                System.out.println("Telefon numarası: "+hesap.telNo);
            }
        // diziler içinde döngü açtık  ve listeleme işlemini gerçekleştirdik
        }

    }
}