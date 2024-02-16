package String;

import java.util.ArrayList;

public class Stream
{
    public static void main(String[] args) {
        System.out.println(repeat("jfabsjaf"));
    }

//    At every call new String is Created
//    Hey recursion you are going up  can ou include my answer too
    static String repeat(String str)
    {
//        ArrayList<Integer>
        if(str.isEmpty())
            return "";
        if(str.charAt(0)!='a')
        {
            String s = String.valueOf(str.charAt(0));
            //    Hey recursion you are going up  can ou include my answer too
            return s+repeat(str.substring(1));
        }
        else
            return ""+repeat(str.substring(1));
    }
}
