package com.imranariffin.goboard;

import static com.imranariffin.goboard.GoCharacters.*;

public class GoUtils {
	static GoBoard mGoBoard;
	public static boolean hasCaptured(GoBoard goBoard, int i, int j) {
		boolean[][] visited;
		mGoBoard = goBoard;
		int n = mGoBoard.size();
		String stone = mGoBoard.getStone(i, j);
		
		int[][] sides = new int[][] {
			{i - 1, j}, {i + 1, j}, 
			{i, j - 1}, {i, j + 1},
			{i - 1, j - 1}, {i + 1, j + 1}, 
			{i + 1, j - 1}, {i - 1, j + 1},
		};
		
		for (int[] side: sides) {
			int ii = side[0];
			int jj = side[1];
			
			if (ii >= 0 && ii < n && jj >= 0 && jj < n) {
				visited = new boolean[n][n];
				String neighborStone = mGoBoard.getStone(ii, jj);
				
				if (!neighborStone.equals(E)) {
					if (!neighborStone.equals(stone)) {
						if (captured(visited, neighborStone, ii, jj)) {
							return true;						
						}
					}	
				}	
			}
		}
		
		return false;
	}

	static boolean captured(boolean[][] v, String stone, int i, int j) {
		if (i < 0 || i >= v.length || j < 0 || j >= v.length) {
			return true;
		}
		
		if (mGoBoard.getStone(i, j).equals(E)) {
			return false;
		}
		
		if (v[i][j]) {
			return true;
		}
		
		if (!mGoBoard.getStone(i, j).equals(stone)) {
			return true;
		}
		
		v[i][j] = true;
		
		return 
				captured(v, stone, i - 1, j) &&
				captured(v, stone, i + 1, j) &&
				captured(v, stone, i, j - 1) &&
				captured(v, stone, i, j + 1);
	}

	public static void removeCaptured(GoBoard goBoard, int i, int j) {
		int[][] sides = new int[][] {
			{i - 1, j}, {i + 1, j}, 
			{i, j - 1}, {i, j + 1},
			{i - 1, j - 1}, {i + 1, j + 1}, 
			{i + 1, j - 1}, {i - 1, j + 1},
		};		
		
		mGoBoard = goBoard;
		for (int[] side: sides) {
			int ii = side[0];
			int jj = side[1];
			if (mGoBoard.placeable(ii, jj)) {
				int n = mGoBoard.size();
				boolean[][] visited = new boolean[n][n];
				String neighbourStone = mGoBoard.getStone(ii, jj);
				if (captured(visited, neighbourStone, ii, jj)) {
					visited = new boolean[n][n];
					remove(visited, neighbourStone, ii, jj);
				}	
			}
		}
	}

	private static void remove(boolean[][] v, String stone, int i, int j) {
		int n = mGoBoard.size();
		if (i < 0 || i >= n || j < 0 || j >= n) {
			return;
		}
		
		if (v[i][j] || !mGoBoard.getStone(i, j).equals(stone)) {
			return;
		}
		
		mGoBoard.setStone(E, i, j);
		v[i][j] = true;
		
		int[][] sides = new int[][] {
			{i - 1, j}, {i + 1, j}, 
			{i, j - 1}, {i, j + 1},
			{i - 1, j - 1}, {i + 1, j + 1}, 
			{i + 1, j - 1}, {i - 1, j + 1},
		};
		
		for (int[] side: sides) {
			int ii = side[0];
			int jj = side[1];
			remove(v, stone, ii, jj);
		}
	}
}
