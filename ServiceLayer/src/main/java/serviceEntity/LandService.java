package serviceEntity;

import entity.Land;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LandRepository;

import javax.validation.Valid;
import java.util.List;

@Service
public class LandService {
    @Autowired
    private LandRepository landRepository;

    public Land createLand(@Valid Land terreno) {
        return landRepository.save(terreno);
    }

    public Land getLandById(long id) {
        return landRepository.getOne(id);
    }

    public List<Land> getLands() {
        return landRepository.findAll();
    }

    public void deleteLand(long id) {
        landRepository.deleteById(id);
    }
}
