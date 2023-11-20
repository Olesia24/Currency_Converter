package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyAppl {
    public static void main(String[] args) {
        System.out.println("-Welcome to Currency Application-");
        Set<Integer> list = new HashSet<>();

        while (true) {
            Currency.printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select number for currency conversion: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.USD.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " US Dollar = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 2 : {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.GBP.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " Pound Sterling = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.CHF.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " Swiss Frank = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 4 : {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.CAD.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " Canadian Dollar = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 5 : {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.RUB.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " Russian Ruble = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 6 : {
                        System.out.println("Enter the amount of the selected currency: ");
                        double amount = scanner.nextDouble();
                        double exchangeRate = Currency.AED.getExchangeRate();
                        double euroAmount = amount / exchangeRate;
                        System.out.printf(amount + " Emirati Dirhams = Euro %.2f", euroAmount);
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        break;
                    }
                    case 7: {
                        Currency.exit();
                        break;
                    }
                    default: {
                        System.out.println("Wrong input.");
                        Currency.exit();
                    }
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }
}

