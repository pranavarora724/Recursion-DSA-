package GFG_Medium_And_Hard;

import java.util.ArrayList;

public class Different_Ways_To_Add_Parenthesis
{

    public static void main(String[] args) {
        String str="2*3-4*5";
         System.out.println(helper(str));
    }
    static ArrayList<Integer> helper(String s)
    {
        if(s.indexOf('+')==-1  && s.indexOf('-')==-1 && s.indexOf('*')==-1)
        {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(Integer.parseInt(s));

            return list1;
        }
            ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+' || s.charAt(i) == '-' || s.charAt(i)=='*')
            {
                ArrayList<Integer> left = helper(s.substring(0,i));
                ArrayList<Integer> right  = helper(s.substring(i+1));


                for(int a: left)
                {
                    for(int b:right)
                    {
                        if(s.charAt(i)=='+')
                        {
                            ans.add(a+b);
                        } else if (s.charAt(i)=='-')
                        {
                            ans.add(a-b);
                        }
                        else {
                            ans.add(a*b);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
