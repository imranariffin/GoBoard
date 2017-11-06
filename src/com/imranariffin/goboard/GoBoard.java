package com.imranariffin.goboard;

import static com.imranariffin.goboard.GoCharacters.*;

public class GoBoard {
	private int size;
	private int turns;
	
	private String[][] board;
	
	public GoBoard() {
		this(9);
	}

	public GoBoard(String[][] b) {
		size = b.length;
		turns = 0;
		board = b;
	}
	
	public GoBoard(int n) {
		size = n;
		turns = 0;
		board = new String[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				board[i][j] = E; 
			}
		}
	}
	
	public int size() {
		return size;
	}

	public int  nturns() {
		return turns;
	}

	public String getStone(int i, int j) {
		return board[i][j];
	}
	
	public boolean place(int i, int j) {
		if (!board[i][j].equals(E)) {
			return false;
		}
		String stone = turns++ % 2 == 0 ? B : W;
		setStone(stone, i, j);
		
		if (GoUtils.hasCaptured(this, i, j)) {
			GoUtils.removeCaptured(this, i, j);
		}
		
		return true;
	}

	public void setStone(String stone, int i, int j) {
		board[i][j] = stone;
	}

	public boolean placeable(int i, int j) {
		return (i >= 0 && i < size && j >= 0 && j < size);
	}
}
