public class Student extends Person {

    private String studentId;
    private double marks;
    private String course;
    private String grade;

    public Student(String name , int age , String email,
                   String studentId, String course , double marks ){
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
        setMarks(marks);
    }

    public void setMarks(double marks) {
        if (marks < 0||marks>100){
            System.out.println("marks should be between 1 to 100");
            return;
        }
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private String calculateGrade(double marks){
        if (marks >=90) return "A+";
        if (marks >=80) return "A";
        if (marks >=70) return "B";
        if (marks >=60) return "C";
        if (marks >=50) return "D";
        return ("F");
    }

    public boolean haspassed(){
        return marks >=40;
    }

    public String getStudentId() {return studentId;}
    public String getCourse() { return course;}
    public String getGrade() {return grade;}
    public double getMarks() {return marks;}

    @Override
    public void displayInfo() {
        System.out.println("  ┌─────────────────────────────────────┐");
        System.out.println("  │  STUDENT RECORD                     │");
        System.out.println("  ├─────────────────────────────────────┤");
        System.out.printf ("  │  ID     : %-27s│%n", studentId);
        System.out.printf ("  │  Name   : %-27s│%n", getName());
        System.out.printf ("  │  Age    : %-27s│%n", getAge());
        System.out.printf ("  │  Course : %-27s│%n", course);
        System.out.printf ("  │  Email  : %-27s│%n", getEmail());
        System.out.printf ("  │  Marks  : %-27s│%n", marks + " / 100");
        System.out.printf ("  │  Grade  : %-27s│%n", grade);
        System.out.printf ("  │  Status : %-27s│%n", haspassed() ? "✅ PASS" : "❌ FAIL");
        System.out.println("  └─────────────────────────────────────┘");
    }
}
