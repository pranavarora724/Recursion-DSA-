package Backtracking;

import java.util.Scanner;

public class N_Knights
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
        Nknights(arr , 0 ,0 , n);

    }

    private static void Nknights(boolean[][] arr, int r, int c, int count)
    {
        if(r==n)
            return;
        if(count==0)
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
            if(isValid(arr , r, k)==true) {
                arr[r][k] = false;
                Nknights(arr, r, k, count - 1);
                arr[r][k] = true;
            }
        }
        Nknights(arr,r+1,0,count);
    }

    private static boolean isValid(boolean[][] arr, int x, int y)
    {
        int i=x;
        int j=y;

        if(arr[i][j]==false)
            return false;
        if(i-1>=0)
        {
            if(j-2>=0 && arr[i-1][j-2]==false)
                return false;
            if(j+2<n && arr[i-1][j+2]==false)
                return false;
        }
        if(i+1<n)
        {
            if(j-2>=0 && arr[i+1][j-2]==false)
                return false;
            if(j+2<n && arr[i+1][j+2]==false)
                return false;
        }
        if(i-2>=0)
        {
            if(j-1>=0 && arr[i-2][j-1]==false)
                return false;
            if(j+1<n && arr[i-2][j+1]==false)
                return false;
        }
        if(i+2<n)
        {
            if(j-1>=0 && arr[i+2][j-1]==false)
                return false;
            if(j+1<n && arr[i+2][j+1]==false)
                return false;
        }
        return true;
    }
}
