package String;

import java.util.ArrayList;

public class Dice_Throw
{
    public static void main(String[] args)
    {
        dice("" , 4);
        System.out.println( diceList("" , 7) );
    }
    static void dice(String s , int num)
    {
        if(num==0)
        {
            System.out.println(s);
            return;
        }
        else {
            for(int i=1;i<=num && i<=6 ;i++)
            {
                dice(s+Integer.toString(i) , num-i);
            }
        }
    }

    static ArrayList<String> diceList(String s , int num)
    {
        ArrayList<String> list = new ArrayList<>();
        if(num==0)
        {
            list.add(s);
            return list;
        }
        else {
            for(int i=1;i<=num && i<=6;i++)
            {
                ArrayList<String> ansFromBelowCalls = diceList(s+Integer.toString(i) , num - i);
                list.addAll(ansFromBelowCalls);
            }
        }
       return list;
    }
}
