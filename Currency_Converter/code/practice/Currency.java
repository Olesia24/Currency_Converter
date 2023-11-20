package practice;

public enum Currency {
    USD(1.18, "1 - USD - US Dollar"), GBP(0.89, "2 - GBP - Pound Sterling"), CHF(1.08, "3 - CHF - Swiss Frank"), CAD(0.66, "4 - CAD - Canadian Dollar"), RUB(0.05, "5 - RUB - Russian Ruble"), AED(1.24, "6 - AED - Emirati Dirham"), EXIT(0, "7 - Exit")
    ;

    private double exchangeRate; // Курс обмена к евро
    private String name;

    Currency(double exchangeRate, String name) {
        this.exchangeRate = exchangeRate;
        this.name = name;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getName() {
        return name;
    }

    public static void printMenu(){
        Currency[] menus = Currency.values();
        for (int i = 0; i < menus.length ; i++) {
            System.out.println(menus[i].name);
        }
    }
    public static void exit(){
        System.exit(0);
    }
}
