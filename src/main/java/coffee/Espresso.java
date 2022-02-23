package coffee;

public class Espresso extends Coffee{
    private final double coffeePercent = 0.3;
    private final double waterPercent = 0.7;
    private final double milkPercent = 0;

    public Espresso(double volume){
        coffee = coffeePercent * volume;
        water = waterPercent * volume;
        milk = milkPercent * volume;
    }
}
