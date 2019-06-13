import java.util.Scanner;

public class array
{
   public static void array(String args[])
   {
       int[][] scores = new int[5][4];
		scores[0][0] = 75;
		scores[0][1] = 88;
		scores[0][2] = 78;
		scores[4][2] = 83;
		scores[4][3] = 91;
Scanner keyboard = new Scanner(System.in);

	for(int row = 0; row < scores.length; row++){
	for(int col = 0; col < scores[0].length; col++){
		System.out.print(scores[row][col] + " ");
	}
	System.out.println();
}