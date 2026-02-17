package CosmicBharat.Repositories.ScriptureRespositories;

import CosmicBharat.Models.Scripture.Gita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GitaRepository extends MongoRepository<Gita, String> {
}