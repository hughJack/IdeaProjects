package com.youneek.Chess;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/5/8.
 */
public class PawnTest extends TestCase {
    public void testCreat(){
        String color = "white";
        Pawn soilder = new Pawn(color);
        assertEquals(color,soilder.getColor());

        soilder.setColor("black");
        assertEquals("black",soilder.getColor());

    }

}