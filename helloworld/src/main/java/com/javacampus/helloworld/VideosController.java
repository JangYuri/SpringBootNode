package com.javacampus.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideosController {
    @RequestMapping(value = "/videos")
    public String index(){
        return "강좌 리스트";
    }
}
