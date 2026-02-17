package CosmicBharat.Models.Scripture;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "epics")
public class Epic {
    @Id
    private String id;
    private String identifier;
    private String cardTitle;
    private String subtitle;
    private String icon;
    private String title;
    private String author;
    private String image;
    private String description;
    private String modalDesc;
    private String focus;
    private List<String> highlights; // Array handling
    private List<String> fullStory;  // Array handling
}
