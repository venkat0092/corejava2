public class Product {
    private  double price;

    public double getPrice() {
        return price;
    }
    public double getPrice(int quantity){
        return price*quantity;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product product = new Product();
         product.setPrice(60.6);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(2));
    }
}
