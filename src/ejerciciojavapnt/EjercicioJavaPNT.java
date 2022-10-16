
package ejerciciojavapnt;

import ejerciciojavapnt.entity.Product;
import ejerciciojavapnt.util.Data;

import java.util.ArrayList;

public class EjercicioJavaPNT {
    
    public static void main(String[] args) {
        
        ArrayList<Product> Stock = Data.loadData();
        
        Data.showData(Stock);
        
    }
}
