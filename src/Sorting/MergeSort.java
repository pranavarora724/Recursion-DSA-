package Sorting;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int arr[]={5,3,12,9,20,6};
        System.out.println(Arrays.toString(arr));
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr)
    {
        int mid=arr.length/2;

        if(arr.length==1)
            return arr;

        int left[] = sort(Arrays.copyOfRange(arr,0,mid));
        int right[] = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left , right);
    }

    private static int[] merge(int[] left, int[] right)
    {
        int mix[]=new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;

            }
            else
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
            while(i<left.length)
            {
                mix[k]=left[i];
                k++;
                i++;
            }
            while(j<right.length)
            {
                mix[k]=right[j];
                k++;
                j++;
            }
            return mix;
    }
}
