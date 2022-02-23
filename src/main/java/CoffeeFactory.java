import coffee.*;

public class CoffeeFactory {
    public Coffee makeCoffee (Operation type, double volume){
        Coffee coffee = null;

        switch (type){
            case RISTRETTO:
                coffee = new Ristretto(volume);
                break;
            case ESPRESSO:
                coffee = new Espresso(volume);
                break;
            case LUNGO:
                coffee = new Lungo(volume);
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino(volume);
                break;
            case LATTE:
                coffee = new Latte(volume);
                break;
        }

        return coffee;
    }
}
