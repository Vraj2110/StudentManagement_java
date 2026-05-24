public class Teacher extends Person {

    private String teacherid;
    private String subject;
    private double salary;
    private int exeperiance;

    public Teacher(String name, String email, int age,
                   String teacherid, String subject, double salary, int exeperiance) {
        super(name, age, email);
        this.teacherid = teacherid;
        this.exeperiance = exeperiance;
        this.salary = salary;
        this.subject = subject;//setter
    }

    public String getTeacherid() {
        return teacherid;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public int getExeperiance() {
        return exeperiance;
    }

    public void setSalary() {
        if (salary < 0) {
            System.out.println("salary cannot negative");
            return;
        }
        this.salary = salary;
    }

    public String getRank() {
        if (exeperiance >= 5) return "junior Professor";
        if (exeperiance >= 10) return "senior Professor";
        return "Assistent Professor";
    }

    @Override
    public void displayInfo() {
        System.out.println("  ┌─────────────────────────────────────┐");
        System.out.println("  │  TEACHER RECORD                     │");
        System.out.println("  ├─────────────────────────────────────┤");
        System.out.printf ("  │  ID         : %-23s│%n", teacherid);
        System.out.printf ("  │  Name       : %-23s│%n", getName());
        System.out.printf ("  │  Age        : %-23s│%n", getAge());
        System.out.printf ("  │  Subject    : %-23s│%n", subject);
        System.out.printf ("  │  Email      : %-23s│%n", getEmail());
        System.out.printf ("  │  Experience : %-23s│%n", exeperiance + " years");
        System.out.printf ("  │  Rank       : %-23s│%n", getRank());
        System.out.printf ("  │  Salary     : %-23s│%n", "Rs. " + salary);
        System.out.println("  └─────────────────────────────────────┘");
    }
}
