package pagbe.example.RESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;
import pagbe.example.RESTAPI.service.PropertyService;


@RestController
@RequestMapping("/api/v1/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    //http://localhost:8081/api/v1/properties/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Anton comment tu vas ? ";
    }

    @PostMapping("/save")
    public PropertyDTO saveProperties(@RequestBody PropertyDTO propertyDTO){
        propertyService.SavePropertyDTO(propertyDTO);
        System.out.println( propertyDTO);
        return propertyDTO;
    }

}
