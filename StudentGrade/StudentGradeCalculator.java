import java.util.Scanner;
public class StudentGradeCalculator {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter English mark: ");
    int english = sc.nextInt();
    System.out.print("Enter Maths mark: ");
    int maths = sc.nextInt();
    System.out.print("Enter Science mark: ");
    int science = sc.nextInt();
    System.out.print("Enter Social mark: ");
    int social = sc.nextInt();
    System.out.print("Enter Computer mark: ");
    int computer = sc.nextInt();

    //calculate total
    int total = english + maths + science + social + computer;

    //calculate average
    double average = total/5.0;

    //Display total and average
    System.out.println("Total = " + total);
    System.out.println("Average=" + average);

    //calculate grade

    if(average >=90){
        System.out.println("Grade = A");
    }
    else if(average >=80){
        System.out.println("Grade = B");
    }
     
    else if(average >=70){
        System.out.println("Grade = C");
    }
    else if(average>=60)
        {
            System.out.println("Grade = D");

   } 
   else if(average>=50)
        {
            System.out.println("Grade = E");

   } 
   else{
    System.out.println("Grade = F");
   }
}
}
