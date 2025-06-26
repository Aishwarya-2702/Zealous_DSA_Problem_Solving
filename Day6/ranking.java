// Find the ranking of your skill set in google trends ranking of 10 demanded trends such as [Java developer, cloud architect, data analyst, devops engineer ,full stack developer, network associate] using binary search

// Example:
// Input: data analyst
// Output: 3

// Input: Devops engineer
// Output: -1

// Input: full stack developer
// Output: 5

package Day6;

public class ranking {
    public static int search(String[] arr, int start, int end, String target){
        if(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid].compareTo(target)==0)
            return mid;
            else if(arr[mid].compareTo(target)>0)
            return search(arr, start, mid, target);
            else
            return search(arr, mid+1, end, target);
        }
        return -1;       
    }

    public static void main(String[] args) {
        String[] techs = {"Java developer", "cloud architect", "data analyst", "devops engineer" ,"full stack developer", "network associate"};
        System.out.println(search(techs, 0, techs.length-1, "data analyst")+1);        
    }
}
