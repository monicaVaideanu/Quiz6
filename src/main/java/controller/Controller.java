package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class Controller {
    @GetMapping("add/first/{first}/second/{second}")
    @ResponseBody
    public String getSum(@PathVariable String first, @PathVariable String second){
        return Integer.parseInt(first) + Integer.parseInt(second) + "";
    }
}
