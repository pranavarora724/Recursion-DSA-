package GFG_Medium_And_Hard;

import java.util.Arrays;

public class Beautiful_Arrangements
{
    static int count = 0;

    public static void main(String[] args) {
        countArrangement(4);
    }

    static int countArrangement(int n)
    {
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        helper(arr , 0);

        return count ;

    }

    static void helper(int [] arr , int i)
    {
        if(i ==arr.length)
        {
            count++ ;
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int j =i; j<arr.length;j++)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            if( (arr[i]%(i+1) == 0) || ((i+1)%arr[i]) == 0 ) {
                helper(arr, i + 1);

            }
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
//            return;
        }
    }
}
