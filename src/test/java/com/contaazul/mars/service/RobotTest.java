package com.contaazul.mars.service;

import com.contaazul.mars.dtos.PositionDTO;
import com.contaazul.mars.exception.ControlNotAllowedException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by DiogoBorges on 01/06/2017.
 */
public class RobotTest {

    @Mock
    RobotMoviment robotMoviment;

    @Mock
    RobotRotation robotRotation;

    @InjectMocks
    Robot robot;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void treatControlsWithCommandM() {

        PositionDTO positionDTO = robot.treatControls("M");

        verify(robotMoviment).moveRobot(positionDTO);

    }

    @Test
    public void treatControlsWithCommandL() {

        PositionDTO positionDTO = robot.treatControls("L");

        verify(robotRotation).rotateLeft(positionDTO);

    }

    @Test
    public void treatControlsWithCommandR() {

        PositionDTO positionDTO = robot.treatControls("R");

        verify(robotRotation).rotateRight(positionDTO);

    }

    @Test
    public void treatControlsWithCommandMMRMMRMM() {

        PositionDTO positionDTO = robot.treatControls("MMRMMRMM");

        verify(robotMoviment, times(6)).moveRobot(positionDTO);

        verify(robotRotation, times(2)).rotateRight(positionDTO);

    }

    @Test(expected = ControlNotAllowedException.class)
    public void treatControlsWithCommandAAA() {

        robot.treatControls("AAA");

    }


}