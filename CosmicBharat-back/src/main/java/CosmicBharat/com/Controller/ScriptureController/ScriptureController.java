package CosmicBharat.com.Controller.ScriptureController;

import CosmicBharat.com.Models.Scripture.Epic;
import CosmicBharat.com.Models.Scripture.Gita;
import CosmicBharat.com.Models.Scripture.Shastra;
import CosmicBharat.com.Models.Scripture.Veda;
import CosmicBharat.com.Response.ApiResponse;
import CosmicBharat.com.Services.ScriptureService.EpicService;
import CosmicBharat.com.Services.ScriptureService.GitaService;
import CosmicBharat.com.Services.ScriptureService.ShastraService;
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
    //epic
    @Autowired
    private EpicService epicService;

    @PostMapping("/add/epic")
    public ResponseEntity<ApiResponse> addEpics(@RequestBody List<Epic> epics) {
        return epicService.addEpics(epics);
    }

    @GetMapping("/all/epic")
    public ResponseEntity<ApiResponse> getAllEpics() {
        return epicService.getAllEpics();
    }
    //geta
    @Autowired
    private GitaService gitaService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addGita(@RequestBody List<Gita> gitaList) {
        return gitaService.addGita(gitaList);
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getGita() {
        return gitaService.getGita();
    }

    ///shatta
    @Autowired
    private ShastraService shastraService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addShastras(@RequestBody List<Shastra> shastras) {
        return shastraService.addShastras(shastras);
    }
    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllShastras() {
        return shastraService.getAllShastras();
    }
}
