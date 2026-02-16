package CosmicBharat.com.Models.Scripture;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vedas")
public class Veda {
    @Id
    private String id;
    private String name; // e.g., "Rig Veda"
    private String title;
    private String content;
    private String focus;
}