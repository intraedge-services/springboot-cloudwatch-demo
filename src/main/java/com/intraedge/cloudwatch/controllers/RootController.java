package com.intraedge.cloudwatch.controllers;

import com.intraedge.cloudwatch.representation.RootRepresentation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public RootRepresentation getRoot() {
        return new RootRepresentation("1.0", "cloudwatch-demo");
    }
}
