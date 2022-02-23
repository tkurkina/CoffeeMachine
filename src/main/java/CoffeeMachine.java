import coffee.Coffee;
import exceptions.EmptyBowlsException;

public class CoffeeMachine {
    private double coffeeBowlVolume;
    private double waterBowlVolume;
    private double milkBowlVolume;

    public CoffeeMachine(int coffeeBowlVolume, int waterBowlVolume, int milkBowlVolume) {
        this.coffeeBowlVolume = coffeeBowlVolume;
        this.waterBowlVolume = waterBowlVolume;
        this.milkBowlVolume = milkBowlVolume;
    }

    public int getCoffeeBowlVolume() {
        return (int)coffeeBowlVolume;
    }

    public int getWaterBowlVolume() {
        return (int)waterBowlVolume;
    }

    public int getMilkBowlVolume() {
        return (int)milkBowlVolume;
    }

    public void addCoffee(double coffeeVolume) {
        this.coffeeBowlVolume += coffeeVolume;
    }

    public void addWater(double waterVolume) {
        this.waterBowlVolume += waterVolume;
    }

    public void addMilk(double milkVolume) {
        this.milkBowlVolume += milkVolume;
    }

    private void pourCoffee(double coffeeVolume) {
        this.coffeeBowlVolume -= coffeeVolume;
    }

    private void pourWater(double waterVolume) {
        this.waterBowlVolume -= waterVolume;
    }

    private void pourMilk(double milkVolume) {
        this.milkBowlVolume -= milkVolume;
    }

    public void makeCoffee (Operation type, double volume) throws EmptyBowlsException {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.makeCoffee(type, volume);

        if(coffee.getCoffee() > coffeeBowlVolume || coffee.getMilk() > milkBowlVolume || coffee.getWater() > waterBowlVolume){
            throw new EmptyBowlsException("Резервуары недостаточно заполнены для приготовления кофе!");
        }

        pourCoffee(coffee.getCoffee());
        pourMilk(coffee.getMilk());
        pourWater(coffee.getWater());
    }
}
