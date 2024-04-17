import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("L", "P", "lp@pjwstk.edu.pl", "Warszawa", "123456789", new Date(2003, 1, 1));
        System.out.println(s1.getIndexNumber());
    }
}