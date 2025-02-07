public class CustomerManager {
    // extend demeseydik classları kullanamazdık genişlettik.
    public void add(Customer customer){

        System.out.println(customer.customerNumber + "Kaydedildi");
    }
    // SOLID - Open closed principle : sisteme yeni özellik eklendiğinde mevcutaa bulunan hiçnir kodu değişemezsin sadece yeni kod eklersin.

    //bulk insert bütün verileri vs. bir kerede göndermek istiyoruz
    public void AddMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }
}
