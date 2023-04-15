public class Product {
    protected String name;
    protected String brand;
    protected double price;

    /**
     * Узнать нфо о продукте
     * @return Информация продукта
     */
    String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }

    public Product(){
        this("продукт");
    }

    public Product(String name){
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, double price){
        this("Noname", name, price);
    }

    public Product(String brand, String name, double price){

        if(brand.length()<3)  this.brand = "brand";
        else  this.brand = brand;

        if(name.length()<3) this.name = "name";
        else this.name = name;

        if(price<=0) this.price = 1;
        else this.price = price;
    }
}
