package CosmicBharat.Controller;


import CosmicBharat.Models.GurukulSystem;
import CosmicBharat.Response.ApiResponse;
import CosmicBharat.Services.GurukulSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class GurukulSystemController {
    @Autowired
    private GurukulSystemService gurukulSystemService;

    @PostMapping("/topics")
    public ResponseEntity<ApiResponse> addData(@RequestBody List<GurukulSystem> info) {
        return gurukulSystemService.CreateInformation (info);
    }

    @GetMapping("/{title}")
    public ResponseEntity<ApiResponse> getBytitle(@PathVariable String title) {
        return gurukulSystemService.getbytitle (title);
    }

    @GetMapping("/alltopics")
    public ResponseEntity<ApiResponse> getAll() {
        return gurukulSystemService.getalltopic ( );
    }
}
