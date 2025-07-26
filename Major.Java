public class Major extends Students {

    private String majorName;
    private double gpa;

    public Major(String name, int age, String hometown, String majorName, double gpa) {
        super(name, age, hometown);
        this.majorName = majorName;
        this.gpa = gpa;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Major{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId=" + getStudentId() +
                ", Hometown='" + getHometown() + '\'' +
                ", majorName='" + majorName + '\'' +
                ", gpa=" + gpa +
                '}';
    }



}