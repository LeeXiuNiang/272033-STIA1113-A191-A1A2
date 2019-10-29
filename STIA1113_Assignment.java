package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float car_price=-1, down_payment=-1, total_interest, monthly_repayment;
        int loan_period=-1, interest_rate=-1;

        Scanner input= new Scanner(System.in);

        while(car_price<30000) {
            System.out.print("Car Price (RM): ");
            car_price = input.nextFloat();
        }

        while(down_payment<0) {
            System.out.print("Down Payment (RM): ");
            down_payment = input.nextFloat();
        }

        while(loan_period<5 || loan_period>9){
            System.out.print("Loan Period (Years): ");
            loan_period = input.nextInt();
        }

        while(interest_rate<3 || interest_rate>7){
            System.out.print("Interest Rate (%): ");
            interest_rate = input.nextInt();
        }

        total_interest = (car_price - down_payment) * interest_rate/100 * loan_period;
        monthly_repayment = (car_price - down_payment + total_interest)/(loan_period*12);

        System.out.printf("Monthly Repayment: RM%,.2f\n", monthly_repayment);

        String myFormat1 = "%-5s%15s%15s%15s\n";
        System.out.printf(myFormat1, "Years", "Principal", "Interest", "Balance");

        String myFormat2 = "%-5s%,15.2f%,15.2f%,15.2f\n";
        int[] years = new int[9];
        float[] principal = new float[9], interest = new float[9], balance = new float[9];

        for(int i=0; i<loan_period; i++){
            years[i]=i+1;
            principal[i]=monthly_repayment*12*(i+1);
            interest[i]=total_interest/loan_period * years[i];
            balance[i]=monthly_repayment * 12 * (loan_period- years[i]);

            System.out.printf(myFormat2, years[i], principal[i], interest[i], balance[i]);
        }
    }
}

