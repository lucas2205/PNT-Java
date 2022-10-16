package ejerciciojavapnt.entity;

public class Shampoo extends Product{

    private String content;

    public Shampoo(String name, String content, int price) {
        super(name,price);
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getName()+" /// Contenido: "+this.getContent()+" /// Precio: $"+ this.getPrice();
    }
}
