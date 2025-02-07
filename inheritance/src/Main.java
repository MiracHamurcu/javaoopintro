public class Main {
    public static void main(String[] args) {
        BireyselMusteri mirac = new BireyselMusteri();
        mirac.customerNumber = "12345";

        KurumsalMusteri hepsiburada = new KurumsalMusteri();
        hepsiburada.customerNumber="678899";

        CustomerManager customerManager = new CustomerManager();


        customerManager.add(mirac);
        // polimorfizm: extend ettiğimiz sınıfların referanslarını tutabilir.
        // örneğini iki ayrı metod yazmıştık ve kurumsal ile bireyseli ayırmıştık ama hepsini sadece extend ettiğimiz customer sınıfını kullanarak yapabildik
        // Customer[] customers = {hepsiburada, mirac};
     //   customerManager.AddMultiple(customers);
    }
}
// override etmek. üzerine yazmak:  extend edilen sınıfda zaten olan birşeyi extend ettiğimiz sınıfda kullanma.