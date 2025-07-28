import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    Scanner in= new Scanner(System.in); 
   static  ArrayList<String> students = new ArrayList<>();
    static ArrayList<Integer> ID = new ArrayList<>();
    static  ArrayList<String> Hometown = new ArrayList<>();
    static  ArrayList<String> Major = new ArrayList<>();


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Student Management System");
      int choice;
      String name;
      int age;
      String hometown;
      String majorName;
      double gpa;     
        while (true) {
            System.out.println("1. Add Student");
            if(!students.isEmpty()) {
            System.out.println("2. Display Students");
            System.out.println("3. Display IDs");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            }
           else {
                        System.out.println("2. Exit");

           }
                 choice = in.nextInt();
in.nextLine(); 
            switch (choice) {
                case 1:
                System.out.println("Enter Student Name:");
                     name = in.nextLine();
                    System.out.println("Enter Student Age:");
                    age = in.nextInt();
                    in.nextLine(); 
                    System.out.println("Enter Student Hometown:");
                    hometown = in.nextLine();
                    System.out.println("Enter Major Name:");
                    majorName = in.nextLine();
                    System.out.println("Enter GPA:");
                    gpa = in.nextDouble();
                    in.nextLine();
                    Major S = new Major(name, age, hometown, majorName, gpa);
                    addStudent(S.getName());
                    addHometown(S.getHometown());
                    addID(S.getStudentId());
                    addMajor(S.getMajorName());


                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("Exiting...");

                        return;
                    }
                displayStudents();
                    break;
                case 3:
                displayIDs();
                    break;
                case 4:
                    System.out.println("Enter Student Name to Search:");
                    String searchName = in.nextLine();
                    searchStudent(searchName);
                    break;
                case 5:
                    System.out.println("Enter Student ID to Search:");
                    int searchId = in.nextInt();
                    searchid(searchId);
                    in.nextLine();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        



    }
    public static void  addStudent(String student) {
        students.add(student);
    }
    public static void addID(int id) {
        ID.add(id);
    }
    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
    public static void displayIDs() {
        for (int id : ID) {
            System.out.println(id);
        }
    }
    public static void searchStudent(String name) {
        boolean found = false;
       for (int i =0; i<students.size();i++){
        String student = students.get(i);
        if (student.contains(name)) {
            System.out.println("Student found: " + student);
            System.out.println("Student ID: " + ID.get(i));
            System.out.println("Hometown: " + Hometown.get(i));
            System.out.println("Major: " + Major.get(i));

            found = true;
            break;
       }
        if (!found) {

            System.out.println("Student not found.");
        }
    }
    } 
public static void searchid(int id){
boolean found =false;
for (int i =0; i<ID.size();i++){
int studentId = ID.get(i);
if (studentId== id) {
            System.out.println("ID found: " + studentId);
            System.out.println("Student: " + students.get(i));
            System.out.println("Hometown: " + Hometown.get(i));
            System.out.println("Major: " + Major.get(i));
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("ID not found.");

}

}
public static void addHometown(String hometown) {
        Hometown.add(hometown);
    }
    public static void addMajor(String major) {
        Major.add(major);
    }
    
}