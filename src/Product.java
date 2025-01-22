//  claslar bu şekilde isimlendrlir PascalCase 
// class dediğin bir şablondur 
// domain alan analmına geliyor ve bir yazılım sistemi hangi alan üzerinde çalışıyor onu gösterir
public class Product {
    // camel case yazılır fieldler
    // bunlar field anlamına geliyor name vs.
   private String name; // product diye bir nesne var içinde bilgi tutmak istiyorum
    private double unitPrice;
    // private sadce o class içind ekullanbilirsin demmkek
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}

//  solid = prensipleri  - sürdürebilirlik 
// inheritance 

