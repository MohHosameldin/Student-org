public class Student {

    private String name;
    private int age;
    private int studentId;
    private static int idCounter = 25000000;
    private String hometown;


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
   
public String getHometown() {
    return hometown;
}
public void setHometown(String hometown) {
    this.hometown = hometown;
} 
public Student(String name, int age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.studentId = idCounter++;
    }
}
