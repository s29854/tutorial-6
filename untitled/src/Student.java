import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String lname;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate = new Date();
    static int count = 1;
    int indexNumber;
    static ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Grade> grades;


    public Student(String name, String lname, String email, String address, String phoneNumber, Date birthDate
    ) {
        this.name = name;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        Student.students.add(this);
        indexNumber = count++;
        this.grades = new ArrayList<Grade>();


    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void addGrade (double value, String name){
        Grade grade = new Grade(value, name);
        grades.add(grade);
    }

}

