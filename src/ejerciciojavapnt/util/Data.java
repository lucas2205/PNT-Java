package ejerciciojavapnt.util;

import ejerciciojavapnt.entity.Bebida;
import ejerciciojavapnt.entity.Fruta;
import ejerciciojavapnt.entity.Product;
import ejerciciojavapnt.entity.Shampoo;

import java.util.ArrayList;
import java.util.Collections;

public class Data {

    public static ArrayList<Product> loadData(){

        ArrayList<Product> Stock = new ArrayList();

        Product product1 = new Bebida("Coca-Cola","1.5",18);
        Product product2 = new Bebida("Coca-Cola Zero","1.5",20);
        Product product3 = new Shampoo("Shampoo Sedal","500ml",19);
        Product product4 = new Fruta("Frutillas",64,"kilo");

        Stock.add(product2);
        Stock.add(product1);
        Stock.add(product3);
        Stock.add(product4);

        return Stock;
    }

    public static void showData(ArrayList<Product> Stock){

        Stock.stream().forEach(p -> { System.out.println(p.toString());});

        System.out.println("=============================");

        Collections.sort(Stock);
        System.out.println("Producto más caro: "+Stock.get(Stock.size() -1 ).getName() +
                "\nProducto más barato: " + Stock.get(0).getName());
    }



}
