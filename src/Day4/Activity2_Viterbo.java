package Day4;

public class Activity2_Viterbo {
    static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        double percentFoodAllowance;
        double percentTransportation;
        double percentRent;
        double percentUtilityBill;
        double remainingBalance;

        percentFoodAllowance = (foodAllowance / income) * 100;
        percentTransportation = (transportation / income) * 100;
        percentRent = (rent / income) * 100;
        percentUtilityBill = (utilityBill / income) * 100;

        remainingBalance = income - foodAllowance - transportation - rent - utilityBill;

        System.out.printf("Income: %.0f %n" , income);
        System.out.printf("Food Allowance in percentage: %.1f %% %n", percentFoodAllowance);
        System.out.printf("Transportation in percentage: %.1f %% %n", percentTransportation);
        System.out.printf("Rent in percentage: %.1f %% %n",percentRent);
        System.out.printf("Utility Bill in percentage: %.1f %% %n", percentUtilityBill);

        System.out.printf("Remaining Balance: %.0f" , remainingBalance);
    }
}
