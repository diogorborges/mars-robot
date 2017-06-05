package com.contaazul.mars.controllers;

import com.contaazul.mars.dtos.PositionDTO;
import com.contaazul.mars.service.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/rest/mars/", produces = "application/json")
public class RobotController {

    @Autowired
    private Robot robot;

    @RequestMapping(method = POST, value ="{controls}")
    public PositionDTO robotControl(@PathVariable String controls) {
        return robot.treatControls(controls);
    }

}