package com.example.mesInfos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Infos {
    private final String infos = "<center><h3>Ilyas Messaoudi</h3> <br> <h5>- DevOps  2023</h5><center>";
    @GetMapping("/")
    String getInfos(){
        return infos;
    }
}
