package problem1;

public class PlayRPS {

	public static final String rps1 = "ROCK";
	public static final String rps2 = "PAPER";
	public static final String rps3 = "Scissors";

	public static void main(String args[]) {
		
		System.out.println(playRPS(rps1, rps2));
		System.out.println(playRPS(rps2, rps3));
		System.out.println(playRPS(rps1, rps3));
		System.out.println(playRPS(rps1, rps1));

	}

	public static String playRPS(String player1Throw, String player2Throw) {

		if (player1Throw.equals(rps1) && player2Throw.equals(rps2)) {
			return "Player 2 wins";
		}

		else if (player1Throw.equals(rps2) && player2Throw.equals(rps3)) {
			return "Player 1 wins";
		}

		else if (player1Throw.equals(rps1) && player2Throw.equals(rps3)) {
			return "Player 1 wins";
		}
		return "It's Tie";
	}

}
