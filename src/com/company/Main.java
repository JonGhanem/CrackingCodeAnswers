package com.company;
import com.company.Strings.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
	
	    private static void arrayAndStringProblems() {
        //1 . check if a word contains duplicated charters
        System.out.println(new DuplicatedChar().isNotDuplicated("Hello"));
        //2 . check if permuted يعني الكلمتين فيهم نفس الحروف بالظبط بس ملخبطين
        System.out.println(new CheckPermutation().isPermuted("hello","hello"));
        //3 . replace spaces with %20 الله عليك يا حبيب والديك
        System.out.println(new ReplaceSpacesOfString().replaceStringSpace("Mr John Smith    "));
        //4. Palindrome Permutation backward as forward when you change the order الله عليك يا حبيب والديك
        System.out.println(new PalindromePermutation().isPalindromePermutation("tact coa"));
        //System.out.println(Character.getNumericValue('Z') - Character.getNumericValue('A') + 1);
        //5. One Way check if only one change between two strings
        System.out.println(new OnlyOneChange().isOneChange("pale", "pass"));
        //6. String Compress
        System.out.println(new StringCompression().compressString("aabccccccaaaadlmm"));
        //7. Rotate Matrix
        int[][] matrix = {{1,2,99,88},{3,4,7,55}};
        new RotateMatrix90Degree().printMatrix(matrix);
        int[][] rotateMatrix = new RotateMatrix90Degree().rotateclockwise(matrix);
        new RotateMatrix90Degree().printMatrix(rotateMatrix);
        //8. set All rows and columns to zero
        int[][] nullZero = {{1,2,99,88},{3,4,0,55},{2,3,6,0}};
        new RotateMatrix90Degree().printMatrix(new NullRowAndColumn().nullIfZZero(nullZero));
        //9 . String Rotated
        System.out.println("");
        System.out.println(new StringRotation().isStringRotated("abcdsef", "cdefasb"));
    }
}
