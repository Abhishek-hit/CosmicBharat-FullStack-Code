package CosmicBharat.Services.ScriptureService;

import CosmicBharat.Repositories.ScriptureRespositories.GitaRepository;
import CosmicBharat.Models.Scripture.Gita;
import CosmicBharat.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitaService {
    @Autowired
    private GitaRepository gitaRepository;

    // Although Gita is usually one entry, we keep list logic for consistency
    public ResponseEntity<ApiResponse> addGita(List<Gita> gitaList) {
        for (Gita g : gitaList) {
            if (g.getTitle() == null || g.getTitle().isEmpty()) {
                throw new RuntimeException("Title cannot be empty");
            }
        }
        List<Gita> savedGita = gitaRepository.saveAll(gitaList);
        return ResponseEntity.ok(new ApiResponse(true, "Gita data added successfully", savedGita));
    }

    public ResponseEntity<ApiResponse> getGita() {
        List<Gita> gitaData = gitaRepository.findAll();
        return ResponseEntity.ok(new ApiResponse(true, "Get Gita data", gitaData));
    }
}