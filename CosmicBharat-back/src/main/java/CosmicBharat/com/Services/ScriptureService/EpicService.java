package CosmicBharat.com.Services.ScriptureService;

import CosmicBharat.com.Models.Scripture.Epic;
import CosmicBharat.com.Repositories.ScriptureRespositories.EpicRepository;
import CosmicBharat.com.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpicService {
    @Autowired
    private EpicRepository epicRepository;

    public ResponseEntity<ApiResponse> addEpics(List<Epic> epics) {
        for (Epic e : epics) {
            if (e.getTitle() == null || e.getTitle().isEmpty()) {
                throw new RuntimeException("Epic title cannot be empty");
            }
        }
        List<Epic> savedEpics = epicRepository.saveAll(epics);
        return ResponseEntity.ok(new ApiResponse(true, "Epics created successfully", savedEpics));
    }

    public ResponseEntity<ApiResponse> getAllEpics() {

        List<Epic> epics = epicRepository.findAll();
        return ResponseEntity.ok(new ApiResponse(true, "Get all epics", epics));
    }
}