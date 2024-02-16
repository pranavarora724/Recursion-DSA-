package GFG_Medium_And_Hard;

import java.util.ArrayList;

public class N_Digits_Numbers_Increasing_Order
{


         static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        inc(3);
    }
         static void inc(int N)
        {

            if(N==1)
                list.add(0);
            helper(0,N);
            System.out.println(list);
//            return list;
            // code here
        }

         static void helper(int num , int n)
        {
            if(n==0)
            {
                list.add(num);
                return;
            }
            for(int i = num%10+1 ; i<=9 ; i++)
            {
                if(i>num%10)
                    helper(num*10+i , n-1);
            }
        }
    }

