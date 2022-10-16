package ejerciciojavapnt.entity;

public class Fruta extends Product{

    private String unit;

    public Fruta(String name, int price, String unit) {
        super(name,price);
        this.unit = unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getName()+" /// Precio: $"+this.getPrice()+" /// Unidad de venta: "+ this.getUnit();
    }

}
