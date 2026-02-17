package CosmicBharat.Repositories.ScriptureRespositories;


import CosmicBharat.Models.Scripture.Veda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VedaRepository extends MongoRepository<Veda, String> {
}