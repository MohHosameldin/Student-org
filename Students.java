public class Students {

    private String name;
    private int age;
    private static int studentId=25000000;
    private String Hometown;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId() {
        studentId++;
    }
   
public String getHometown() {
    return Hometown;
}
public void setHometown(String hometown) {
    Hometown = hometown;
} 
Students(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.Hometown = hometown;
        setStudentId();
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", Hometown='" + Hometown + '\'' +
                '}';
    }

}