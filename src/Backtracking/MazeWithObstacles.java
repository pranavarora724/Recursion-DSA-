package Backtracking;

import java.util.ArrayList;

public class MazeWithObstacles
{
    static int m=3;
    static int n=3;
    public static void main(String[] args)
    {
       boolean arr[][];
       arr= new boolean[][]{
               {true, true, true},
               {true, true, false},
               {true, true, true}
       };
        System.out.println( mazeList(0,0,"",arr));
    }
    static ArrayList<String> mazeList(int i , int j , String path , boolean arr[][])
    {
        ArrayList<String> list = new ArrayList<>();
        if(arr[i][j]==false)
        {
            return list;
        }

        if(i==2 && j==2)
        {
            System.out.println(path);
            list.add(path);
            return list;
        }
        ArrayList<String> ans1 = new ArrayList<>();
        ArrayList<String> ans2 = new ArrayList<>();
        ArrayList<String> ans3 = new ArrayList<>();

        if(j<n-1)
            ans1 =(mazeList(i , j+1 , path+"H" , arr));

        if(i<m-1)
            ans2 = (mazeList(i+1 , j , path+"V" , arr));

        if(i<m-1 && j<n-1)
            ans3 = (mazeList(i+1 , j+1 , path+"D" , arr));


        ans1.addAll(ans2);
        ans1.addAll(ans3);
        list.addAll(ans1);
        return list;
    }
}
