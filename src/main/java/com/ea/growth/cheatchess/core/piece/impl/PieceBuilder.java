package com.ea.growth.cheatchess.core.piece.impl;

import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.Side;
import com.ea.growth.cheatchess.core.piece.Piece;
import com.ea.growth.cheatchess.core.piece.PieceType;

public class PieceBuilder {

    private Side side;
    private Coordinate coordinate;
    private PieceType pieceType;

    public PieceBuilder setSide(Side side) {
        this.side = side;
        return this;
    }

    public PieceBuilder setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    public PieceBuilder setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
        return this;
    }

    public AbstractPiece build() {
        if (side == null || coordinate == null || pieceType == null)
            throw new IllegalArgumentException("Incomplete arguments");

        AbstractPiece piece = switch (pieceType) {
            case King -> new King();
            default -> new Pawn();
        };
        piece.setSide(side);
        piece.setCoordinate(coordinate);
        return piece;
    }
}
