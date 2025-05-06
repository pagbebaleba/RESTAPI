package pagbe.example.RESTAPI.service;

import pagbe.example.RESTAPI.model.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {


    PropertyDTO SavePropertyDTO(PropertyDTO propertyDTO);

    List<PropertyDTO> getAllPorperties();

    PropertyDTO updateProperty(PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updateDescription(PropertyDTO propertyDTO, Long propertyId);
    PropertyDTO updatePrice(PropertyDTO propertyDTO, Long propertyId);

}