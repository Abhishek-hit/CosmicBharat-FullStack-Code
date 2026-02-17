package CosmicBharat.Services;


import CosmicBharat.Models.GurukulSystem;
import CosmicBharat.Repositories.GurukulSystemRepository;
import CosmicBharat.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GurukulSystemService {

    @Autowired
    private GurukulSystemRepository gurukulSystemRepository;

    //create a information or add a data
    public ResponseEntity<ApiResponse> CreateInformation(List<GurukulSystem> info) {//we use list because we can add multiple data at same time
        for (GurukulSystem topic : info) {
            if (topic.getTitle ( ) == null || topic.getSummary ( ).isEmpty ( )) {
                System.out.println ("title and summary can't null or empty");
            }
        }
        List<GurukulSystem> gurukulSystems = gurukulSystemRepository.saveAll (info);
        return ResponseEntity.ok (new ApiResponse (true, "topics created successfully", gurukulSystems));

    }

    //find a data

    public ResponseEntity<ApiResponse> getbytitle(String title) {
        List<GurukulSystem> gurukulSystems = gurukulSystemRepository.findByTitle (title);
        return ResponseEntity.ok (new ApiResponse (true, "data find successfully", gurukulSystems));
    }

    //get all the information
    public ResponseEntity<ApiResponse> getalltopic() {
        List<GurukulSystem> gurukulSystems = gurukulSystemRepository.findAll ( );
        return ResponseEntity.ok (new ApiResponse (true, "get al the topic", gurukulSystems));
    }


}
