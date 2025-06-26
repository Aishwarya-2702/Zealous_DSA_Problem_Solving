// Twisted prime
// Note: A number is called Twisted Prime if it is a prime and its reverse is also a prime.

// Example 1:
// Input: N = 97
// Output: 1
// Explanation: 97 is a prime number. Its 
// reverse 79 is also a prime number. Thus 
// 97 is a  twisted Prime and so, the answer is 1.

// Example 2:
// Input: N = 43
// Output: 0
// Explanation: 43 is a prime number but its 
// reverse 34 is not a prime.So, 43 is not a 
// twisted prime and thus, answer is 0.

package Day6;

public class TwistedPrime {
    public static boolean isPrime(int num){
        return (num==2||num==3||num==5||num==7||num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0)?true:false;
    }
    public static void main(String[] args) {
        int number = 45;
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        int reversed = Integer.parseInt(builder.reverse().toString());
        System.out.println((isPrime(number)&&isPrime(reversed))?1:0);
    }
}
