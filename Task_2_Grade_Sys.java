import java.util.Scanner;
public class Task_2_Grade_Sys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the result: ");
        int result = sc.nextInt();
        char grade;
        if (result > 90) {
            grade = 'A';
        } else if (result >= 80 && result <= 90) {
            grade = 'B';
        } else if (result >= 70 && result < 80) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }
        System.out.println("Grade: " + grade);
        sc.close();
    }
}