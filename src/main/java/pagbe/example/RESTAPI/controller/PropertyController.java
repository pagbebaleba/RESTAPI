package pagbe.example.RESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;
import pagbe.example.RESTAPI.service.PropertyService;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    //http://localhost:8081/api/v1/properties/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Anton comment tu vas ? ";
    }

    @PostMapping("/properties")
    public ResponseEntity<PropertyDTO> saveProperties(@RequestBody PropertyDTO propertyDTO) {
        propertyDTO = propertyService.SavePropertyDTO(propertyDTO);
        System.out.println(propertyDTO);
        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/properties")
    public ResponseEntity<List<PropertyDTO>> getAllProperties() {

        List<PropertyDTO>  propertyDTOList = propertyService.getAllPorperties();

        ResponseEntity<List<PropertyDTO>> responseEntity = new ResponseEntity<>(propertyDTOList, HttpStatus.OK);
        return responseEntity;
    }


    @PutMapping("/properties/{propertyID}")
    public ResponseEntity<PropertyDTO> updatePropertyDescription(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyID) {

        propertyDTO = propertyService.updateProperty(propertyDTO, propertyID );

        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);
        return responseEntity;
    }

    @PatchMapping("/properties/update-description/{propertyID}")
    public ResponseEntity<PropertyDTO> updateDescription(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyID) {

        propertyDTO = propertyService.updateDescription(propertyDTO, propertyID );

        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/properties/update-price/{propertyID}")
    public ResponseEntity<PropertyDTO> updatePrice(@RequestBody PropertyDTO propertyDTO, @PathVariable Long propertyID) {

        propertyDTO = propertyService.updatePrice(propertyDTO, propertyID );

        ResponseEntity<PropertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

}