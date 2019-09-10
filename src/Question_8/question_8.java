package Question_8;

import java.util.Scanner;

public class question_8 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of lines: ");
        int lines = scanner.nextInt();
        System.out.print("Enter the size of columns: ");
        int columns = scanner.nextInt();
        int [][]a = new int[lines][columns];
        System.out.print("Number of the first column to be changed: "); //отсчет столбцов начинается с 0; [0; column-1]
        int k = scanner.nextInt();
        System.out.print("Number of the second column to be changed: "); // значения k and k1 ввести < column
        int k1 = scanner.nextInt();
        int change = 0;
        System.out.println("Enter elements: ");
        for(int i = 0; i<lines;i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for(int i = 0; i<lines;i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Modified matrix: ");
        for(int i = 0; i<lines;i++) {
            for (int j = 0; j < columns; j++) {
                change = a[i][k];
                a[i][k] = a[i][k1];
                a[i][k1] = change;
            }
        }
        for(int i = 0; i<lines;i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
