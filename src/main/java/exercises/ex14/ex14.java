package exercises.ex14;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex14 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex14 example14 = new ex14();

        String amountNum = example14.amountInput();
        String state = example14.stateInput();

        int amount = example14.amountInt(amountNum);

        //Find the tax (Cant use an else clause!)
        double taxNum = example14.stateTax(state);
        double taxCharge = example14.taxCharge(taxNum , amount );
        double subTotal = example14.subTotal(amountNum);
        double total = example14.totalAmount(subTotal, taxNum);

        //Output
        String outputString = example14.outputString(subTotal, taxCharge, total);

        example14.printOutput(outputString);

    }

    private int amountInt(String amountNum) {
        int amountInt = Integer.parseInt(amountNum);
        return amountInt;
    }

    private double taxCharge(double taxNum, int amount) {
        return amount * (taxNum/100);
    }

    private void printOutput(String outputString) {System.out.println(outputString);
    }

    private String outputString(double subTotal, double taxCharge, double total) {
        return "The subtotal is $"+ String.format("%.2f",subTotal) +".\n" +
                "The tax is $" + taxCharge +".\n" +
                "The total is $"+ total +".";
    }

    private double totalAmount(double subTotal, double taxNum) {
        return subTotal * (taxNum/100) + subTotal;
    }

    private double subTotal(String amountNum) {
        double subTotal = Double.parseDouble(amountNum);
        return subTotal;
    }

    private String stateInput() {
        System.out.print("What is the state? ");
        String state = in.nextLine();
        return state;
    }

    private String amountInput() {
        System.out.print("What is the order amount? ");
        String amount = in.nextLine();
        return amount;
    }
    private double stateTax(String state) {
        if (state.equals("WI")) {
            double tax = 5.5;
            return tax;
        }
        if (state.equals("AL")) {
            double tax = 9.2;
            return tax;
        }
        if (state.equals("AK")) {
            double tax = 1.7;
            return tax;
        }
        if (state.equals("AZ")) {
            double tax = 8.4;
            return tax;
        }
        if (state.equals("AR")) {
            double tax = 9.4;
            return tax;
        }
        if (state.equals("CA")) {
            double tax = 8.6;
            return tax;
        }
        if (state.equals("CO")) {
            double tax = 7.6;
            return tax;
        }
        if (state.equals("CT")) {
            double tax = 6.3;
            return tax;
        }
        if (state.equals("DE")) {
            double tax = 0;
            return tax;
        }
        if (state.equals("DC")) {
            double tax = 6.0;
            return tax;
        }
        if (state.equals("FL")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("GA")) {
            double tax = 7.3;
            return tax;
        }
        if (state.equals("HI")) {
            double tax = 4.4;
            return tax;
        }
        if (state.equals("ID")) {
            double tax = 6.0;
            return tax;
        }
        if (state.equals("IN")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("IA")) {
            double tax = 6.9;
            return tax;
        }
        if (state.equals("KS")) {
            double tax = 8.7;
            return tax;
        }
        if (state.equals("KY")) {
            double tax = 6.0;
            return tax;
        }
        if (state.equals("LA")) {
            double tax = 9.5;
            return tax;
        }
        if (state.equals("ME")) {
            double tax = 5.5;
            return tax;
        }
        if (state.equals("MD")) {
            double tax = 6.0;
            return tax;
        }
        if (state.equals("MA")) {
            double tax = 6.2;
            return tax;
        }
        if (state.equals("MI")) {
            double tax = 6.0;
            return tax;
        }
        if (state.equals("MN")) {
            double tax = 7.5;
            return tax;
        }
        if (state.equals("MS")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("MO")) {
            double tax = 8.2;
            return tax;
        }
        if (state.equals("MT")) {
            double tax = 0;
            return tax;
        }
        if (state.equals("NE")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("NV")) {
            double tax = 8.3;
            return tax;
        }
        if (state.equals("NH")) {
            double tax = 0;
            return tax;
        }
        if (state.equals("NJ")) {
            double tax = 5.5;
            return tax;
        }
        if (state.equals("NM")) {
            double tax = 5.5;
            return tax;
        }
        if (state.equals("NY")) {
            double tax = 6.6;
            return tax;
        }
        if (state.equals("NC")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("ND")) {
            double tax = 6.9;
            return tax;
        }
        if (state.equals("OH")) {
            double tax = 7.2;
            return tax;
        }
        if (state.equals("OK")) {
            double tax = 9.0;
            return tax;
        }
        if (state.equals("OR")) {
            double tax = 0;
            return tax;
        }
        if (state.equals("PA")) {
            double tax = 6.3;
            return tax;
        }
        if (state.equals("RI")) {
            double tax = 7.0;
            return tax;
        }
        if (state.equals("SC")) {
            double tax = 7.5;
            return tax;
        }
        if (state.equals("SD")) {
            double tax = 6.4;
            return tax;
        }
        if (state.equals("TN")) {
            double tax = 9.5;
            return tax;
        }
        if (state.equals("TX")) {
            double tax = 8.2;
            return tax;
        }
        if (state.equals("UT")) {
            double tax = 7.2;
            return tax;
        }
        if (state.equals("VT")) {
            double tax = 6.2;
            return tax;
        }
        if (state.equals("VA")) {
            double tax = 5.7;
            return tax;
        }
        if (state.equals("WA")) {
            double tax = 9.2;
            return tax;
        }
        if (state.equals("WV")) {
            double tax = 6.4;
            return tax;
        }
        if (state.equals("WY")) {
            double tax = 5.3;
            return tax;
        }
        double tax;
        return tax = 1.0;
    }

}