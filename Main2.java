import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weekly allowance: ");
        double weekly = input.nextDouble();

        Semester semester = new Semester2();

        double total = semester.computeTotal (weekly);
         
        System.out.println("Total allowance for 6 semesters: " + total);
    }
}