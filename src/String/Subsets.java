package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets
{
   static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        sub("","abcd");
        System.out.println(list);
    }
    static void sub(String ans , String str)
    {
        if(str.isEmpty())
            list.add(ans);

        else {
            sub(ans,str.substring(1));
            sub(ans+str.charAt(0),str.substring(1));
        }
    }
}
