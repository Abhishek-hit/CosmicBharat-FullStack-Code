package CosmicBharat.com.Controller.ScriptureController;

import CosmicBharat.com.Models.Scripture.Veda;
import CosmicBharat.com.Response.ApiResponse;
import CosmicBharat.com.Services.ScriptureService.VedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api/Scripture")
@CrossOrigin(origins = "*")
public class ScriptureController {

    @Autowired
    private VedaService vedaService;
//veda
    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addVedas(@RequestBody List<Veda> vedas) {
        return vedaService.addVedas(vedas);
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllVedas() {
        return vedaService.getAllVedas();
    }
}
