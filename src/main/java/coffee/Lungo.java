package coffee;

public class Lungo extends Coffee{
    private final double coffeePercent = 0.15;
    private final double waterPercent = 0.85;
    private final double milkPercent = 0;

    public Lungo(double volume){
        coffee = coffeePercent * volume;
        water = waterPercent * volume;
        milk = milkPercent * volume;
    }
}
