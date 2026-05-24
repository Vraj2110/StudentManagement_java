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
}
