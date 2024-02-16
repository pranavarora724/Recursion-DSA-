package String;

import java.util.Arrays;

public class Permutation_Without_Extra_Space
{
    public static void main(String[] args) {
        String str="abcd";
        int arr[];
        arr= new int[]{1, 2, 3};

          permutation( 0 ,arr);
    }

    private static void permutation(int i, int [] arr)
    {
        if(i==arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int j=i;j<arr.length;j++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            permutation(i+1 , arr);
             temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
