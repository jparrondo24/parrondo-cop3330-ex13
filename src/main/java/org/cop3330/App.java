package org.cop3330;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String strPrincipal = in.nextLine();
        double principal = Double.parseDouble(strPrincipal);

        System.out.print("What is the rate? ");
        String strRate = in.nextLine();
        double rate = Double.parseDouble(strRate) / 100;

        System.out.print("What is the number of years? ");
        String strYears = in.nextLine();
        double years = Double.parseDouble(strYears);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String strTimesCompunded = in.nextLine();
        double timesCompounded = Double.parseDouble(strTimesCompunded);

        double investment = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        DecimalFormat answerFormat = new DecimalFormat("#.##");
        String strInvestment = answerFormat.format(investment);

        System.out.printf("$%s invested at %s%% for %s years compounded %s times per year is $%s.\n",
                          strPrincipal, strRate, strYears, strTimesCompunded, strInvestment);
    }
}
