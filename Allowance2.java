public class Allowance2 implements Allowance {
    @Override
    public double computeTotal(double dailyAllowance, int currentDay) {
        int lastDay = 30;
        int remainingDays = lastDay - currentDay + 1;

        if (remainingDays <= 0) {
            remainingDays = 0;
        }

        return dailyAllowance * remainingDays;
    }
}
