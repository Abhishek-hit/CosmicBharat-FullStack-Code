package CosmicBharat.Models.Scripture;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "shastras")
public class Shastra {
    @Id
    private String id;
    private String title;
    private String author;
    private String image;
    private String desc; // Matches JSON key "desc"
    private String detailedDesc;
    private List<String> keyPoints;
}
