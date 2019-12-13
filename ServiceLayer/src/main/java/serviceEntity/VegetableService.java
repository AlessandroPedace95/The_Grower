package serviceEntity;

import entity.vegetables.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VegetableRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Service
public class VegetableService {
    @Autowired
    private VegetableRepository vegetableRepository;

    public Vegetable createVegetable(@Valid Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    public Vegetable getVegetableById(UUID id) {
        return vegetableRepository.getOne(id);
    }

    public List<Vegetable> getVegetables() {
        return vegetableRepository.findAll();
    }

    public void deleteVegetableById(UUID id) {
        vegetableRepository.deleteById(id);
    }

    public void deleteVegetable(Vegetable vegetable) { vegetableRepository.delete(vegetable);}
}
