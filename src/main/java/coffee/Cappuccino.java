package coffee;

public class Cappuccino extends Coffee{
    private final double coffeePercent = 0.15;
    private final double waterPercent = 0.4;
    private final double milkPercent = 0.45;

    public Cappuccino(double volume){
        coffee = coffeePercent * volume;
        water = waterPercent * volume;
        milk = milkPercent * volume;
    }
}
