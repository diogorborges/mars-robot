package com.contaazul.mars.service;

import com.contaazul.mars.dtos.PositionDTO;
import org.springframework.stereotype.Service;

@Service
class RobotRotation {

    public PositionDTO rotateLeft(PositionDTO positionDTO) {
        positionDTO.setLeftDirection();
        return positionDTO;
    }

    public PositionDTO rotateRight(PositionDTO positionDTO) {
        positionDTO.setRightDirection();
        return positionDTO;
    }
}
