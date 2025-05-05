package pagbe.example.RESTAPI.repository;

import org.springframework.data.repository.CrudRepository;
import pagbe.example.RESTAPI.entity.PropertyEntity;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
}
