package CosmicBharat.Controller;

import CosmicBharat.Models.AncientScience;
import CosmicBharat.Response.ApiResponse;
import CosmicBharat.Services.AncientSicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api")
@CrossOrigin(origins = "*")
public class AncientScienceController {
    @Autowired
    private AncientSicenceService ancientSicenceService;

    @PostMapping("topics")
    public ResponseEntity<ApiResponse> addTopic(@RequestBody List<AncientScience> topic) {
        return ancientSicenceService.addTopic (topic);
    }

    @GetMapping("/alltopic")
    public ResponseEntity<ApiResponse> getallTopic() {
        return ancientSicenceService.getalltopic ( );
    }

    @GetMapping("/{category}")
    public ResponseEntity<ApiResponse> getbycategory(@PathVariable String category) {
        return ancientSicenceService.getTopicsByCategory (category);
    }


}
