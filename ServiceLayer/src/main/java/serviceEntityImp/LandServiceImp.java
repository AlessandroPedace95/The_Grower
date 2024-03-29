package serviceEntityImp;

import serviceEntity.LandService;
import entity.Land;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LandRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
public class LandServiceImp implements LandService {
    @Autowired
    private LandRepository landRepository;

    public Land createLand(@Valid Land land) {
        return landRepository.save(land);
    }

    public Land getLandById(UUID id) {
        return landRepository.getOne(id);
    }

    public List<Land> getLands() {
        return landRepository.findAll();
    }

    public void deleteLandById(UUID id) {
        landRepository.deleteById(id);
    }

    public void deleteLand(Land land) {landRepository.delete(land); }
}
