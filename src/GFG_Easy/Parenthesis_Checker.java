package GFG_Easy;


class Parenthesis_Checker
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length()%2==1)
            return false;

        return isValid("" , x);
    }
    static boolean isValid(String ans, String str)
    {
        if(ans.length()==0 && str.length()==0)
            return true;

        if(ans.length()>=2)
        {
            String s = ans.substring(ans.length()-2);
            if(s.equals("()") || s.equals("{}") || s.equals("[]"))
                return isValid(ans.substring(0 , ans.length()-2),str);
        }

        if(str.length()==0 )
            return false;

        return isValid(ans+str.charAt(0) , str.substring(1));


    }
}
