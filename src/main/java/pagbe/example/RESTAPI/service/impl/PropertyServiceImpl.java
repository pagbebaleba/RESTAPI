package pagbe.example.RESTAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pagbe.example.RESTAPI.converter.PropertyConverter;
import pagbe.example.RESTAPI.entity.PropertyEntity;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;
import pagbe.example.RESTAPI.repository.PropertyRepository;
import pagbe.example.RESTAPI.service.PropertyService;


 @Service
public class PropertyServiceImpl implements PropertyService {


    @Autowired
    private PropertyConverter propertyConverter;

    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public PropertyDTO SavePropertyDTO(PropertyDTO propertyDTO){

        PropertyEntity propertyEntity =  propertyConverter.convertDTOToEntity(propertyDTO);
        propertyRepository.save(propertyEntity);

        return  null;
    }

}
