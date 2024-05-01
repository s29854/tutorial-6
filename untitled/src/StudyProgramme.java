public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int numberOfPossibleItns;

    public StudyProgramme(String name, String description, int numberOfSemesters, int numberOfPossibleItns) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfPossibleItns = numberOfPossibleItns;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getNumberOfPossibleItns() {
        return numberOfPossibleItns;
    }
}
