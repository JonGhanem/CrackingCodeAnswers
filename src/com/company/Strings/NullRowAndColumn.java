package com.company.Strings;

public class NullRowAndColumn {
    public int[][] nullIfZZero(int matrix[][]){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for(int i = 0 ; i < row.length ; i++){
            if(row[i]){
                for(int k = 0 ; k < matrix[0].length ; k++){
                    matrix[i][k] = 0;
                }
            }
        }

        for(int j = 0 ; j < column.length ; j++){
            if(column[j]){
                for(int l = 0 ; l < matrix.length ; l++){
                    matrix[l][j] = 0 ;
                }
            }
        }

        return matrix;
    }
}
