package com.ea.growth.cheatchess.core.piece;

public enum PieceType {
    King        ('k', 'K'),
    Advisor     ('a', 'A'),
    Bishop      ('b', 'B'),
    Knight      ('n', 'N'),
    Rook        ('r', 'R'),
    Cannon      ('c',  'C'),
    Pawn        ('p',  'P'),
    ;
    private char abbrRed;
    private char abbrBlack;

    PieceType(char abbrRed, char abbrBlack) {
        this.abbrRed = abbrRed;
        this.abbrBlack = abbrBlack;
    }

    public char toAbbrRed() {
        return abbrRed;
    }

    public char toAbbrBlack() {
        return abbrBlack;
    }
}
