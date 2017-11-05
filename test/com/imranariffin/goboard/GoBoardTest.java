package com.imranariffin.goboard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.imranariffin.goboard.GoBoard;
import static com.imranariffin.goboard.GoCharacters.*;

public class GoBoardTest {

	GoBoard boardDefault;
	GoBoard board13;
	GoBoard board19;
	
	@Before
	public void setUp() throws Exception {
		boardDefault = new GoBoard();
		board13 = new GoBoard(13);
		board19 = new GoBoard(19);
	}

	@Test
	public void test_Constructor_BoardHasDefaultSizeOf9() {
		assertEquals(9, boardDefault.size());
		assertEquals(13, board13.size());
		assertEquals(19, board19.size());
	}
	@Test
	public void test_shouldBeginWithEmptyBoard() {
		assertEquals(0, boardDefault.nturns());
		assertEquals(0, board13.nturns());
		assertEquals(0, board19.nturns());
	}
	
	@Test
	public void test_Place_FirstPlacementIsAlwaysBlack() throws Exception {
		boardDefault.place(0, 0);
		assertEquals(B, boardDefault.getStone(0, 0));
	}
	
	@Test
	public void test_Place_ReturnsFalse_IfPlaceOnOccupiedPosition() {
		assertTrue(boardDefault.place(0, 0));
		assertFalse(boardDefault.place(0, 0));
	}
	
//	@Test
//	public void test_Place_RemovesOpponentStones_IfPlaceOnACapturingPosition() {
//		boardDefault.place(5, 5);
//		boardDefault.place(4, 3);
//		boardDefault.place(6, 4);
//		boardDefault.place(5, 4);
//		boardDefault.place(4, 4);
//		boardDefault.place(4, 5);
//		boardDefault.place(5, 3);
//		
//		assertEquals(E, boardDefault.getStone(5, 4));
//	}
}
