package String;

public class Permutation
{
    public static void main(String[] args)
    {
        perm("" , "abcd");
    }
    static void perm(String ans , String str)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
            for(int i=0;i<=ans.length();i++)
            {
                String f = ans.substring(0,i);
                String s = ans.substring(i,ans.length());
                perm( f + str.charAt(0) + s , str.substring(1));
            }
    }
}
