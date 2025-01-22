

public class Customer {
    private int id;
    private String customerNumber;
    private String phone;

    // üzerinde matematiksel işlem yapmıyorum o yzdn string
    // veri iletişimi farklı sistemlerle yapılıyo veri uyuşmazlığı olmasın diye
    // gbt den baktım şu konumda string kullanmak intten çok daha mantıklı
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
