package serviceEntity;

import entity.vegetables.Vegetable;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface VegetableService {
    public Vegetable createVegetable(@Valid Vegetable vegetable);

    public Vegetable getVegetableById(UUID id);

    public List<Vegetable> getVegetables();

    public void deleteVegetableById(UUID id);

    public void deleteVegetable(Vegetable vegetable);
}
