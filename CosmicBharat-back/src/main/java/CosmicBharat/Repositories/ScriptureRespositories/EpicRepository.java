package CosmicBharat.Repositories.ScriptureRespositories;

import CosmicBharat.Models.Scripture.Epic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EpicRepository extends MongoRepository<Epic, String> {
}
