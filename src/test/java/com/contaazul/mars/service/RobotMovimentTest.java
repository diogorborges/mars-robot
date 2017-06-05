package com.contaazul.mars.service;

import com.contaazul.mars.dtos.CartesianPlaneDTO;
import com.contaazul.mars.dtos.Direction;
import com.contaazul.mars.dtos.PositionDTO;
import com.contaazul.mars.exception.PositionNotAllowedException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by DiogoBorges on 31/05/2017.
 */

public class RobotMovimentTest {

    RobotMoviment robotMoviment = new RobotMoviment();

    @Test
    public void moveRobotToNorth() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultMoveRobot = robotMoviment.moveRobot(positionDTO);

        Assert.assertEquals(resultMoveRobot.getY(), 1);
        Assert.assertEquals(resultMoveRobot.getX(), 0);

    }

    @Test
    public void moveRobotToSouth() {

        PositionDTO positionDTO = new PositionDTO(Direction.SOUTH, new CartesianPlaneDTO(0, 2));

        PositionDTO resultMoveRobot = robotMoviment.moveRobot(positionDTO);

        Assert.assertEquals(resultMoveRobot.getY(), 1);
        Assert.assertEquals(resultMoveRobot.getX(), 0);

    }

    @Test
    public void moveRobotToEast() {

        PositionDTO positionDTO = new PositionDTO(Direction.EAST, new CartesianPlaneDTO(0, 0));

        PositionDTO resultMoveRobot = robotMoviment.moveRobot(positionDTO);

        Assert.assertEquals(resultMoveRobot.getX(), 1);
        Assert.assertEquals(resultMoveRobot.getY(), 0);

    }

    @Test
    public void moveRobotToWest() {

        PositionDTO positionDTO = new PositionDTO(Direction.WEST, new CartesianPlaneDTO(2, 0));

        PositionDTO resultMoveRobot = robotMoviment.moveRobot(positionDTO);

        Assert.assertEquals(resultMoveRobot.getX(), 1);
        Assert.assertEquals(resultMoveRobot.getY(), 0);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToNorthWithVerifyLimit() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 5));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToNorthWithVerifyPosition() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, -2));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToSouthWithVerifyLimit() {

        PositionDTO positionDTO = new PositionDTO(Direction.SOUTH, new CartesianPlaneDTO(0, 7));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToSouthWithVerifyPosition() {

        PositionDTO positionDTO = new PositionDTO(Direction.SOUTH, new CartesianPlaneDTO(0, 0));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToEastWithVerifyLimit() {

        PositionDTO positionDTO = new PositionDTO(Direction.EAST, new CartesianPlaneDTO(5, 0));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToWestWithVerifyLimit() {

        PositionDTO positionDTO = new PositionDTO(Direction.WEST, new CartesianPlaneDTO(7, 0));

        robotMoviment.moveRobot(positionDTO);

    }

    @Test(expected = PositionNotAllowedException.class)
    public void moveRobotToWestWithVerifyPosition() {

        PositionDTO positionDTO = new PositionDTO(Direction.WEST, new CartesianPlaneDTO(0, 0));

        robotMoviment.moveRobot(positionDTO);

    }
}