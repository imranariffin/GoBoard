package com.imranariffin.goboard;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static com.imranariffin.goboard.GoCharacters.*;

public class GoUtilsTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_Captured_ReturnsTrue_GivenSimpleTerritory() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, W, E, E, E, E},
			{E, E, E, W, B, W, E, E, E},
			{E, E, E, E, W, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 2;
		int j = 4;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, B, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsTrue_GivenSimpleTerritoryReversedColor() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 2;
		int j = 4;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, W, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsFalse_GivenSimpleTerritoryTwoEyes() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, W, E, E, E, E},
			{E, E, E, W, B, W, E, E, E},
			{E, E, E, W, E, W, E, E, E},
			{E, E, E, E, W, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 2;
		int j = 4;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertFalse(GoUtils.captured(v, B, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsFalse_GivenSimpleTerritoryTwoEyesReversedColor() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, B, E, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 2;
		int j = 4;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertFalse(GoUtils.captured(v, W, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsTrue_GivenThreeEyedTerritory() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, B, W, W, B, E, E},
			{E, E, E, E, B, B, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 3;
		int j = 5;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, W, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsFalse_GivenThreeEyedAtari() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, B, W, W, E, E, E},
			{E, E, E, E, B, B, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 3;
		int j = 5;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertFalse(GoUtils.captured(v, W, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsTrue_GivenOneEyedTerritoryAtWall() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, W},
			{E, E, E, E, E, E, E, W, B},
			{E, E, E, E, E, E, E, E, W},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 2;
		int j = 8;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, B, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsTrue_GivenFourEyedTerritoryAtWall() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, W},
			{E, E, E, E, E, E, E, W, B},
			{E, E, E, E, E, E, E, W, B},
			{E, E, E, E, E, E, W, B, B},
			{E, E, E, E, E, E, E, W, W},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 3;
		int j = 8;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, B, i, j));
	}
	
	@Test
	public void test_Captured_ReturnsTrue_GivenOneEyedTerritoryAtCorner() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, W},
			{E, E, E, E, E, E, E, W, B},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 8;
		int j = 8;
		boolean[][] v = new boolean[m.length][m.length];
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.captured(v, B, i, j));
	}
	
	@Test
	public void test_HasCaptured_ReturnsTrue_WhenPlacementPlacementZeroesOpponentLibertySimpleCorner() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, W},
			{E, E, E, E, E, E, E, W, B},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 7;
		int j = 8;
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 8;
		j = 7;
		assertTrue(GoUtils.hasCaptured(board, i, j));
	}
	
	@Test
	public void test_HasCaptured_ReturnsTrue_WhenPlacementZeroesOpponentLibertyMidSimple() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 3;
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 3;
		j = 4;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 4;
		j = 5;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 5;
		j = 4;
		assertTrue(GoUtils.hasCaptured(board, i, j));
	}
	
	public void test_HasCaptured_ReturnsFalse_WhenPlacementLeavesOpponentSomeLibertyMidSimple() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 3;
		GoUtils.mGoBoard = board;
		assertFalse(GoUtils.hasCaptured(board, i, j));
		
		i = 3;
		j = 4;
		assertFalse(GoUtils.hasCaptured(board, i, j));
		
		i = 4;
		j = 5;
		assertFalse(GoUtils.hasCaptured(board, i, j));
	}
	
	@Test
	public void test_HasCaptured_ReturnsTrue_WhenPlacementZeroesOpponentLibertyMidTwoEyes() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 3;
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 3;
		j = 4;
		assertTrue(GoUtils.hasCaptured(board, i, j));
		
		i = 4;
		j = 5;
		assertTrue(GoUtils.hasCaptured(board, i, j));
	}
	
	@Test
	public void test_HasCaptured_ReturnsTrue_WhenPlacementZeroesOpponentMultipleCaptures() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, B, E, E, E},
			{E, E, E, B, B, W, B, B, E},
			{E, E, B, W, B, W, W, B, E},
			{E, E, E, B, W, B, B, B, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 3;
		int j = 4;
		GoUtils.mGoBoard = board;
		assertTrue(GoUtils.hasCaptured(board, i, j));
	}
	
	@Test
	public void test_RemoveCaptured_ReplaceAllCapturedStonesWithEmptyStone_GivenAPositionSimpleOneEyedTerritory() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 4;
		GoUtils.removeCaptured(board, i, j);
		assertEquals(E, board.getStone(i, j));
	}
	
	@Test
	public void test_RemoveCaptured_ReplaceAllCapturedStonesWithEmptyStone_GivenAPositionTwoEyedTerritory() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, B, W, B, E, E, E},
			{E, E, E, E, B, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 4;
		GoUtils.removeCaptured(board, i, j);
		assertEquals(E, board.getStone(i, j));
		assertEquals(E, board.getStone(i + 1, j));
	}
	
	@Test
	public void test_RemoveCaptured_ReplaceAllCapturedStonesWithEmptyStone_GivenAPositionMultipleEyedTerritory() {
		String[][] m = new String[][] {
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, E, E, E, E, E, E},
			{E, E, E, B, B, E, E, E, E},
			{E, E, B, W, W, B, B, B, E},
			{E, E, E, B, W, B, W, B, E},
			{E, E, E, B, W, W, W, B, E},
			{E, E, E, E, B, W, B, E, E},
			{E, E, E, E, E, B, E, E, E},
			{E, E, E, E, E, E, E, E, E},
		};
		GoBoard board = new GoBoard(m);
		
		int i = 4;
		int j = 4;
		GoUtils.removeCaptured(board, i, j);
		assertEquals(E, board.getStone(4, 4));
		assertEquals(E, board.getStone(5, 4));
		assertEquals(E, board.getStone(3, 3));
		assertEquals(E, board.getStone(3, 4));
		assertEquals(E, board.getStone(5, 5));
		assertEquals(E, board.getStone(6, 5));
		assertEquals(E, board.getStone(5, 6));
		assertEquals(E, board.getStone(4, 6));
		
		assertEquals(B, board.getStone(3, 2));
		assertEquals(B, board.getStone(2, 3));
		assertEquals(B, board.getStone(2, 4));
		assertEquals(B, board.getStone(3, 5));
		assertEquals(B, board.getStone(6, 6));
	}
}
