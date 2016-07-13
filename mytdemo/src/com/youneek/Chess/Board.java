package com.youneek.Chess;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/12.
 */
public class Board {
    private Pawn pawn;
    private String colorOfpawn;
    private int numberOfPawns;
    ArrayList<Pawn> Pawns ;

    Board () {
        Pawns = new ArrayList<Pawn> ();
    }

    int getNumberOfPawns () {
        return Pawns.size();
    }

    void enroll (Pawn pawn) {
        Pawns.add(pawn);
    }

    Pawn get(int index) {
        return Pawns.get(index);
    }
}
