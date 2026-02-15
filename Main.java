import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Daily Allowance: ");
        double daily = input.nextDouble();

        System.out.print("Current Day of April: ");
        int day = input.nextInt();

        Allowance allowance = new Allowance2();

        double total = allowance.computeTotal(daily, day);

        System.out.println("Total allowance until April 30: " + total);
    }
}
