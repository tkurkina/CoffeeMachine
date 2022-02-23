import exceptions.EmptyBowlsException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        if (args.length != 3) {
            System.out.println("Введите правильное количество аргументов!");
            return;
        }

        int coffeeBowlVolume, waterBowlVolume, milkBowlVolume;
        try {
            coffeeBowlVolume = Integer.parseInt(args[0]);
            waterBowlVolume = Integer.parseInt(args[1]);
            milkBowlVolume = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.out.println("Введите три целых числа в качестве аргументов!");
            return;
        }

        if (coffeeBowlVolume <= 0 || waterBowlVolume <= 0 || milkBowlVolume <= 0) {
            System.out.println("Введите три целых положительных числа в качестве аргументов!");
            return;
        }

        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeBowlVolume, waterBowlVolume, milkBowlVolume);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int volume;
        String[] commands;
        Operation operation;

        do {
            line = bufferedReader.readLine().toLowerCase();

            if (line.equals(Operation.TURN_OFF.getOperation())) break;

            try {
                commands = line.split(" ");
                operation = Operation.getOperationByValue(commands[0]);
                volume = Integer.parseInt(commands[1]);
            } catch (Exception e) {
                System.out.println("Введите корректную команду!");
                continue;
            }

            switch (operation) {
                case MILK:
                    coffeeMachine.addMilk(volume);
                    break;
                case COFFEE:
                    coffeeMachine.addCoffee(volume);
                    break;
                case WATER:
                    coffeeMachine.addWater(volume);
                    break;
                case ESPRESSO:
                case LATTE:
                case CAPPUCCINO:
                case RISTRETTO:
                case LUNGO:
                    if (volume < 10) {
                        System.out.println("Кофе можно приготовить только объемом более 10 мл!");
                    } else {
                        try {
                            coffeeMachine.makeCoffee(operation, volume);
                        }
                        catch (EmptyBowlsException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }

            System.out.println(coffeeMachine.getCoffeeBowlVolume() + " " + coffeeMachine.getWaterBowlVolume()
                                                                    + " " + coffeeMachine.getMilkBowlVolume());
        } while (true);
    }
}
