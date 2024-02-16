package Arrays;

import java.util.ArrayList;

 class Search
{
    public static void main(String[] args)
    {
          int arr[]={2,5,6,6,1,4,3,6};
        ArrayList<Integer> ans = new ArrayList<>();
      ans=  find(arr , 6 , 0);
      System.out.println(ans);
    }
     static ArrayList<Integer> find(int arr[] , int target , int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index== arr.length)
            return list;

        if(arr[index]==target)
            list.add(index);

//        Hey Recursion
//                       You are taking all the answers to main , So Please Take Mine too

        ArrayList<Integer> ansFromBelowCalls = find(arr , target , index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}

