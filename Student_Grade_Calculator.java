package CodSoft;


import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String args[])

    {
        Scanner scanner = new Scanner(System.in);                             

        System.out.print("Enter the number of subjects: \t");

        int numberOfSubjects = scanner.nextInt();                              // Input how many subject a student have in his class from scanner class.

        int marks[] = new int[numberOfSubjects];                               // marks array that contains the number of subjects that is inputed earlier.

        int totalMarks = 0;                                                   // Initially total marks is zero(0);

        for (int i = 0; i < numberOfSubjects; i++)                     
        {
            System.out.print("Enter the marks obtained out of 100 in subject " + (i+1)+": ");

            int marksObtained = scanner.nextInt();                            // Input the marks obtained in different subject with the help of scanner class.

            if(marksObtained <= 100)                                          // If condition will true whether the marks is less than 100 or not.
            {                                                                 // If the condition will not true then the else part will execute.                                              
                marks[i] = marksObtained;

                totalMarks += marks[i];                                               
            }
            else                                                               // else part will display that you have entered a invalid marks.                               
            {                                                                  // so reenter the marks and it will also decrement i by 1.                  
                System.out.println("\n\t !!!~~~PLEASE ENTER THE VALID MARKS~~~!!!");     // so that you will enter the corret marks obtained.
                i--;
            }
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects ;    // It wil store the average marks of a student.

        String grade;

        double cgpa = averagePercentage / 10;                                  // It will store the cgpa scored by the student.

        if(cgpa >= 90.00 && cgpa <= 100.00)                                    // The condition will check whether the student scorred is greater then 90.
        {                                                                      // or equal to 100.
            grade = "Outstanding";
        }
        else if(cgpa < 90.00)                                                  // The condition will check whether the student scorred is less then 90 or not.
        {                                                                      
            grade = "Excellent";
        }
        else if(cgpa < 80.00)                                                  // The condition will check whether the student scorred is less then 80 or not.
        {                                                                      
            grade = "Very Good";
        }
        else if(cgpa < 70.00)                                                  // The condition will check whether the student scorred is less then 70 or not.
        {                                                                      
            grade = "Good";                                                                    
        }
        else if(cgpa < 60.00)                                                  // The condition will check whether the student scorred is less then 60 or not.
        {                                                                     
            grade = "Satisfactory";
        }
        else if(cgpa < 50.00)                                                  // The condition will check whether the student scorred is less then 50 or not.
        {                                                                     
            grade = "Acceptable";
        }
        else if(cgpa < 40)                                                     // The condition will check whether the student scorred is less then 40 or not.
        {
            grade = "Just Pass";
        }
        else                                                                   // If the above conditions are not satisfied than else part will execute. 
        {
            grade = "Fail";
        }

        System.out.println("\n Total Marks; " + totalMarks + "/" + numberOfSubjects * 100);

        System.out.println("\n Average Percentage: " + averagePercentage);

        System.out.println("\n Grade: " + grade);

    }
}
