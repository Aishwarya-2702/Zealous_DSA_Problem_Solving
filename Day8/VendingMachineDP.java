// coin change via DP

package Day8;

import java.util.Arrays;

public class VendingMachineDP {
    public static int dispense(int[] denom, int required){
        int[] possibility = new int[required+1];
        Arrays.fill(possibility, required+1);
        possibility[0]=0;
        for(int currency:denom){
            for(int index = currency; index<=required; index++){
                possibility[index] = Math.min(possibility[index],possibility[index-currency]+1);
            }
        }
        return (possibility[required]<required+1)?possibility[required]:-1;
    }
    public static void main(String[] args) {
        System.out.println(dispense(new int[]{100,500,200},200));
        System.out.println(dispense(new int[]{100,500,200}, 300));
        System.out.println(dispense(new int[]{100,500,200}, 8700));
        System.out.println(dispense(new int[]{100,500,200}, 250));
    }
}
