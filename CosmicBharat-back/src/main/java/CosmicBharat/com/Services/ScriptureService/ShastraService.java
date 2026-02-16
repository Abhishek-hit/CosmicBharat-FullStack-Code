package CosmicBharat.com.Services.ScriptureService;

import CosmicBharat.com.Models.Scripture.Shastra;
import CosmicBharat.com.Repositories.ScriptureRespositories.ShastraRepository;
import CosmicBharat.com.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShastraService {
    @Autowired
    private ShastraRepository shastraRepository;

    public ResponseEntity<ApiResponse> addShastras(List<Shastra> shastras) {
        for (Shastra s : shastras) {
            if (s.getTitle() == null || s.getTitle().isEmpty()) {
                throw new RuntimeException("Title cannot be empty");
            }
        }
        List<Shastra> savedShastras = shastraRepository.saveAll(shastras);
        return ResponseEntity.ok(new ApiResponse(true, "Shastras added successfully", savedShastras));
    }

    public ResponseEntity<ApiResponse> getAllShastras() {
        List<Shastra> shastras = shastraRepository.findAll();
        return ResponseEntity.ok(new ApiResponse(true, "Get all shastras", shastras));
    }
}