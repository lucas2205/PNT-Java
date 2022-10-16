package ejerciciojavapnt.entity;

public class Bebida extends Product{

    private String litres;


    public Bebida(String name, String litres, int price) {
        super(name,price);
        this.litres = litres;
    }

    public void setLitres(String litres) {
        this.litres = litres;
    }

    public String getLitres() {
        return litres;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getName()+" /// Litros: "+this.getLitres()+" /// Precio: $"+ this.getPrice();
    }
}
