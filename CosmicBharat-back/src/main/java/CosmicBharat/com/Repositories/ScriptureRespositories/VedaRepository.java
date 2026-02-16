package CosmicBharat.com.Repositories.ScriptureRespositories;


import CosmicBharat.com.Models.Scripture.Veda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VedaRepository extends MongoRepository<Veda, String> {
}