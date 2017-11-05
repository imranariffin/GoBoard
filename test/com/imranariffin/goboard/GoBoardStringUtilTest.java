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
				"  1 2 3 4 5 6 7 8 9\n"+
				"1 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"2 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"3 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+				
				"4 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"5 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"6 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"7 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"8 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"9 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n";
		assertEquals(expected, GoBoardStringUtil.toString(board));
	}

	
	@Test
	public void test_ShouldDrawCorrectlyAfterBlackStonePlaced() throws Exception {
		GoBoard board = new GoBoard();
		board.place(0, 0);
		String expected =
				"  1 2 3 4 5 6 7 8 9\n"+
				"1 Ø─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"2 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"3 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+				
				"4 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"5 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"6 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"7 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"8 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"9 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n";
		
		assertEquals(expected, GoBoardStringUtil.toString(board));		
	}
	
	@Test
	public void test_ShouldDrawCorrectlyAfterSecondStonePlaced() throws Exception {
		GoBoard board = new GoBoard();
		board.place(0, 0);
		board.place(0, 1);
		String expected =
				"  1 2 3 4 5 6 7 8 9\n"+
				"1 Ø─O─┼─┼─┼─┼─┼─┼─┼\n"+
				"2 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"3 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+				
				"4 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"5 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"6 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"7 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"8 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n"+
				"9 ┼─┼─┼─┼─┼─┼─┼─┼─┼\n";
		assertEquals(expected, GoBoardStringUtil.toString(board));		
	}
}
