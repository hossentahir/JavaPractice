// package newPackage;
import java.util.Scanner;

public class App {
	public static void main(String [] args) {
		 System.out.print("Enter the size of the row and collumn of 2D Matrix: ");
		 Scanner sc = new Scanner(System.in);
		 int row = sc.nextInt(), col = sc.nextInt();
		 int matrix[][] = new int [row][col];
		 for(int i = 0; i < row; i++) {
			 for(int j = 0; j < col; j++) {
				 System.out.println("Enter the value of index " +i+" "+ j + " : " );
				 matrix[i][j] = sc.nextInt();
				 
			 }
		 }
		 System.out.println("The matrix is ");
		 for(int i = 0; i < row; i++) {
			 for(int j = 0; j < col; j++) {
				 System.out.print(matrix[i][j] + " ");
				 
			 }
			 System.out.println();
		 }
			 
		 
	}
}
