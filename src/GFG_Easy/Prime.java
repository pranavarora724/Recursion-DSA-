package GFG_Easy;

public class Prime
{
    public static void main(String[] args) {
        System.out.println( isPrime(2,7));
    }
    static boolean isPrime(int n , int num)
    {
        if(n>num/2)
            return true;

        if(num%n==0)
            return false;

        isPrime(n+1 , num);
        return true;
    }
}
