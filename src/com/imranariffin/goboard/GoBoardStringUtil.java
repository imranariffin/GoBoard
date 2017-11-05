package com.imranariffin.goboard;

public class GoBoardStringUtil {

	public static String toString(GoBoard board) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" ");
		for (int col=0; col<board.size(); col++) {
			sb.append(" ").append(col + 1);
		}
		sb.append("\n");
		
		for (int i=0; i<board.size(); i++) {
			sb.append(i + 1).append(" ");
			for (int j=0; j<board.size(); j++) {
				sb.append(board.getStone(i, j));
				if (j != board.size() - 1) {
					sb.append("─");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
