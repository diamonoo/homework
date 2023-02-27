package hw.lesson4;
import java.util.Scanner;
class Homework4 {
public static void main(String[] args) {
   
   Scanner scanner = new Scanner(System.in);
    System.out.print("input number...");
    int num= 0 ;// scanner.nextInt() ;
    
   int[][][] arr = {{{1, 4, 5}, {6, 7, 8, 5}, {8, 9, 10}},
                {{11, 12, 14}, {11, 44, 55}, {98, 54, 13}},
                {{14, 12, 15}, {22, 55, 89}, {11, 76, 89}}};

       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += num;
                    System.out.print(" " + arr[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //======================
        
        String[][] arr2 = new String[8][8];
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++) {
                if ((i + j) % 2 == 0)
                    arr2[i][j] = "w";
                else
                    arr2[i][j] = "b";
                System.out.print(" " + arr2[i][j]);
            }
           System.out.println("");
        }
        
        //==============
        
	int[][] matr1 = {
            {1, 0, 0, 0}, 
            {0, 1, 0, 0}, 
            {0, 0, 0, 0} };

        int[][] matr2 = {
            {1, 2, 3}, 
            {1, 1, 1}, 
            {0, 0, 0}, 
            {2, 1, 0}};
            
          
        int m = matr1.length,  n = matr2[0].length, p = matr2.length;    
        int result[][] = new int[m][n];
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    result[i][j] += matr1[i][k] * matr2[k][j]; 
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( result[i][j] +" ");
            }
            System.out.println();
        }
        
    
    scanner.close();
}
}