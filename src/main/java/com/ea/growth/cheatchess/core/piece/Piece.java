package com.ea.growth.cheatchess.core.piece;

import com.ea.growth.cheatchess.core.Coordinate;
import com.ea.growth.cheatchess.core.Side;

import java.util.Collection;

public interface Piece {
    Side getSide();
    PieceType getType();
    Coordinate getCoordinate();
    Collection<Coordinate> findAvailableNextMoves();

    default char toChar() {
        PieceType pieceType = getType();
        if (getSide() == Side.Red)
            return pieceType.toAbbrRed();
        else
            return pieceType.toAbbrBlack();
    }
}
