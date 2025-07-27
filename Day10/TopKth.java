// Consider you are going to inquire about top kth package from placement history of past year companies offered. NOTE: using quick select
// Example:
// Input:[14, 23, 7, 15, 20]
// k = 2
// Output:20
// k = 1
// Output: 23
// k = 5
// Output: 7

package Day10;

public class TopKth {
    public static int sortAndFindPivotal(int[] arr, int start, int end){
        int pivotalData=arr[end];
        int init = start-1;

        for(int current = start;current<end;current++){
            if(arr[current]<=pivotalData){
                init++;
                int third = arr[init];
                arr[init] = arr[current];
                arr[current] = third;
            }
        }

        int third = arr[end];
        arr[end] = arr[init+1];
        arr[init+1] = third;

        return init+1;
    }
    public static int divide(int[] arr, int start, int end, int kth){
        if(start==end)
        return arr[start];
        else{
            int pivotalPoint = sortAndFindPivotal(arr, start, end);
            if(pivotalPoint==kth)
            return arr[pivotalPoint];
            else if(pivotalPoint>kth)
            return divide(arr, start, pivotalPoint-1, kth);
            else
            return divide(arr, pivotalPoint+1, end, kth);
        }
    }
    public static void main(String[] args) {
        int[] packages = {14, 23, 7, 15, 20};
        int top = 2;
        System.out.println(divide(packages, 0, packages.length-1, packages.length-top));
        top = 3;
        System.out.println(divide(packages, 0, packages.length-1, packages.length-top));
        top = 4;
        System.out.println(divide(packages, 0, packages.length-1, packages.length-top));
    }
}
