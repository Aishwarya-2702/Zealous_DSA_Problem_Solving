// Consider that you are building console interface of customer's loan application where customer used to provide name, pan, aadhaar, email then they will set the password for their account. your role is to validate those information's using regex.
// Example:
// Input:
// Name: "Raz",
// Password: "razak$123",
// Aadhaar: "765456787912",
// PAN: "ABCDE1234F",
// Email: "example@mail.com"

// Output:
// Account created

// Example:
// Input:
// Name: "Ra",
// Password: "razak$123",
// Aadhaar: "7654567",
// PAN: "ABCDE1234F",
// Email: "example@mail.com"

// Output:
// Invalid name,invalid aadhaar

// Example:
// Input:
// Name: "Raz",
// Password: "razak123",
// Aadhaar: "765456787912",
// PAN: "ABCDE1234F",
// Email: "example@mail.c"

// Output:
// Invalid password, invalid email


package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Validation {
    public static void valid(Map<String,String> patterns, Map<String, String> inputs){
        boolean flag = true;
        for(String field:inputs.keySet()){
            String pattern = patterns.get(field);
            String data = inputs.get(field);
            if(!Pattern.matches(pattern, data)){
                System.out.println("Invalid input in "+field);
                flag = false;
            }
        }
        if(flag)
            System.out.println("Account has been created");
    }
    public static void main(String[] args) {
        Map<String,String> myPatterns = new HashMap<>();
        myPatterns.put("name", "^[a-zA-Z ]{3,}$");
        myPatterns.put("password", "^(?=.*[@#$!&])[a-zA-Z0-9@#$!&]{8,}$");
        myPatterns.put("aadhaar", "^[0-9]{12}$");
        myPatterns.put("pan", "^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        myPatterns.put("email", "^[a-z0-9]{2,}@[a-z]{2,}\\.[a-z]{2,}");

        Map<String,String> myValues = new HashMap<>();
        myValues.put("name", "Ai");
        myValues.put("password", "Aishu");
        myValues.put("aadhaar", "9876567876786567");
        myValues.put("pan", "ABCDE1234Pdkjdbs");
        myValues.put("email", "av@gmailc");

        valid(myPatterns, myValues);
    }
}
