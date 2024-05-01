import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate = new Date();
    private static int studentsCount = 1;
    private String indexNumber;
    private ArrayList<Grade> grades = new ArrayList<>();
    private int currentSemester;
    private String studentStatus;
    private StudyProgramme studyprogramme;


    public Student(String name, String lastName, String email, String address, String phoneNumber, Date birthDate
    ) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = "s"+studentsCount++;
        Students.addStudent(this);
        this.grades = new ArrayList<Grade>();
        this.currentSemester = 0;
        this.studentStatus = "Candidate";

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public String getStatus() {
        return studentStatus;
    }
    public String getStudyprogramme() {
        if(studyprogramme == null){return "Student has not started studying yet.";}
        else {
            return studyprogramme.getName();
        }
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    private void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    private void setStudentStatus(String status) {
        this.studentStatus = status;
    }

    private void setStudyProgramme(StudyProgramme programme) {
        this.studyprogramme = programme;
    }

    public void addGrade (double value, String name){
        Grade grade = new Grade(value, name);
        grades.add(grade);
    }
    public void enrollStudent(StudyProgramme studyProgramme){
        setStudentStatus("Student");
        setCurrentSemester(1);
        setStudyProgramme(studyProgramme);
    }
    public void promoteToNextSemester(){

        if(itnCounter() > studyprogramme.getNumberOfPossibleItns()){
            System.out.println("Student has exceeded the allowed number of ITN's.");
        return;}
        if(currentSemester>= studyprogramme.getNumberOfSemesters()){
            setStudentStatus("Graduate");
        }else{
            setCurrentSemester(currentSemester + 1);
        }
    }
    private int itnCounter(){
        int itnCount = 0;
        for (Grade grade : grades){
            if (grade.getValue() < 3){
                itnCount++;
            }
        }
    return itnCount;}


}

