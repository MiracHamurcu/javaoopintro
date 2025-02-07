public class video3 {
    public static void main(String[] args) {
        //variable arguments
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0, 7);
        String yeniMesaj1 = sehirVer();
        int sayi = topla(5, 8);
        int toplam = topla2(20);
        System.out.println(toplam);


        System.out.println(yeniMesaj);
    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    private static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int a, int b) {

        return a + b;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }

    public static String sehirVer() {
        return "Ankara";
    }
}

