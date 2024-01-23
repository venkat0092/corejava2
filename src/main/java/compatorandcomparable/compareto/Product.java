package compatorandcomparable.compareto;
import java.util.Arrays;

public class Product implements Comparable<Product>{
    private int weight;
    private int price;
    private int id;

    Product(int weight,int price, int id){
        this.weight = weight;
        this.price = price;
        this.id = id;


    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice())return 1;
        else if (this.price <o.getPrice()) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(100,20,30),
                new Product( 61,89,79),
                new Product( 70,60,21),
                new Product( 21,23,32),
        };

        Arrays.sort(products);
        for(Product product : products) {
            System.out.println(product.getId() + ", "+ product.getPrice() + ", " + product.getWeight());
        }

    }
}
