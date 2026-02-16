package CosmicBharat.com.Repositories.ScriptureRespositories;

import CosmicBharat.com.Models.Scripture.Epic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EpicRepository extends MongoRepository<Epic, String> {
}
