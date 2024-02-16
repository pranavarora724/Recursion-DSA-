package GFG_Medium_And_Hard;

public class Path_With_Max_Gold
{

    static int  sum1 = 0;

    public static void main(String[] args) {
      int grid[][];
      grid = new int[][]{
              {0,6,0},
              {5,8,7},
              {0,9,0}
      };

      getMaximumGold(grid);
    }

    static int getMaximumGold(int[][] grid)
    {
        for(int i =0; i<grid.length ; i++)
        {
            for(int j=0 ; j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                {
                    helper(i,j,grid,0);
                }
            }
        }
        return sum1;
    }

   static void helper(int i , int j ,int[][] grid,int sum2)
    {
        int m = grid.length;
        int n= grid[0].length;

        sum2=sum2+grid[i][j];

        if(grid[i][j]==0)
        {
            if(sum2>sum1)
                sum1=sum2;
            return;
        }

        int x = grid[i][j];
        grid[i][j]= 0;

        if(j<n-1)
            helper(i , j+1 , grid , sum2);

        if(i<m-1)
            helper( i+1 , j ,grid , sum2);

        if(j>0)
            helper( i , j-1 , grid , sum2);

        if(i>0)
            helper(i-1 , j ,grid , sum2);

        if(sum2 > sum1)
            sum1 = sum2;

        grid[i][j]=x;

    }
}
