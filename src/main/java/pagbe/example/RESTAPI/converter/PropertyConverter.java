package pagbe.example.RESTAPI.converter;

import org.springframework.stereotype.Component;
import pagbe.example.RESTAPI.entity.PropertyEntity;
import pagbe.example.RESTAPI.model.dto.PropertyDTO;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOToEntity(PropertyDTO propertyDTO){

        PropertyEntity propertyEntity =  new PropertyEntity();
        propertyEntity.setTitle(propertyDTO.getTitle());
        propertyEntity.setAddress(propertyDTO.getAddress());
        propertyEntity.setOwnerEmail(propertyDTO.getOwnerEmail());
        propertyEntity.setOwnerName(propertyDTO.getOwnerName());
        propertyEntity.setPrice(propertyDTO.getPrice());
        propertyEntity.setDescription(propertyDTO.getDescription());

        return propertyEntity;

    }

    public PropertyDTO convertEntityToDTO(PropertyEntity propertyEntity){

        PropertyDTO propertyDTO =  new PropertyDTO();
        propertyDTO.setId(propertyEntity.getId());
        propertyDTO.setAddress(propertyEntity.getAddress());
        propertyDTO.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDTO.setOwnerName(propertyEntity.getOwnerName());
        propertyDTO.setPrice(propertyEntity.getPrice());
        propertyDTO.setDescription(propertyEntity.getDescription());
        propertyDTO.setTitle(propertyEntity.getTitle());

        return propertyDTO;

    }

}


