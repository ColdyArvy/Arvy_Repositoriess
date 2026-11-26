import java.util.Scanner;

public class LabTask3 {

    public static void studInfo(String studNum, String studName, String Course, String yearLevel) {
        System.out.println(studNum + " " + studName + " " + Course + " " + yearLevel);
    }

    public static double getAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static String getRemark(double average) {
        if (average >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public static void letterGrade (double average, char choice) {
       
        switch(choice) {
            case 'L': case 'l':
                if (average >= 90 && average <= 100) {
                    System.out.println("A");
                } else if (average >= 83 && average <= 89) {
                    System.out.println("B");
                } else if (average >= 75 && average <= 82) {
                    System.out.println("C");
                } else if (average >= 60 && average <= 74) {
                    System.out.println("D");
                } else if (average <= 60) {
                    System.out.println("F");
                }
                break;
        }
    }

    public static void numericGrade (double average, char choice) {
       
        switch(choice) {
            case 'N': case 'n':
                if (average >= 96 && average <= 100) {
                    System.out.println("4.00");
                } else if (average >= 90 && average <= 95) {
                    System.out.println("3.50");
                } else if (average >= 84 && average <= 89) {
                    System.out.println("3.00");
                } else if (average >= 77 && average <= 83) {
                    System.out.println("2.50");
                } else if (average >= 70 && average <= 76) {
                    System.out.println("2.00");
                } else if (average <= 69) {
                    System.out.println("1.00");
                }
                break;
            }
        }

    public static void getResult(double average, String remark, char choice) {
        System.out.printf("Average is\t\t: %.2f%n", average);
         if (choice == 'L' || choice == 'l') {
            System.out.print("Letter Grade\t\t: ");
            letterGrade(average, choice);
        } else if (choice == 'N' || choice == 'n') {
            System.out.print("Numeric Grade\t\t: ");
            numericGrade(average, choice);
        } else {
            System.out.println("Invalid choice.");
        } 
        System.out.println("Remarks\t\t\t: " + remark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.print("Student Number                 : ");
        String studNum = sc.nextLine();
        System.out.print("Student Name                   : ");
        String studName = sc.nextLine();
        System.out.print("Course                         : ");
        String Course = sc.nextLine();
        System.out.print("Year Level                     : ");
        String yearLevel = sc.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("Enter Grades...");

        System.out.print("Grade 1                        : ");
        int grade1 = sc.nextInt();

        System.out.print("Grade 2                        : ");
        int grade2 = sc.nextInt();

        System.out.print("Grade 3                        : ");
        int grade3 = sc.nextInt();

        System.out.println("------------------------------------------");
        System.out.print("Display Letter Grade or Numeric Grade[L|N]? ");
        char choice = sc.next().charAt(0);
        System.out.println("------------------------------------------");
        System.out.printf("Student Details: " + studNum + " " + Course + " " + yearLevel);
        System.out.println("");
        System.out.println("Full Name: " + studName + " ");
        System.out.println("------------------------------------------");
        
        double average = getAverage(grade1, grade2, grade3);
        String remark = getRemark(average);

        System.out.println();

        getResult(average, remark, choice);
        System.out.println("------------------------------------------");

        sc.close();
    }
}