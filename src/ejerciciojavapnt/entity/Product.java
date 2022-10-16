

package ejerciciojavapnt.entity;


public class Product implements Comparable<Product>{
 
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
  public int compareTo(Product p) {
    
    if (this.getPrice() > p.getPrice()) {
          return 1;
    }else if (this.getPrice()< p.getPrice()) {
          return -1;
    }else {
          return 0;
    }
  }
}
