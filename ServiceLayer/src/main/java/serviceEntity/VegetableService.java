package serviceEntity;

import entity.vegetables.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VegetableRepository;

import javax.validation.Valid;
import java.util.List;
@Service
public class VegetableService {
    @Autowired
    private VegetableRepository vegetableRepository;

    public Vegetable createVegetable(@Valid Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    public Vegetable getVegetableById(int id) {
        return vegetableRepository.getOne(id);
    }

    public List<Vegetable> getVegetables() {
        return vegetableRepository.findAll();
    }

    public void deleteVegetable(int id) {
        vegetableRepository.deleteById(id);
    }
}