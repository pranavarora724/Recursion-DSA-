package GFG_Medium_And_Hard;

public class Word_Search_Any_call_returns_true
{

        public boolean exist(char[][] board, String word)
        {
            int i=0;int j=0;

            for(i=0;i<board.length;i++)
            {
                for(j=0;j<board[0].length;j++)
                {
                    if(board[i][j]==word.charAt(0))
                    {
                        char c = word.charAt(0);
                        boolean x = check(i,j,board,word);
                        board[i][j]=c;
                        if(x==true)
                            return true;
                    }
                }
            }
            return false;

        }

        boolean check(int i , int j,char[][]board , String word)
        {
            if(word.length()==0)
            {
//                result = true;
                return true;
            }
            if(i<0 || i>=board.length|| j<0 || j>=board[0].length || board[i][j]!=word.charAt(0))
                return false;

            if(board[i][j]=='.')
                return false;

            int m = board.length;
            int n = board[0].length;

            char ch = board[i][j];
            board[i][j]='.';

//            if any recursion call returns true return true
            if(
                    check(i,j+1,board,word.substring(1)) ||
                            check(i+1,j,board,word.substring(1)) ||
                            check(i,j-1,board,word.substring(1)) ||
                            check(i-1,j,board,word.substring(1))
            )
            {
                return true;
            }
            board[i][j]=ch;
            return false;
        }
    }
