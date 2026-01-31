package CosmicBharat.com.Services;

import CosmicBharat.com.Models.AncientScience;
import CosmicBharat.com.Repositories.AncientScienceRepository;
import CosmicBharat.com.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AncientSicenceService {
    @Autowired
    private AncientScienceRepository ancientScienceRepository;

public ResponseEntity<ApiResponse> addTopic(List<AncientScience> topic){


    for (AncientScience topics:topic){
        if (topics.getTitle ()==null|| topics.getTitle().isEmpty()){
            throw new RuntimeException ( "title cannot be empty" );
        }
    }
    List<AncientScience> ancientScience=ancientScienceRepository.saveAll (topic);
    return ResponseEntity.ok (new ApiResponse (true,"topics created successfully",ancientScience ));
   }

public ResponseEntity<ApiResponse> getalltopic(){
        List<AncientScience> ancientSciences=ancientScienceRepository.findAll ();
        return ResponseEntity.ok ( new ApiResponse ( true,"get al the topic",ancientSciences ) );
    }
 public ResponseEntity<ApiResponse> getTopicsByCategory(String category){
    List<AncientScience> ancientScience=ancientScienceRepository.findByCategory (category);
    return  ResponseEntity.ok ( new ApiResponse ( true,"get al the topic",ancientScience ) );

 }
}
