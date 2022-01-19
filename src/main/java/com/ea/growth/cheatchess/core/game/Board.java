package com.ea.growth.cheatchess.core.game;

import com.ea.growth.cheatchess.core.ChessConstant;
import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.piece.Piece;

public class Board {
    private Piece[][] pieces;

    public Board() {
        initPieces();
    }

    private void initPieces() {
        pieces = new Piece[ChessConstant.BOARD_WIDTH][ChessConstant.BOARD_HEIGHT];
    }

    public void addPiece(Piece p) {
        Coordinate coordinate = p.getCoordinate();
        pieces[coordinate.x()][coordinate.y()] = p;
    }

    public void removePiece(Coordinate c) {
        pieces[c.x()][c.y()] = null;
    }

    public String toString() {
        if (pieces == null)
          return "Board not initialized";

        StringBuilder sb = new StringBuilder();
        for (int j = ChessConstant.BOARD_HEIGHT - 1; j >= 0; j--) {
            if (j < ChessConstant.BOARD_HEIGHT - 1)
                sb.append(printDelimiterRank());
            sb.append(printRank(j));
        }

        return sb.toString();
    }

    private String printRank(int y) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ChessConstant.BOARD_WIDTH; i++) {
            Piece piece = pieces[i][y];
            if (piece == null) {
                sb.append('-');
            }
            else {
                sb.append(piece.toChar());
            }
            if (i < ChessConstant.BOARD_WIDTH - 1) {
                sb.append('-');
            }
        }

        sb.append('\n');
        return sb.toString();
    }

    private String delimiterRank = null;
    private String printDelimiterRank() {
        if (delimiterRank != null)
            return delimiterRank;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ChessConstant.BOARD_WIDTH; i++) {
            sb.append("| ");
        }
        sb.append('\n');

        delimiterRank = sb.toString();
        return delimiterRank;
    }
}
