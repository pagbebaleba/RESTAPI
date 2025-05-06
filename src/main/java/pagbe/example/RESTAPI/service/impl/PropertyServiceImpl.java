package pagbe.example.RESTAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pagbe.example.RESTAPI.converter.PropertyConverter;
import pagbe.example.RESTAPI.entity.PropertyEntity;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;
import pagbe.example.RESTAPI.repository.PropertyRepository;
import pagbe.example.RESTAPI.service.PropertyService;

import java.util.ArrayList;
import java.util.List;


@Service
public class PropertyServiceImpl implements PropertyService {


    @Autowired
    private PropertyConverter propertyConverter;

    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public PropertyDTO SavePropertyDTO(PropertyDTO propertyDTO){

        PropertyEntity propertyEntity =  propertyConverter.convertDTOToEntity(propertyDTO);
        propertyEntity =  propertyRepository.save(propertyEntity);

        propertyDTO = propertyConverter.convertEntityToDTO(propertyEntity);

        return propertyDTO;
    }

     public List<PropertyDTO> getAllPorperties() {

         List<PropertyEntity> propertyEntityList = (List<PropertyEntity>) propertyRepository.findAll();

         List<PropertyDTO> propertyDTOList = new ArrayList<>();

         for (PropertyEntity propertyEntity : propertyEntityList){

            PropertyDTO propertyDTO = propertyConverter.convertEntityToDTO(propertyEntity);

            propertyDTOList.add(propertyDTO);
         }
         return propertyDTOList;
     }

}
