package CosmicBharat.com.Repositories.ScriptureRespositories;

import CosmicBharat.com.Models.Scripture.Gita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GitaRepository extends MongoRepository<Gita, String> {
}