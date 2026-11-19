import java.util.Scanner;
//1. class Main created
public class Matrix {
    public static void main(String[] args) {
        //2. Declare and create
        int [][]matrix = new int[3][3];
        //3. Write the Loop to iterate and input values inside matrix array
        //4. Create a scanner object named scanner
        Scanner scanner = new Scanner(System.in);
           char again = 'y';
        do {
        System.out.println("Enter 9 Elements.....");
        for(int r=0; r < matrix.length;r++)
        {
            for(int c=0; c < matrix.length;c++)
            {
                matrix[r][c] = scanner.nextInt();
            }
        }
        //5. Display table + row sums
        System.out.println();
        System.out.println("Here are the Numbers and the required outputs:");
        System.out.println("===============================================");
        System.out.println("                          " + "Row Sum:");
        int[] colSum = new int[3];
        for(int r=0; r < matrix.length;r++)
        {
            int rowSum = 0;
            for(int c=0; c < matrix.length;c++)
            {
                System.out.printf("%5d", matrix[r][c]);
                rowSum += matrix[r][c];
                colSum[c] += matrix[r][c];
            }
            System.out.printf("%15d%n", rowSum);
        }
        System.out.println();
        System.out.printf( "Column sum:");
        System.out.println();
        for(int c=0; c < matrix.length;c++)
        {
            System.out.printf("%5d", colSum[c]);
        }
        System.out.println();
        int dia1 = 0, dia2 = 0;
        for(int i=0; i < matrix.length;i++)
        {
            dia1 += matrix[i][i];
            dia2 += matrix[i][matrix.length - 1 - i];
        }
        System.out.println();
        System.out.println("===============================================");
        System.out.println("Diagonal sum 1: " + dia1);
        System.out.println("Diagonal sum 2: " + dia2);
        //6. Declare Try Again
        System.out.print("\nTry Again [y|n]: ");
        again = scanner.next().charAt(0);
        System.out.println();
    } while (again == 'y' || again == 'Y');
        scanner.close();
    }
}