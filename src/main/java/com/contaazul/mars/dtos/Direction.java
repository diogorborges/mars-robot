package com.contaazul.mars.dtos;

public enum Direction {

    NORTH, SOUTH, WEST, EAST;

    static {
        NORTH.rightPosition = Direction.EAST;
        NORTH.leftPosition = Direction.WEST;
        SOUTH.rightPosition = Direction.WEST;
        SOUTH.leftPosition = Direction.EAST;
        WEST.rightPosition = Direction.NORTH;
        WEST.leftPosition = Direction.SOUTH;
        EAST.rightPosition = Direction.SOUTH;
        EAST.leftPosition = Direction.NORTH;
    }

    private Direction rightPosition;
    private Direction leftPosition;

    public Direction getRightPosition() {
        return rightPosition;
    }

    public Direction getLeftPosition() {
        return leftPosition;
    }

}
