package pl.jdev.opes_integration.integration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @GetMapping("/status")
    @ResponseBody
    public Object status() {
        //TODO: implement status request
        return null;
    }
}
