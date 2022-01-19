package com.ea.growth.cheatchess.core.piece.impl;

import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.Side;
import com.ea.growth.cheatchess.core.piece.Piece;

import java.util.Collection;

public abstract class AbstractPiece implements Piece {
    private Side side;
    private Coordinate coordinate;

    public abstract Collection<Coordinate> findAvailableNextMoves();

    public AbstractPiece setSide(Side side) {
        this.side = side;
        return this;
    }

    @Override
    public Side getSide() {
        return side;
    }

    public AbstractPiece setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}
