package Backtracking;

import java.util.Scanner;

public class N_Queens
{
    static int n;
    public static void main(String[] args)
    {
        System.out.println("Enter n");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean arr[][]= new boolean[n][n];

        for(int i=0;i<n ; i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=true;
            }
        }
        Nqueens(arr , 0 ,0);

    }
    static void Nqueens(boolean arr[][] , int r , int c)
    {
        if(r==n)
        {
            for(int i=0;i<n ; i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

            for(int k=0;k<n;k++)
            {
                if(isValid(arr , r , k)==true)
                {
                    arr[r][k]=false;
                    Nqueens(arr , r+1 , 0);
                    arr[r][k]=true;
                }
            }
    }

    private static boolean isValid(boolean[][] arr , int x , int y)
    {
        int i=x;int j =y;

        while(i>=0)
        {
            if(arr[i][j]==false)
                return false;
            i--;
        }
        i=x;j=y;

        while(i>=0 && j>=0)
        {
            if(arr[i][j]==false)
                return false;
            i--;
            j--;
        }
        i=x;j=y;
        while(i>=0 && j<n)
        {
            if(arr[i][j]==false)
                return false;
            i--;
            j++;
        }
        return true;
    }
}
