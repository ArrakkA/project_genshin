package play.genshin.akasha.domain.artifact.dto;

import lombok.Data;
import play.genshin.akasha.domain.artifact.entity.Artifact;

import java.util.ArrayList;
import java.util.List;

@Data
public class ArtifactResponseDTO {
    private List<ArtifactDTO> flowers = new ArrayList<>();
    private List<ArtifactDTO> feathers = new ArrayList<>();
    private List<ArtifactDTO> hourglasses = new ArrayList<>();
    private List<ArtifactDTO> holyGrails = new ArrayList<>();
    private List<ArtifactDTO> hats = new ArrayList<>();
}
