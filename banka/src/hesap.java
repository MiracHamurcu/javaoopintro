public class hesap {
    private int tc;
    private int sifre;
    int HesapNo;
    double bakiye;
    String isim;
    String soyIsim;
    String mail;
    String  telNo;
    // değişkenleri oluşturduk.

    public hesap(int tc, int sifre, int HesapNo, double bakiye, String isim, String soyIsim, String mail, String telNo){
        this.tc= tc;
        this.sifre = sifre;
        this.HesapNo = HesapNo;
        this.bakiye= bakiye;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.mail = mail;
        this.telNo=telNo;
        // this ile referans gerçekleştirdik.
    }
    // Yapıcı metodumuzu oluşturduk.
    public int getTc(){
        return tc;
    } // get tc çağırıldığında tc değeri döndürelecek
    public int getSifre(){
        return sifre;
    } // get sifre çağrıldığında sifre değeri döndürlecek
    public void setBakiye(double bakiye){
        this.bakiye=bakiye;
    } // set bakiye ile bakiye tanımlanacak.
    public double getBakiye(){
        return bakiye;
    } // get bakiye kullanıldığında bakiye döndürelecek


}