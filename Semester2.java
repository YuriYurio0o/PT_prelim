public class Semester2 implements Semester, Increase {
    @Override
    public double applyIncrease (double amount, int semester) {
        if (semester % 2 == 0) {
            amount = amount * 1.03;
        }

        return amount;
    }
    @Override
    public double computeTotal(double weeklyAllowance) {
        double total = 0;
        double currentAllowance = weeklyAllowance;

        for (int semester = 1; semester <= 6; semester++) {
            currentAllowance = applyIncrease (currentAllowance, semester);
            double semesterTotal = currentAllowance * 18;
            total = total + semesterTotal;
        }
    return total;
    }
}