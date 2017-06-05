package com.contaazul.mars.service;

import com.contaazul.mars.dtos.CartesianPlaneDTO;
import com.contaazul.mars.dtos.PositionDTO;
import com.contaazul.mars.exception.PositionNotAllowedException;
import org.springframework.stereotype.Service;

@Service
class RobotMoviment {

    PositionDTO moveRobot(PositionDTO positionDTO) {
        switch (positionDTO.getDirection()) {
            case NORTH:
                positionDTO.increaseY();
                verifyLimit(positionDTO.getY());
                break;
            case SOUTH:
                positionDTO.decreaseY();
                verifyLimit(positionDTO.getY());
                break;
            case EAST:
                positionDTO.increaseX();
                verifyLimit(positionDTO.getX());
                break;
            case WEST:
                positionDTO.decreaseX();
                verifyLimit(positionDTO.getX());
                break;
        }

        return positionDTO;
    }

    private void verifyLimit(int position) {
        if (position > CartesianPlaneDTO.getLIMIT() || position < 0) {
            throw new PositionNotAllowedException(position);
        }
    }

}
