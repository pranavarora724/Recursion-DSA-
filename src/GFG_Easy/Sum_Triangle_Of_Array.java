package GFG_Easy;

import java.util.Arrays;

public class Sum_Triangle_Of_Array
{
    public static void main(String[] args)
    {
        int ar[];
        ar=new int[]{1,2,3,4,5};

        triangle(ar);
    }
   static void triangle(int arr[])
    {
        if(arr.length==1)
        {
            System.out.println(Arrays.toString(arr));
            return ;
        }


        int arr2[]=new int[arr.length-1];
        for(int k=0 ,i=0; k<arr2.length;k++)
        {
            arr2[k]=arr[i]+arr[i+1];
            i++;
        }

         triangle(arr2);
        System.out.println(Arrays.toString(arr));


    }
}
