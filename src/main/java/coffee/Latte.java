package coffee;

public class Latte extends Coffee{
    private final double coffeePercent = 0.1;
    private final double waterPercent = 0.3;
    private final double milkPercent = 0.6;

    public Latte(double volume){
        coffee = coffeePercent * volume;
        water = waterPercent * volume;
        milk = milkPercent * volume;
    }
}
