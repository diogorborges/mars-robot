package com.contaazul.mars.service;

import com.contaazul.mars.dtos.CartesianPlaneDTO;
import com.contaazul.mars.dtos.Direction;
import com.contaazul.mars.dtos.PositionDTO;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DiogoBorges on 04/06/2017.
 */
public class RobotRotationTest {

    RobotRotation robotRotation = new RobotRotation();

    @Test
    public void rotateRobotToRightFromNorth() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateRight(positionDTO);

        assertEquals(Direction.EAST, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToLeftFromNorth() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateLeft(positionDTO);

        assertEquals(Direction.WEST, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToRightFromSouth() {

        PositionDTO positionDTO = new PositionDTO(Direction.SOUTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateRight(positionDTO);

        assertEquals(Direction.WEST, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToLeftFromSouth() {

        PositionDTO positionDTO = new PositionDTO(Direction.SOUTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateLeft(positionDTO);

        assertEquals(Direction.EAST, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToRightFromWest() {

        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateRight(positionDTO);

        assertEquals(Direction.EAST, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToLeftFromWest() {

        PositionDTO positionDTO = new PositionDTO(Direction.WEST, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateLeft(positionDTO);

        assertEquals(Direction.SOUTH, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToRightFromEast() {

        PositionDTO positionDTO = new PositionDTO(Direction.EAST, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateRight(positionDTO);

        assertEquals(Direction.SOUTH, resultRotateRobot.getDirection());

    }

    @Test
    public void rotateRobotToLeftFromEast() {

        PositionDTO positionDTO = new PositionDTO(Direction.EAST, new CartesianPlaneDTO(0, 0));

        PositionDTO resultRotateRobot = robotRotation.rotateLeft(positionDTO);

        assertEquals(Direction.NORTH, resultRotateRobot.getDirection());

    }
}