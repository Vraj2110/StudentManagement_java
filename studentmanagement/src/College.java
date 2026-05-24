import java.util.ArrayList;
public class College {

    private String collegename;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public College(String collegename) {
        this.collegename = collegename;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added" + s.getStudentId() + s.getName());
    }

    public void removeStudent(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)){
                System.out.println("removed :" + students.get(i).getName());
                students.remove(i);
                return;
            }
        }
        System.out.println( "Student id not found" + studentId);
    }

    public Student findStudent(String studentid){
        for (Student s : students ){
            if (s.getStudentId().equals(studentid)) return s;
        }
        return null;
    }

    public void addTeacher(Teacher t){
        teachers.add(t);
        System.out.println("Teacher added" + t.getTeacherid()  + t.getName());
    }

    public void printAllstudents(){
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("ALL STUDENT" + collegename);
        System.out.println(" ═══════════════════════════════════════  ");
        if (students.isEmpty()){
            System.out.println("No student Enrolled yet.");
            return;
        }
        for (Student s : students){
            s.displayInfo();
            System.out.println();
        }
    }

    public void printTeachers(){
        System.out.println("\n═══════════════════════════════════════");
        System.out.println("ALL TEACHER" + collegename);
        System.out.println(" ═══════════════════════════════════════  ");
        if (teachers.isEmpty()){
            System.out.println("No Techers are added yet.");
            return;
        }
        for (Teacher t : teachers){
            t.displayInfo();
            System.out.println();
        }
    }

    public void printResultSummary(){
        System.out.println("\n═══════════════════════════════════════");
        System.out.println(" RESULT SUMMARY" + collegename);
        System.out.println(" ═══════════════════════════════════════ ");
    if (students.isEmpty()){
        System.out.println("No Student to Show results for.");
        return;
    }

    int passed = 0, failed = 0;
    double totalmarks = 0;
    Student topper  = students.get(0);

    for (Student s : students){
        if (s.haspassed()) passed++;
        else failed++;

        totalmarks += s.getMarks();

        if (s.getMarks()> topper.getMarks()) topper = s;
    }

    double average = totalmarks / students.size();

        System.out.println("Total Students " + students.size());
        System.out.println("Passed:" + passed);
        System.out.println("Failed" + failed);
        System.out.println("class Average" + average);
        System.out.println("class Topper" + topper.getName() + topper.getMarks()+ "marks");
    }

    public void printEveryonePoly(){
        System.out.println("\n  ═══════════════════════════════════════");
        System.out.println("  ALL PERSONS (Polymorphism Demo)");
        System.out.println("  ═══════════════════════════════════════");
        System.out.println("  Same method displayInfo() called on all —");
        System.out.println("  Java auto-calls the right version per type!\n");

        ArrayList<Person> everyone = new ArrayList<>();
        everyone.addAll(students);
        everyone.addAll(teachers);

        for (Person p : everyone){
            p.displayInfo();
            System.out.println();
        }
    }

    public String getCollegename() {return collegename;}
    public int gettotalStudents() {return students.size();}
    public int gettotalTeacher() {return teachers.size();}
}
