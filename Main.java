import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        BottleOfWater bottle1 = new BottleOfWater("Water Me", 100, 1);
        System.out.println(bottle1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Вода", 100, 1.5);
        Product bottleOfWater3 = new BottleOfWater("Вода3", 130, 1.3);
        Product bottleOfWater4 = new BottleOfWater("Вода4", 140, 2);
        Product bottleOfWater5 = new BottleOfWater("Вода5", 150, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 85,1.5);

        Product bottleOfSoda1 = new BottleOfSoda("Soda1", 150, 1, 4.5);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfSoda1);

        BottledWaterVendingMachine machine = new BottledWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes = machine.getBottleOfWater("Вода", 1.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        } else {
            System.out.println("Такой бутылки с вобой нет в автомате.");
        }
    }
}