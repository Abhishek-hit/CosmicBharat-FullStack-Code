package CosmicBharat.Repositories.ScriptureRespositories;

import CosmicBharat.Models.Scripture.Shastra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShastraRepository extends MongoRepository<Shastra, String> {
}
