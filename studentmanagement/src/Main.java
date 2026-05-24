import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static College college = new College("Gujarat Vidyapith, Vadodara");

    public static void main(String[] args) {

        System.out.println("\n  ╔══════════════════════════════════════╗");
        System.out.println("  ║   STUDENT MANAGEMENT SYSTEM          ║");
        System.out.println("  ║   Gujarat Vidyapith, Vadodara        ║");
        System.out.println("  ╚══════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("\n  Enter choice: ");
            int choice = getIntInput();

            switch (choice) {
                case 1  -> addNewStudent();
                case 2  -> addNewTeacher();
                case 3  -> college.printAllstudents();
                case 4  -> college.printAllTeachers();
                case 5  -> searchStudent();
                case 6  -> college.printResultSummary();
                case 7  -> college.printEveryonePoly();
                case 8  -> removeStudent();
                case 0  -> { System.out.println("\n  Goodbye!\n"); running = false; }
                default -> System.out.println("  Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    static void printMenu() {
        System.out.println("\n  ┌─────────────────────────────────┐");
        System.out.println("  │  MENU                           │");
        System.out.println("  ├─────────────────────────────────┤");
        System.out.println("  │  1. Add Student                 │");
        System.out.println("  │  2. Add Teacher                 │");
        System.out.println("  │  3. View All Students           │");
        System.out.println("  │  4. View All Teachers           │");
        System.out.println("  │  5. Search Student by ID        │");
        System.out.println("  │  6. Result Summary + Topper     │");
        System.out.println("  │  7. Polymorphism Demo           │");
        System.out.println("  │  8. Remove Student              │");
        System.out.println("  │  0. Exit                        │");
        System.out.println("  └─────────────────────────────────┘");
    }

    static void addNewStudent() {
        System.out.println("\n  -- Add New Student --");
        System.out.print("  Name        : "); String name   = scanner.nextLine().trim();
        System.out.print("  Age         : "); int    age    = getIntInput();
        System.out.print("  Email       : "); String email  = scanner.nextLine().trim();
        System.out.print("  Student ID  : "); String id     = scanner.nextLine().trim();
        System.out.print("  Course      : "); String course = scanner.nextLine().trim();
        System.out.print("  Marks(0-100): "); double marks  = getDoubleInput();

        Student s = new Student(name, age, email, id, course, marks);
        college.addStudent(s);
    }

    static void addNewTeacher() {
        System.out.println("\n  -- Add New Teacher --");
        System.out.print("  Name        : "); String name    = scanner.nextLine().trim();
        System.out.print("  Age         : "); int    age     = getIntInput();
        System.out.print("  Email       : "); String email   = scanner.nextLine().trim();
        System.out.print("  Teacher ID  : "); String id      = scanner.nextLine().trim();
        System.out.print("  Subject     : "); String subject = scanner.nextLine().trim();
        System.out.print("  Salary      : "); double salary  = getDoubleInput();
        System.out.print("  Experience  : "); int    exp     = getIntInput();

        Teacher t = new Teacher(name, email, age, id, subject, salary, exp);
        college.addTeacher(t);
    }

    static void searchStudent() {
        System.out.print("\n  Enter Student ID to search: ");
        String id = scanner.nextLine().trim();
        Student found = college.findStudent(id);
        if (found != null) {
            System.out.println();
            found.displayInfo();
        } else {
            System.out.println("  No student found with ID: " + id);
        }
    }

    static void removeStudent() {
        System.out.print("\n  Enter Student ID to remove: ");
        String id = scanner.nextLine().trim();
        college.removeStudent(id);
    }

    static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("  Enter a valid whole number: ");
            }
        }
    }

    static double getDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("  Enter a valid number: ");
            }
        }
    }
}