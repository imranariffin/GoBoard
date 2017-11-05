package com.imranariffin.goboard.client;

import java.util.Scanner;

import com.imranariffin.goboard.GoBoard;
import com.imranariffin.goboard.GoBoardStringUtil;

public class GoClient {
	Scanner in;
	GoBoard board;
	
	public GoClient() {
		in = new Scanner(System.in);
		board = new GoBoard();
	}
	
	public static void main(String[] args) throws Exception {
		
		GoClient client = new GoClient();
		
		int turn = 0;
		while (true) {
			String stone = turn++ % 2 == 0 ? "B" : "W";
			
			System.out.print(turn + ": " + stone + " > ");
			String[] input = client.in.nextLine().split(",");
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);

			client.board.place(i, j);
			System.out.print(GoBoardStringUtil.toString(client.board));
		}
	}
}
