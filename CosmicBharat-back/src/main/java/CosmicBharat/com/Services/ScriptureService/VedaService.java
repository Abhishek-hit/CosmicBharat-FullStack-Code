package CosmicBharat.com.Services.ScriptureService;

import CosmicBharat.com.Models.Scripture.Veda;
import CosmicBharat.com.Repositories.ScriptureRespositories.VedaRepository;
import CosmicBharat.com.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VedaService {
    @Autowired
    private VedaRepository vedaRepository;

    // Add Vedas
    public ResponseEntity<ApiResponse> addVedas(List<Veda> vedas) {
        for (Veda v : vedas) {
            if (v.getTitle() == null || v.getTitle().isEmpty()) {
                throw new RuntimeException("Veda title cannot be empty");
            }
        }
        List<Veda> savedVedas = vedaRepository.saveAll(vedas);
        return ResponseEntity.ok(new ApiResponse(true, "Vedas added successfully", savedVedas));
    }

    // Get All Vedas
    public ResponseEntity<ApiResponse> getAllVedas() {
        List<Veda> vedas = vedaRepository.findAll();
        return ResponseEntity.ok(new ApiResponse(true, "Fetched all Vedas", vedas));
    }
}
