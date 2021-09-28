package com.company.Strings;

public class RotateMatrix90Degree {

    public int[][] rotateMatrix(int[][] matrix) {
//        if (matrix.length == 0 || matrix.length != matrix[0].length) {
//            return false;
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                int last = n - 1 - i;
                for (int j = i; j < last; j++) {
                    int offset = j - i;
                    int top = matrix[i][j]; // save top
                    // left -> top
                    matrix[last - offset][i] = matrix[last][last - offset];
                    // right -> bottom
                    matrix[last][last - offset] = matrix[j][last];
                    // top -> right
                    matrix[j][last] = top;
                }
            }

        return matrix;
    }


    public int[][] rotateclockwise(int[][] matrix){
        int row = matrix[0].length; // total col of matrix
        int column = matrix.length; // total row of matrix
        int[][] rotatedMatrix = new int[row][column];

        for(int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                rotatedMatrix[j][(column-1)-i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public void printMatrix(int matrix[][]){
        for(int i = 0 ; i < matrix.length ; i++){
            System.out.println(" ");
            for (int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j]);
                System.out.print(", ");
            }
        }
    }
}
