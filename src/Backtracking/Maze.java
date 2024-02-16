package Backtracking;

import java.util.ArrayList;

public class Maze
{
    static int m=3;
    static int n=3;
    public static void main(String[] args) {
        maze( 0 , 0 , "");
        System.out.println(mazeList(0 , 0 ,""));
    }
    static void maze(int i,int j,String path)
    {
        if(i==2 && j==2)
        {
            System.out.println(path);
            return;
        }

        if(j<n-1)
            maze(i , j+1 , path+"R");

        if(i<m-1)
            maze(i+1 , j , path+"D");
    }

    static ArrayList<String> mazeList(int i, int j, String path)
    {
        ArrayList<String> list = new ArrayList<>();
        if(i==2 && j==2)
        {
            System.out.println(path);
            list.add(path);
            return list;
        }

//        Lists to store the answers from other recursion calls
        ArrayList<String> ans1 = new ArrayList<>();
        ArrayList<String> ans2 = new ArrayList<>();
        ArrayList<String> ans3 = new ArrayList<>();

        if(j<n)
             ans1 =(mazeList(i , j+1 , path+"H"));

        if(i<m)
            ans2 = (mazeList(i+1 , j , path+"V"));

        if(i<m && j<n)
            ans3 = (mazeList(i+1 , j+1 , path+"D"));

//Assemble all the answers and store it inside the single list
        ans1.addAll(ans2);
        ans1.addAll(ans3);
        list.addAll(ans1);
        return list;
    }
}
