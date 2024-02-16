package GFG_Medium_And_Hard;

public class Longest_Posiible_Route_In_Matrix
{
    static int path = -1;
    public static void main(String[] args) {
        int mat[][]=new int[][]{
                {1,1,0,1,1,0},
                {1,1,1,1,1,1}
        };

        helper(mat , -1 , 2 , 6 ,0,0,1,3);
        System.out.println(path);
    }

    static void helper(int[][] mat , int sum2 ,int m , int n , int i , int j , int xd , int yd)
    {
        sum2=sum2+1;

        if(mat[i][j]==0)
            return;

        if(i==xd && j==yd)
        {
            if(sum2>path)
                path=sum2;

            return;
        }

        //   int x = mat[i][j];
        mat[i][j]=0;

        if(j<n-1)
            helper(mat , sum2 , m , n , i , j+1 , xd , yd);

        if(i<m-1)
            helper(mat , sum2 , m , n , i+1 , j, xd , yd);

        if(j>0)
            helper(mat , sum2 , m , n , i , j-1 , xd , yd);

        if(i>0)
            helper(mat , sum2 , m , n , i-1 , j , xd , yd);

        mat[i][j]=1;

        return;

    }
}
