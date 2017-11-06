package com.imranariffin.goboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GoBoardStringUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_ShouldDrawEmptyDefaultBoardCorrectly() {
		GoBoard board = new GoBoard();
		String expected =
				
				"╔════════════════════════╗\n"+
				"║    A B C D E F G H J   ║\n"+
				"║  1 ┌─┬─┬─┬─┬─┬─┬─┬─┐   ║\n"+
				"║  2 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  3 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  4 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  5 ├─┼─┼─┼─╬─┼─┼─┼─┤   ║\n"+
				"║  6 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  7 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  8 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  9 └─┴─┴─┴─┴─┴─┴─┴─┘   ║\n"+
				"║   -- Go Terminal --    ║\n"+
				"╚════════════════════════╝\n";
		
		assertEquals(expected, GoBoardStringUtil.toString(board));
	}

	@Test
	public void test_ShouldDrawEmptyBoard13Correctly() {
		GoBoard board = new GoBoard(13);
		String expected =
				
				"╔════════════════════════════════╗\n"+
				"║    A B C D E F G H J K L M N   ║\n"+
				"║  1 ┌─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┐   ║\n"+
				"║  2 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  3 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  4 ├─┼─┼─╬─┼─┼─╬─┼─┼─╬─┼─┼─┤   ║\n"+
				"║  5 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  6 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  7 ├─┼─┼─╬─┼─┼─╬─┼─┼─╬─┼─┼─┤   ║\n"+
				"║  8 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  9 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 10 ├─┼─┼─╬─┼─┼─╬─┼─┼─╬─┼─┼─┤   ║\n"+
				"║ 11 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 12 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 13 └─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┘   ║\n"+
				"║        -- Go Terminal --       ║\n"+
				"╚════════════════════════════════╝\n";
		
		assertEquals(expected, GoBoardStringUtil.toString(board));
	}
	
	@Test
	public void test_ShouldDrawEmptyBoard19Correctly() {
		GoBoard board = new GoBoard(19);
		String expected =
				
				"╔════════════════════════════════════════════╗\n"+
				"║    A B C D E F G H J K L M N O P Q R S T   ║\n"+
				"║  1 ┌─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┬─┐   ║\n"+
				"║  2 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  3 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  4 ├─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┤   ║\n"+
				"║  5 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  6 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  7 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  8 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  9 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 10 ├─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┤   ║\n"+
				"║ 11 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 12 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 13 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 14 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 15 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 16 ├─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┼─┼─┼─╬─┼─┼─┤   ║\n"+
				"║ 17 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 18 ├─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║ 19 └─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┴─┘   ║\n"+
				"║              -- Go Terminal --             ║\n"+
				"╚════════════════════════════════════════════╝\n";

		assertEquals(expected, GoBoardStringUtil.toString(board));
	}
	
	@Test
	public void test_ShouldDrawCorrectlyAfterBlackStonePlaced() throws Exception {
		GoBoard board = new GoBoard();
		board.place(0, 0);
		String expected =
				
				"╔════════════════════════╗\n"+
				"║    A B C D E F G H J   ║\n"+
				"║  1 ○─┬─┬─┬─┬─┬─┬─┬─┐   ║\n"+
				"║  2 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  3 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  4 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  5 ├─┼─┼─┼─╬─┼─┼─┼─┤   ║\n"+
				"║  6 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  7 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  8 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  9 └─┴─┴─┴─┴─┴─┴─┴─┘   ║\n"+
				"║   -- Go Terminal --    ║\n"+
				"╚════════════════════════╝\n";
		
		assertEquals(expected, GoBoardStringUtil.toString(board));		
	}
	
	@Test
	public void test_ShouldDrawCorrectlyAfterSecondStonePlaced() throws Exception {
		GoBoard board = new GoBoard();
		board.place(0, 0);
		board.place(0, 1);
		String expected =
				
				"╔════════════════════════╗\n"+
				"║    A B C D E F G H J   ║\n"+
				"║  1 ○─●─┬─┬─┬─┬─┬─┬─┐   ║\n"+
				"║  2 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  3 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  4 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  5 ├─┼─┼─┼─╬─┼─┼─┼─┤   ║\n"+
				"║  6 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  7 ├─┼─╬─┼─┼─┼─╬─┼─┤   ║\n"+
				"║  8 ├─┼─┼─┼─┼─┼─┼─┼─┤   ║\n"+
				"║  9 └─┴─┴─┴─┴─┴─┴─┴─┘   ║\n"+
				"║   -- Go Terminal --    ║\n"+
				"╚════════════════════════╝\n";
		
		assertEquals(expected, GoBoardStringUtil.toString(board));		
	}
}
