public class Student {
    //Encapsulation: private variables
    // private means these variables cannot be directly accessed from outside the
    
    private int id;
    private String name;
    private int age;
    private String course;

    //Constructor
    public Student(int id,String name,int age,String course){
        this.id = id;//id=parameter
        this.name = name;
        this.age = age;
        this.course = course;
    }

    //Getters
//private variables cannot access directly so we use getters
    public int getId(){
        return id;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
    //This change the students name
    //Setters
    //setter is used to change the existing value
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public void setCourse(String course){
        this.course = course;
    }
    //Display student details
    public void displayStudent(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
       
    }
}
