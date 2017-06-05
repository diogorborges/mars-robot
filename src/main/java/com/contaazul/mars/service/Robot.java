package com.contaazul.mars.service;

import com.contaazul.mars.dtos.CartesianPlaneDTO;
import com.contaazul.mars.dtos.Direction;
import com.contaazul.mars.dtos.PositionDTO;
import com.contaazul.mars.exception.ControlNotAllowedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Robot {

    @Autowired
    private RobotMoviment robotMoviment;

    @Autowired
    private RobotRotation robotRotation;

    @Cacheable("controls")
    public PositionDTO treatControls(String controls) {
        PositionDTO positionDTO = new PositionDTO(Direction.NORTH, new CartesianPlaneDTO(0, 0));
        for (char control : controls.toCharArray()) {
            processControl(positionDTO, control);
        }
        return positionDTO;
    }

    private void processControl(PositionDTO positionDTO, char control) {
        switch (control) {
            case 'M':
                robotMoviment.moveRobot(positionDTO);
                break;
            case 'L':
                robotRotation.rotateLeft(positionDTO);
                break;
            case 'R':
                robotRotation.rotateRight(positionDTO);
                break;
            default:
                throw new ControlNotAllowedException(control);
        }

    }

}
