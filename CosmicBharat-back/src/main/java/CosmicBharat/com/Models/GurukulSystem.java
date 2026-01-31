package CosmicBharat.com.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "knowledge_systems")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GurukulSystem {
    private String id;
    private String title;      // e.g., "Rig Veda"
    private String category;   // e.g., "Veda", "Upanga"
    private String summary;   // e.g. ."like all info"
}
