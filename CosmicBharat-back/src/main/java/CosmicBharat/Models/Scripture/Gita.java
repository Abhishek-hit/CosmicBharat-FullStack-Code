package CosmicBharat.Models.Scripture;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "gita")
public class Gita {
    @Id
    private String id;
    private String title;
    private String subtitle;
    private String author;
    private String image;
    private String description;
    private String focus;
    private List<String> highlights;
    private List<String> fullStory;
}
