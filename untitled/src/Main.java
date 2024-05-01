import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", "Doe", "jdoe@pjwstk.edu.pl",
                "Warsaw", "333-322-222",new Date(1980, 1, 1));

        Student s2 = new Student("Jenny", "Dash", "jdash@pjwstk.edu.pl",
                "Warsaw", "123-456-789",new Date(1980, 2, 2));

        StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);
        StudyProgramme zi=new StudyProgramme("ZI", "AAA", 7, 5);

        s1.enrollStudent(it);
        s2.enrollStudent(zi);
        Students.displayInfoAboutAllStudents();

        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();

        Student s3 = new Student("Jack", "Black", "jblack@pjwstk.edu.pl", "Warsaw",
                "333222555", new Date(1981, 3, 3));
        Students.displayInfoAboutAllStudents();
    }
}