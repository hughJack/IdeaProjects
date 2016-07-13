package com.youneek.Chess;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/5/12.
 */
public class BoardTest extends TestCase {

    private Pawn pawnblack;
    private Pawn pawnwhite;

    public void setUp() throws Exception {
        pawnblack = new Pawn("black");
        pawnwhite = new Pawn("white");
    }

    public void testCreat() {
        Board board = new Board();
        assertEquals(0,board.getNumberOfPawns());
        board.enroll(pawnblack);
        board.enroll(pawnwhite);
        assertEquals(pawnblack,board.get(0));
        assertEquals(pawnwhite,board.get(1));
    }


}