public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, double price, double volume){
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - %f", brand, name, price, volume);
    }
}
