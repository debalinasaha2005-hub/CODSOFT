import java.util.Scanner;
public class Task2_StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the input of four subjects
        System.out.print("Enter the marks of four subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();

        // Calculating the total marks

        int totalMarks = sub1+sub2+sub3+sub4;
        System.out.println("The total marks of four subjects:" +totalMarks);

        // Calculating the average percentage

        double AP = totalMarks/4F; // AP is Average Percentage
        System.out.println("The Average percentage is:" +AP);

        // Calculating the grade 
        
        if(AP >=95 && AP<=100){
          System.out.println("Grade O"); // Outstanding
        }
        if(AP >=90 && AP<=94){
          System.out.println("Grade A+"); // Excellent
        }
         else if(AP >=80 && AP<=89){
          System.out.println("Grade A"); // Very good
        }
         else if(AP >=70 && AP<=79){
          System.out.println("Grade B+"); // Good
        }
        else if(AP >=60 && AP<=69){
          System.out.println("Grade B"); // Moderate 
        }
        else if(AP >=50 && AP<=59){
          System.out.println("Grade C+");  // Average
        }
        else if(AP >=40 && AP<=49){
          System.out.println("Grade C"); // Bad
        }
        else if(AP >=30 && AP<=39){
          System.out.println("Grade D"); // Very bad
        }
        else{
          System.out.println("Grade F"); // Fail
        }

    }
} 
    

