# CustomerManagementSystem
 Java ile geliştirilmiş, nesne yönelimli programlama prensiplerini (kalıtım, kapsülleme, sınıf organizasyonu) örnekleyen temel bir müşteri yönetim sistemi. Proje, bireysel müşteriler ve ürünler için sınıflar içerir ve verilerin işlenmesi ile müşteri yönetiminin gösterildiği bir ana sınıf barındırır.
# Müşteri Yönetim Sistemi

Bu proje, temel nesne yönelimli programlama prensiplerini göstermek amacıyla Java kullanılarak geliştirilmiş basit bir müşteri yönetim sistemidir. Proje kapsamında bireysel müşteriler ve ürünlerin yönetimi için sınıflar bulunmaktadır. Ayrıca, verilerin nasıl işlendiğini ve müşteri yönetiminin nasıl yapıldığını gösteren bir ana sınıf yer almaktadır.

## Proje İçeriği

### Sınıflar:
1. **Product**: Ürünlerin adını ve birim fiyatını yönetmek için oluşturulmuş bir sınıf.
2. **IndividualCustomer**: Bireysel müşterilere ait ad, soyad, telefon ve müşteri numarası gibi bilgileri yönetir.
3. **Main**: Sistemin başlangıç noktası. Ürün ve müşteri bilgilerinin yönetimi ve çıktıların ekrana yazdırılmasını içerir.

## Kullanılan Teknikler
- Nesne yönelimli programlama (OOP) prensipleri:
  - **Encapsulation**: Alanlar (field) `private` olarak tanımlanmış ve `getter` ile `setter` metodları kullanılmıştır.
  - **Inheritance**: `IndividualCustomer` sınıfı, müşteri sınıfından türetilmiştir.
- Temel Java dil özellikleri:
  - Döngüler (`for-each` kullanımı).
  - Konsola veri yazdırma (`System.out.println`).
  - Veri yapıları (dizi kullanımı).

## Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza indirin veya klonlayın:
   ```bash
   git clone // github linki
