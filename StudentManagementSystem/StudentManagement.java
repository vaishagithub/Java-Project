import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
static ArrayList<Student> students = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);

//Add student
public static void addStudent(){
    System.out.print("Enter Student ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter Student Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter Course: ");
    String course = scanner.nextLine();

    Student student = new Student(id,name,age,course);
    students.add(student);
    System.out.println("Student added successfully");
}

//view Students
public static void viewStudents(){
    if(students.isEmpty()){
        System.out.println("No students found");
        return;
    }
    System.out.println("\n----- Student List -----");

    for(Student student : students){
        student.displayStudent();
    }
}

//Update student
public static void updateStudent(){
    System.out.print("Enter Student ID to update");
    int id = scanner.nextInt();
    scanner.nextLine();

    for(Student student : students){
        if(student.getId() == id){
            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter New Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter New Course: ");
            String course = scanner.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);

            System.out.println("Student updated successfully!");
            return;
        }
    }

    System.out.println("Student not found.");
}

//Delete student

public static void deleteStudent(){
    System.out.print("Enter Student ID to delete: ");
    int id = scanner.nextInt();
    //for(DataType variable : collection)
    for(Student student : students){
        if(student.getId() == id){
            students.remove(student);
            System.out.println("Student deleted successfully!"); 
            return;
        }
    }
    System.out.println("Student not found.");
}

//Search student
public static void searchStudent(){
    System.out.print("Enter Student ID to search: ");
    int id = scanner.nextInt();

    for(Student student : students){
        if(student.getId() == id){
            System.out.println("Student found");
            student.displayStudent();
            return;
        }
    }
    System.out.println("Student not found.");
}

//Main method
public static void main(String[] args){
//This keeps the menu running continuously.

//Without it, your program would execute the menu only once.
    while(true){
    System.out.println("\n===== Student Management System =====");
    System.out.println("1. Add Student");
    System.out.println("2. View Students");
    System.out.println("3. Update Student");
    System.out.println("4. Delete Student");
    System.out.println("5. Search Student");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    switch(choice){
        case 1:
            addStudent();
            break;
        case 2:
            viewStudents();
            break;
        case 3:
            updateStudent();
            break;
        case 4:
            deleteStudent();
            break;
        case 5:
            searchStudent();
            break;

        case 6:
            System.out.println("Thank you!");
            scanner.close();
            return;

        default:
            System.out.println("Invalid choice.");
    }
}
}
}
