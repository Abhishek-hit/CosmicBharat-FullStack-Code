package CosmicBharat.com.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "AncientScience")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AncientScience {

    private String id;
    private String title;
    private String category;
    private String shortDescription;
    private String fullContent;
    private String imageUrl;
    private String sourceScripture;
    private String iconClass;
    private String isTextIcon;
    private LocalDateTime createdAt = LocalDateTime.now ( );

}
