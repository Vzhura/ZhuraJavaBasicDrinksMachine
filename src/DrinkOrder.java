import java.util.Scanner;

public class DrinkOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a drink choice (COFFEE, TEA, LEMONADE, MOJITO, SODA, COLA), or 'exit' to finish:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            DrinksMachine choice;
            try {
                choice = DrinksMachine.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice!");
                continue;
            }

            makeDrink(choice);
        }
        System.out.println("Total Income: $" + Drinks.totalIncome);
    }
    static void makeDrink(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                Drinks.makeCoffee();
                break;
            case TEA:
                Drinks.makeTea();
                break;
            case MOJITO:
                Drinks.makeMojito();
                break;
            case LEMONADE:
                Drinks.makeLemonade();
                break;
            case SODA:
                Drinks.makeSoda();
                break;
            case COLA:
                Drinks.makeCola();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}


