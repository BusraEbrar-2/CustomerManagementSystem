
// paket var, burada düzenlemek için kullanıyoruz

public class Main {
    // Başlangıç noktası; Java'da her şey bir sınıf içinde bulunur

    public static void main(String[] args) {
        // Dışarıdan veri alabiliyor demek (String dizi)
        // Java'da programın başlangıç noktası burası
        String text = "vade oranı ";
        Product product1 = new Product();// product1 class , bir clasa veri nasıl atanır
        product1.setName("delon kahve makinesi ");
        product1.setUnitPrice(7500);
        // bu şekilde değer atamaya set value denir
        // get
        // gerçek hayatta bunları oturup böyle yazmıyoruz bir data abse den geliyor
        // veriler
        System.out.println(product1.name);
        // classların ebebvyi objectir bina hastane okul bunların tasarlayan şehir
        // planlayıcısı

        String words[] = { "merhaba", "günaydın", "iyiaksamlar" };
        // string dedim kelime yazmalıyım
        Product products[] = { product1 };
        // product dedim product yazmalıyım
        System.out.println("<ul>"); // html etiketi liste yapmak için
        for (Product product : products) {
            // for each nedir
            // bu eleman diyor ki git products ı tek tek gez
            // niye geziyor ekrana yazmak için
            // product ne peki o da şu = fdgh istediğin şeyi yaz ona takma isim veriyo
            // döngüdeki isimlere 1 2 3 gibi
            System.out.println("<li>" + product.getName() + "</li>"); // liste item listenin bi elemanı
        }
        System.out.println("</ul>"); // ul liste yapıcam
        IndividualCustomer /* fghj */ individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("052222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ ");



        Customer [] customers = {individualCustomer} ;
        // in de cor da bir müşteri 
    } 
}

// angular react wıuw server siyd aspnet php fronted

// veri geliyor 
// veri tabanıyla bağlantılı çalışıyo 
// data access veriye erişim 1.
// gelen dat abana özel gelşcek iş geliştirme business 
// uı ekran sunum 
// farklı yerlerden girsende sepetteki ürün duruyo apı 
// niye böyle bölüyoruz ilk sebep böl parçala yönet ikinci 
// sebep sürdürebilirlik 
// JDBC veri ekle veri çek veri tabaan bağlanma sağlıyor 
// hibernate -ORM 
// JPA bunlar farklı yöntemler 

