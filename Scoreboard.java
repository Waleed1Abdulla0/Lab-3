package Task3.Q3;

import java.util.Arrays;

public class Scoreboard {
    public static int numEntries = 0;
    public static GameEntries[] board;
    public static int arr[]={10,20,30};

    public Scoreboard( int capacity) {
        board = new  GameEntries[capacity];
    }

    public int getNumEntries() {
        return numEntries;
    }

    public GameEntries[] getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "Scoreboard{" +
                "numEntries=" + numEntries +
                ", board=" + Arrays.toString(board) +
                '}';
    }
//    public void add(GameEntries e){
//        int newScore = e.getScore();
//        if (numEntries < board.length || newScore > board[numEntries-1].getScore()){
//            if (numEntries < board.length){
//                numEntries++;
//            }
//            int j = numEntries - 1;
//            while (j > 0 && board[j - 1].getScore() < newScore){
//                board[j] = board[j - 1];
//                j--;
//            }
//            board[j] = e;
////        }
//    }
public static void add(int elem)
{
    if(numEntries<arr.length)
    {arr[numEntries] = elem;
        numEntries++;}
    else
        System.out.println("array is full");

}
    public static GameEntries remove (int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries){
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntries temp = board[i];
        for (int j = i; j < numEntries - 1 ; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries --;
        return temp;
    }

    public static void main(String[] args) {
        add(4);
        System.out.println(arr);
        remove(1);
    }
}
