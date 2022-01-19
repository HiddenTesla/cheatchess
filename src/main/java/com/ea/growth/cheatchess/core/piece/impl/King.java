package com.ea.growth.cheatchess.core.piece.impl;

import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.piece.PieceType;

import java.util.Collection;

public class King extends AbstractPiece {

    @Override
    public final PieceType getType() {
        return PieceType.King;
    }

    @Override
    public Collection<Coordinate> findAvailableNextMoves() {
        return null;
    }
}
