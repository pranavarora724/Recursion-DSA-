package GFG_Medium_And_Hard;

import java.util.Arrays;

public class Target_Sum
{
    public static void main(String[] args) {
       int [] arr = new int[]{1,1,1,1,1};

       helper(0,0 , arr);
    }

    private static void helper(int i, int ans, int[] arr)
    {
        if(i==arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
       helper(i+1,ans ,arr);
        arr[i] = -arr[i];
        helper(i + 1, ans, arr);
    }
}
