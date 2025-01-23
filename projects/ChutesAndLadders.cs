public class Solution {

    private static readonly Random random = new Random(); // Call instance here to prevent having to recreate instance every die roll
    public int SnakesAndLadders(int[][] board) {
        int n = board.GetLength(0); // Gets the length of a row - If you want column length use 1 instead of 0
        int boardSize = n * n; //Since the board is a square the rows == columns
        int arraySize = boardSize - 1;
        int curr = 0;
        int next = 0;


    }

    public int DieRoll(){
        return random.Next(1, 7);
    }

    
}