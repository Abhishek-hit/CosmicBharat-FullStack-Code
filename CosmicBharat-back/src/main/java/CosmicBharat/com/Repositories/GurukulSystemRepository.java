package CosmicBharat.com.Repositories;

import CosmicBharat.com.Models.GurukulSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GurukulSystemRepository extends MongoRepository<GurukulSystem,String> {
    List<GurukulSystem> findByTitle (String title);
}
