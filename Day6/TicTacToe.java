// Minimum Moves to Convert String

// You are given a string s consisting of n characters which are either 'X' or 'O'.
// A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
// Return the minimum number of moves required so that all the characters of s are converted to 'O'.

// Example 1:
// Input: s = "XXX"
// Output: 1	
// Explanation: XXX -> OOO
// We select all the 3 characters and convert them in one move.

// Example 2:
// Input: s = "XXOX"
// Output: 2
// Explanation: XXOX -> OOOX -> OOOO
// We select the first 3 characters in the first move, and convert them to 'O'.
// Then we select the last 3 characters and convert them so that the final string contains all 'O's.

// Example 3:
// Input: s = "OOOO"
// Output: 0
// Explanation: There are no 'X's in s to convert.

package Day6;

public class TicTacToe {
    public static int steps(String str){
        int counter = 0;
        for(int index=0;index<str.length();){
            if(str.charAt(index)=='X'){
                index+=3;
                counter++;
            }
            else{
                index++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String src = "X0XX";
        System.out.println(steps(src));
    }
}
