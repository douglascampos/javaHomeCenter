package br.com.codenight.homecenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Temperature {

    @RequestMapping("/temperature")
    @ResponseBody
    String temp() {
        return "Temperature controller!";
    }
}
