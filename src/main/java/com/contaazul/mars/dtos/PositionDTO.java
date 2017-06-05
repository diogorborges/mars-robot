package com.contaazul.mars.dtos;

/**
 * Created by DiogoBorges on 30/05/2017.
 */
public class PositionDTO {

    private Direction direction;
    private CartesianPlaneDTO cartesianPlaneDTO;

    public PositionDTO(Direction direction, CartesianPlaneDTO cartesianPlaneDTO) {
        this.direction = direction;
        this.cartesianPlaneDTO = cartesianPlaneDTO;
    }

    public void increaseY() {
        setY(getY() + 1);
    }

    public void increaseX() {
        setX(getX() + 1);
    }

    public void decreaseY() {
        setY(getY() - 1);
    }

    public void decreaseX() {
        setX(getX() - 1);
    }

    private void setX(int x) {
        cartesianPlaneDTO.setX(x);
    }

    private void setY(int y) {
        cartesianPlaneDTO.setY(y);
    }

    private Direction getRightPosition() {
        return direction.getRightPosition();
    }

    private Direction getLeftPosition() {
        return direction.getLeftPosition();
    }

    public int getY() {
        return cartesianPlaneDTO.getY();
    }

    public int getX() {
        return cartesianPlaneDTO.getX();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setRightDirection() {
        setDirection(getRightPosition());
    }

    public void setLeftDirection() {
        setDirection(getLeftPosition());
    }

    private void setDirection(Direction direction) {
        this.direction = direction;
    }

}
