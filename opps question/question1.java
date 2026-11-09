class product{
    private int productId;
    private String productName;
    private int price;
    static double discountRate = 10;
    
    public product() {
        this.productName = "";
        this.price = 0;
    }

public product(String productName, int price){
    this.productName = productName;
    this.price = Math.max(price, 0);
}
      public class PriceCalculator{
        public static double getFinalPrice(double originalPrice, double discountPercentage){
            double discountAmount = originalPrice* (discountPercentage/100);
            return originalPrice - discountAmount;
        }
    }

    public static double getFinalPrice(double originalPrice) {
        return PriceCalculator.getFinalPrice(originalPrice, discountRate);
    }

    public String getProductName() {
        return productName;
    }
      public void setProductName(String productName) {
          this.productName = productName;
      }
      public int getPrice() {
          return price;
      }
      public void setPrice(int price) {
          this.price = price;
      }

      public int getProductId() {
          return productId;
      }

      public void setProductId(int productId) {
          this.productId = productId;
      }
      
}

public class question1{
 public static void main(String[] args) {
    product obj = new product();
    obj.setProductName("Laptop");
    obj.setPrice(1000);
    System.out.println("Product Name: " + obj.getProductName() + ", Price: " + obj.getPrice() + ", Final Price: " + product.getFinalPrice(obj.getPrice()));

 }
}