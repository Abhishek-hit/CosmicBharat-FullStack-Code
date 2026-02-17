package CosmicBharat.Repositories;

import CosmicBharat.Models.AncientScience;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AncientScienceRepository extends MongoRepository<AncientScience, String> {
    List<AncientScience> findByCategory(String category);
}
