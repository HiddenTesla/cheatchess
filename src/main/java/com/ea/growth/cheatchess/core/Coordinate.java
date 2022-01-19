package com.ea.growth.cheatchess.core;

public record Coordinate(int x, int y) {

    public Coordinate {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static Coordinate of() {
        return new Coordinate(0, 0);
    }

    public static Coordinate of(int x, int y) {
        return new Coordinate(x, y);
    }

}
