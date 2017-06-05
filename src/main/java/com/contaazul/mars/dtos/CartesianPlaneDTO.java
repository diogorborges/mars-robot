package com.contaazul.mars.dtos;

public class CartesianPlaneDTO {

    private int x = 0;
    private int y = 0;

    public CartesianPlaneDTO(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static final int LIMIT = 5;

    public static int getLIMIT() {
        return LIMIT;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

}