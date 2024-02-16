package Backtracking;

import java.util.ArrayList;

public class MazeWithAllPaths
{
    static int m=3;
    static int n=3;
    public static void main(String[] args)
    {
        boolean arr[][];
        arr= new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazeList(0,0,"",arr);
    }

    static ArrayList<String> mazeList(int i, int j, String path , boolean arr[][])
    {
        ArrayList<String> list = new ArrayList<>();
        if(i==2 && j==2)
        {
            System.out.println(path);
            list.add(path);
            return list;
        }
        if(arr[i][j]==false)
        {
            return list;
        }

//        marking index false --->  So that we do not return back there in same recursivve call
//        it will create endless loop
        arr[i][j]=false;

        if(j<n-1)
            list.addAll(mazeList(i , j+1 , path+"R" ,arr));

        if(i<m-1)
            list.addAll(mazeList(i+1 , j , path+"D" , arr));

        if(j>0)
            list.addAll(mazeList(i , j-1 , path+"L" , arr));

        if(i>0)
            list.addAll(mazeList(i-1 , j ,path+"U" , arr));

        arr[i][j]=true;
//      Now revert the changes made  before exiting
//      Bcoz it will affect rhe future calls of recursion

        return list;
    }
}
