package coffee;

public class Ristretto extends Coffee{
    private final double coffeePercent = 0.5;
    private final double waterPercent = 0.5;
    private final double milkPercent = 0;

    public Ristretto(double volume){
        coffee = coffeePercent * volume;
        water = waterPercent * volume;
        milk = milkPercent * volume;
    }


}
