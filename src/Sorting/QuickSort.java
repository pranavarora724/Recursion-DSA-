package Sorting;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int arr[]={10, 5 , 6 , 2 , 15 , 12 , 3};
        System.out.println(Arrays.toString(arr));
        quick(arr,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr , int lo , int hi)
    {

        if(lo>=hi)
            return;

        int s = lo;
        int e = hi;
        int pivot = (s+e)/2;

//        Why we taking middle element as pivot
//        For Best time complexity

        while(s<=e) {
            while (arr[s] < arr[pivot])
                s++;
            while (arr[e] > arr[pivot])
                e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr,lo,e);
        quick(arr,s,hi);
    }
}
