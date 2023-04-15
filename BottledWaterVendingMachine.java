import java.util.ArrayList;
import java.util.List;

public class BottledWaterVendingMachine {
    private final List<Product> products;

    public BottledWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if(product instanceof BottleOfWater){
               if(product.getName() == name &&
                       ((BottleOfWater)product).getVolume() == volume) {
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }
}
