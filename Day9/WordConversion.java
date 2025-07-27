// Imagine you are a software engineer working on a document editing application. The application allows users to edit and correct typos in their documents. One of the features you are developing is a tool to calculate the minimum number of operations required to transform one word into another. This feature is crucial for suggesting the most efficient edits and corrections to the users.
// Task: Given two words, implement a function that calculates the minimum number of operations required to convert the first word into the second word. The allowed operations are:
// Insert a character
// Delete a character
// Replace a character

// Input:
// Two strings word1 and word2 representing the original word and the target word, respectively.
// Output:
// An integer representing the minimum number of operations required to convert word1 into word2.

// Example:
// Input: word1 = "horse", word2 = "rose"
// Output: 2
// Explanation:
// To transform "horse" into "rose", the following 2 operations are required:
//   1. Replace 'h' with 'r' -> "rorse"
//   2. Delete 'r' -> "rose"

// horse
// ros
// h>> remove
// o>> r
// r>> o
// e>> remove

// h>> r
// r>> remove
// e>> remove

package Day9;

public class WordConversion {
    public static int count(String alpha, String beta){
        int rowSize = alpha.length();
        int colSize = beta.length();

        int[][] poss = new int[rowSize+1][colSize+1];

        //fill default values
        for(int index=0; index<=rowSize; index++){
            poss[index][0] = index;
        }
        for(int index=0; index<=colSize;index++){
            poss[0][index] = index;
        }

        //fill the poss
        for(int row = 1; row<=rowSize; row++){
            for(int col=1; col<=colSize; col++){
                if(alpha.charAt(row-1)==beta.charAt(col-1)){
                    poss[row][col]=poss[row-1][col-1];
                }
                else{
                    poss[row][col]=1+Math.min(poss[row-1][col-1],Math.min(poss[row][col-1], poss[row-1][col]));
                }
            }
        }
        return poss[rowSize][colSize];
    }
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "rose";
        System.out.println(count(word1, word2));
        word1 = "madam";
        word2 = "mam";
        System.out.println(count(word1, word2));
        word1 = "horse";
        word2 = "ros";
        System.out.println(count(word1, word2));
    }
}
