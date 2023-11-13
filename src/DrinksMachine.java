enum DrinksMachine {
    COFFEE,
    TEA,
    LEMONADE,
    MOJITO,
    SODA,
    COLA
}
class Drinks {
    static final double COFFEE_PRICE = 1.5;
    static final double TEA_PRICE = 1.2;
    static final double LEMONADE_PRICE = 1.7;
    static final double MOJITO_PRICE = 1.8;
    static final double SODA_PRICE = 1.8;
    static final double COLA_PRICE = 2.1;

    static int totalDrinks;
    static double totalIncome;

    static void makeCoffee() {
        totalDrinks++;
        totalIncome += COFFEE_PRICE;
        System.out.println("Making coffee...");
    }
    static void makeTea() {
        totalDrinks++;
        totalIncome += TEA_PRICE;
        System.out.println("Making tea...");
    }
    static void makeLemonade() {
        totalDrinks++;
        totalIncome += LEMONADE_PRICE;
        System.out.println("Making lemonade...");
    }
    static void makeMojito() {
        totalDrinks++;
        totalIncome += MOJITO_PRICE;
        System.out.println("Making mojito...");
    }
    static void makeSoda() {
        totalDrinks++;
        totalIncome += SODA_PRICE;
        System.out.println("Making soda...");
    }
    static void makeCola() {
        totalDrinks++;
        totalIncome += COLA_PRICE;
        System.out.println("Making cola...");
    }
}
