public class BottleOfSoda extends Product{
    private double volume;
    private double sugarPersentage;

    public BottleOfSoda(String name, double price, double volume, double sugarPersentage){
        super(name, price);
        this.volume = volume;
        this.sugarPersentage = sugarPersentage;
    }

    public double getSugarPersentage() {
        return sugarPersentage;
    }

    public void setSugarPersentage(double sugarPersentage) {
        this.sugarPersentage = sugarPersentage;
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
        return String.format("%s - %s - %f - %f - %f", brand, name, price, volume, sugarPersentage);
    }
}
