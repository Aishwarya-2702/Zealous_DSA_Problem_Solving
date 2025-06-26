// Given two strings A and B, find if A is a subsequence of B.

// Example 1:
// Input:
// A = TCS
// B = Tata Service
// Output: 0
// Explanation: A is not a subsequence of B
// as 'C' appears after 'S'

// Example 2:
// Input:
// A = sdm
// B = sridharmashthlamanjunath
// Output: 1
// Explanation: A is a subsequence of B.

// Example 3:
// Input:
// A = sdmit
// B = sridharmashthlainstitute
// Output: 0
// Explanation: A is not a subsequence of B.

package Day6;

public class subsequence {
    public static int isSequence(String src, String phrase){
        int alpha = 0, beta = 0;
        while(alpha<src.length()&&beta<phrase.length()){
            if(src.charAt(alpha)==phrase.charAt(beta)){
                beta++;
            }
            alpha++;
        }
        return(beta==phrase.length())?1:0;
    }
    public static void main(String[] args) {
        String phrase = "TCS";
        String name = "Tata Consultancy Services";
        System.out.println(isSequence(name, phrase));
    }
}