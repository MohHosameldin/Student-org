public class Major extends Student {

    private String majorName;
    private double gpa;

    public Major(String name, int age, String hometown, String majorName, double gpa) {
        super(name, age, hometown);
        this.majorName = majorName;
          setGpa(gpa);         
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
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        else {
            this.gpa = gpa;
        }
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