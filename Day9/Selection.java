// selection sort

package Day9;

import java.util.Arrays;

public class Selection {
    public static void sortBySelect(char[] arr){
        for(int select = 0; select<arr.length; select++){
            for(int comp = select+1; comp<arr.length; comp++){
                if(arr[select]>arr[comp]){
                    arr[select]+=arr[comp];
                    arr[comp]=(char)(arr[select]-arr[comp]);
                    arr[select]-=arr[comp];
                }
            }
        }
    }
    public static void main(String[] args) {
        char[] word = {'h', 'o', 'r','s', 'e'};
        sortBySelect(word);
        System.out.println(Arrays.toString(word));
    }
}
