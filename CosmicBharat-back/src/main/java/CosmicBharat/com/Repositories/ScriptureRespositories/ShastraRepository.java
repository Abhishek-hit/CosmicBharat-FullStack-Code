package CosmicBharat.com.Repositories.ScriptureRespositories;

import CosmicBharat.com.Models.Scripture.Shastra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShastraRepository extends MongoRepository<Shastra, String> {
}
