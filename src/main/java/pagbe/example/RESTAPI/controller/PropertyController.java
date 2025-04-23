package pagbe.example.RESTAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/properties")
public class PropertyController {


    //http://localhost:8081/api/v1/properties/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Anton comment tu vas ? ";
    }


}
