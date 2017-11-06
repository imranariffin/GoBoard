package com.imranariffin.goboard;

import static com.imranariffin.goboard.GoCharacters.*;

public class GoBoardStringUtil {

	public static String toString(GoBoard board) {
		StringBuilder sb = new StringBuilder();
		int size = board.size();
		sb.append(header(size));
		sb.append(body(board));
		sb.append(footer(size));
		return sb.toString();
	}
	
	private static String header(int size) {
		StringBuilder sb = new StringBuilder();
		switch(size) {
			case 19:
				sb.append("╔════════════════════════════════════════════╗\n");
				sb.append("║    A B C D E F G H J K L M N O P Q R S T   ║\n");
				break;
			case 13:
				sb.append("╔════════════════════════════════╗\n");
				sb.append("║    A B C D E F G H J K L M N   ║\n");
				break;
			case 9:
				sb.append("╔════════════════════════╗\n");
				sb.append("║    A B C D E F G H J   ║\n");
				break;
		}
		return sb.toString();
	}
	
	private static String body(GoBoard board) {
		int size = board.size();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<size; i++) {
			if (i < 9) {
				sb.append("║  " + (i + 1) + " ");
			} else {
				sb.append("║ " + (i + 1) + " ");
			}
			for (int j=0; j<size; j++) {
				String stone = board.getStone(i, j);
				if (i == 0 && j == 0) {
					sb.append(stone.equals(E)? "┌─" : stone + "─");
				} else if (i == 0 && j == size - 1) {
					sb.append(stone.equals(E)? "┐" : stone);
				} else if (i == size - 1 && j == 0) {
					sb.append(stone.equals(E)? "└─" : stone + "─");
				} else if (i == size - 1 && j == size - 1) {
					sb.append(stone.equals(E)? "┘" : stone);
				} else if (isHoshi(size, i, j)) {
					sb.append(stone.equals(E)? "╬─" : stone + "─");
				} else if (i == 0) {
					sb.append(stone.equals(E)? "┬─" : stone + "─");
				} else if (i == size - 1) {
					sb.append(stone.equals(E)? "┴─" : stone + "─");
				} else if (j == 0) {
					sb.append(stone.equals(E)? "├─" : stone + "─");
				} else if (j == size - 1) {
					sb.append(stone.equals(E)? "┤" : stone);
				} else {
					sb.append(stone.equals(E)? "┼─" : stone + "─");
				}
			}
			sb.append("   ║\n");
		}
		return sb.toString();
	}
	
	private static String footer(int size) {
		StringBuilder sb = new StringBuilder();
		switch(size) {
			case 19:
				sb.append("║              -- Go Terminal --             ║\n");
				sb.append("╚════════════════════════════════════════════╝\n");
				break;
			case 13:
				sb.append("║        -- Go Terminal --       ║\n");
				sb.append("╚════════════════════════════════╝\n");
				break;
			case 9:
				sb.append("║   -- Go Terminal --    ║\n");
				sb.append("╚════════════════════════╝\n");
				break;
		}
		return sb.toString();
	}
	
	private static boolean isHoshi(int size, int i, int j) {
		if (size == 9) {
			return 
					i == 4 && j == 4 // Tengen
					|| i == 2 && j == 2
					|| i == 2 && j == 6
					|| i == 6 && j == 2
					|| i == 6 && j == 6
			;
		} else {
			int n = size;
			return 
					(i == 3 || i == n / 2 || i == n - 4) &&
					(j == 3 || j == n / 2 || j == n - 4)
			;
		}
	}
}
