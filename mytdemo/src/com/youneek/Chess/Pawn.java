package com.youneek.Chess;

/**
 * Created by Administrator on 2016/5/8.
 */
public class Pawn {
    private String color;
    final private String white_pawn = "white";
    final private String black_pawn = "black";

    Pawn() {
        this.color = "";
    }

    Pawn(String color) {
        this.color = color;
    }

    String getColor () {
        return color;
    }

    public void  setColor (String color) {
        this.color = color;
    }
}
