package serviceEntity;

import entity.Land;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface LandService {
    public Land createLand(@Valid Land land);

    public Land getLandById(UUID id);

    public List<Land> getLands();

    public void deleteLandById(UUID id);

    public void deleteLand(Land land);
}
