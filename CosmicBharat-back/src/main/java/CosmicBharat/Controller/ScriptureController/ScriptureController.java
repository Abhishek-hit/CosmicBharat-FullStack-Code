package CosmicBharat.Controller.ScriptureController;

import CosmicBharat.Models.Scripture.Epic;
import CosmicBharat.Models.Scripture.Gita;
import CosmicBharat.Models.Scripture.Shastra;
import CosmicBharat.Models.Scripture.Veda;
import CosmicBharat.Response.ApiResponse;
import CosmicBharat.Services.ScriptureService.EpicService;
import CosmicBharat.Services.ScriptureService.GitaService;
import CosmicBharat.Services.ScriptureService.ShastraService;
import CosmicBharat.Services.ScriptureService.VedaService;
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

    @PostMapping("/add/gita")
    public ResponseEntity<ApiResponse> addGita(@RequestBody List<Gita> gitaList) {
        return gitaService.addGita(gitaList);
    }

    @GetMapping("/all/gita")
    public ResponseEntity<ApiResponse> getGita() {
        return gitaService.getGita();
    }

    ///shatta
    @Autowired
    private ShastraService shastraService;

    @PostMapping("/add/shastra")
    public ResponseEntity<ApiResponse> addShastras(@RequestBody List<Shastra> shastras) {
        return shastraService.addShastras(shastras);
    }
    @GetMapping("/all/shastra")
    public ResponseEntity<ApiResponse> getAllShastras() {
        return shastraService.getAllShastras();
    }
}
