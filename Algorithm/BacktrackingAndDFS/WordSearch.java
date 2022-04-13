package Algorithm.BacktrackingAndDFS;

/* 
Given an m x n grid of characters board and a string word,
return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells,
  where adjacent cells are horizzontaly or vertically neighboring.
  The same letter cell may not be used more than once.

  Example:
    input: broad = [['"A", "B", "C", "E"], ["S", "F", "C", "S"],
                            ["A", "D","E","E"]]
    word = "ABCCED"
    output : true

Approach:
  For each element in the board, find the given word
    If finding the given word, return true
    else return false
    
  Find the given word:
    If the index >= given word, return true
    else if row element < 0 or row element > total rows or
      col element < 0 or col element > total cols or 
      the current element in the board != the given word,
      return false
    else 
      char t = the current element in the board
      current element = "#"
      for each current element in four directions,
       if there is the given word, return true 
       else continue the loop
    current element = t
    return false

*/
public class WordSearch {
  static int rows;
  static int cols;
  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {1, 0, -1, 0};
  public static boolean wordExist(char[][] board, String word){
    rows = board.length;
    cols = board[0].length;

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        if(backtrack(board, word, i, j, 0)) return true;
      }
    }
    return false;
    }

    public static boolean backtrack(char[][] board, String word, int i, int j, int index){
      if(index >= word.length()) return true;
      else if(i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != word.charAt(index)) return false;
        else{
          char temp = board[i][j];
          board[i][j] = '#';
          for(int k = 0; k< 4; k++){
            if(backtrack(board, word, i + dx[k], j + dy[k], index + 1))return true;
          }

          board[i][j] = temp;
          return false;

        }

    }

    public static void main (String args[]){
      char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'},
      {'A', 'D','E','E'}};

      // String word = "ABCCED";
      String word = "ABCD";
      System.out.println(wordExist(board, word));
    }
    
}
