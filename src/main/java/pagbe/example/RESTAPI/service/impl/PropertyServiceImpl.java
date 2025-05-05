package pagbe.example.RESTAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pagbe.example.RESTAPI.entity.PropertyEntity;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;
import pagbe.example.RESTAPI.repository.PropertyRepository;
import pagbe.example.RESTAPI.service.PropertyService;


 @Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public PropertyDTO SavePropertyDTO(PropertyDTO propertyDTO){

        PropertyEntity propertyEntity =  new PropertyEntity();
        propertyEntity.setTitle(propertyDTO.getTitle());
        propertyEntity.setAddress(propertyDTO.getAddress());
        propertyEntity.setOwnerEmail(propertyDTO.getOwnerEmail());
        propertyEntity.setOwnerName(propertyDTO.getOwnerName());
        propertyEntity.setPrice(propertyDTO.getPrice());

        propertyRepository.save(propertyEntity);

        return  null;
    }

}
