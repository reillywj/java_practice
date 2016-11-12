public class TicTacToe {
	private int[] positions;

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.play();
	}

	public TicTacToe() {
		positions = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	}

	public void play() {
		print("Let's play a game of Tic Tac Toe.");
		print(board());
	}

	private String board() {
		String blank    = "   |   |   ";
		String blank_ln = blank + "\n";
		String dividor  = blank_ln + "---+---+---\n" + blank_ln;
		String board = blank;
		board += board_line(getPositions(0, 1, 2));
		board += dividor;
		board += board_line(getPositions(3, 4, 5));
		board += dividor;
		board += board_line(getPositions(6, 7, 8));
		board += blank;

		return board;
	}

	private int[] getPositions(int a, int b, int c) {
		return new int[] {positions[a], positions[b], positions[c]};
	}

	private String board_line(int[] cells) {
		System.out.println(cells.toString());
		return String.format(" %1s | %1s | %1s \n", cells);
	}

	private void print(String line) {
		System.out.println(line);
	}
}
