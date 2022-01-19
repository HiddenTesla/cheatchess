package com.ea.growth.cheatchess.core.piece.impl;

import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.piece.PieceType;

import java.util.Collection;

public class Pawn extends AbstractPiece {

    @Override
    public PieceType getType() {
        return PieceType.Pawn;
    }

    @Override
    public Collection<Coordinate> findAvailableNextMoves() {
        return null;
    }
}
