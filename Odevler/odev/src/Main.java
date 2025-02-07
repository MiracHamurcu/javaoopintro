import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Product product1 = new Product(1,"Lenovo v14",15000,"16 GB RAM", 10); // referans oluşturma
     Product product2 = new Product();

     /*
     product2.id = 2;
     product2.name="Lenovo v15";
     product2.unitPrice = 16000;
     product2.detail =  "20 gb ram";
     product2.discount = 10;
     product2.unitPriceAfterDiscount = 14400; // bunu biz tanımlayamayız bunu get ile alacağız hesaplayıp.
     indirimden sonraki fiyatı
     -- private tanımladığımız için fieldları kullanamıyoruz. bu nedenle set ile tanımlayacağız:
     */
    product2.setId(2);
    product2.setName("Lenovo v15");
    product2.setUnitPrice(16000);
    product2.setDetail("20 gb ram");
    product2.setDiscount(10);

        System.out.println(product2.getUnitPriceAfterDiscount());

    Category category1 = new Category();
    category1.setId(1);
    category1.setCategoryName("Yiyecek");

    Category category2 = new Category(2, "İçecek");

        System.out.println(category1.getCategoryName());
        System.out.println(category2.getCategoryName());
// örnek olarak tek tek hepsinin sonuna ! koymak yerine get metoduna koyduk ve bu işlemi tek bir yerde halletik.
    }
}