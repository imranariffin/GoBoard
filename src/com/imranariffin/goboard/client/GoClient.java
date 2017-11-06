package com.imranariffin.goboard.client;

import java.util.Scanner;

import com.imranariffin.goboard.GoBoard;
import com.imranariffin.goboard.GoBoardStringUtil;

public class GoClient {
	Scanner in;
	GoBoard board;
	static int turn;
	
	public GoClient() {
		in = new Scanner(System.in);
		board = new GoBoard();
	}
	
	public static void main(String[] args) throws Exception {
		
		GoClient client = new GoClient();
		turn = 0;
		
		while (true) {
				System.out.print("Select size");
				if (!client.in.hasNextInt()) {
					continue;
				}
				int size = Integer.parseInt(client.in.nextLine());
				if (size != 9 && size != 13 && size != 19) {
					System.out.println("Invalid board size. Choose either 9, 13 or 19:");
					continue;
				}
				client.board = new GoBoard(size);
				break;
		}
		
		System.out.print(GoBoardStringUtil.toString(client.board));
		
		while (true) {
			String stone = turn++ % 2 == 0 ? "B" : "W";
			System.out.print(turn + ": " + stone + " > ");
			
			String input = client.in.nextLine();
			switch(input) {
				case "pass": break;
				case "resign": break;
				case "exit": return;
				default:
					client.handlePlacement(input);
			}
		}
	}
	
	private void handlePlacement(String input) {
		String[] pos = input.split(",");
		int i = Integer.parseInt(pos[0]) - 1;
		int j = Integer.parseInt(pos[1]) - 1;

		board.place(i, j);
		System.out.print(GoBoardStringUtil.toString(board));
	}
}
