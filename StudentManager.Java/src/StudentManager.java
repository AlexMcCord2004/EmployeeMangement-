import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();

        int choice;
        do {
            System.out.println("Student Manager Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    scanner.nextLine();
                    String studentName = scanner.nextLine();
                    studentList.add(studentName);
                    System.out.println(studentName + " has been added to the student list.");
                    break;
                case 2:
                    System.out.println("Student List:");
                    for (String student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Student Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
        scanner.close();
    }
}
