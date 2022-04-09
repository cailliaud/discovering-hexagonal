package fr.infrastructure;

import fr.cailliaud.domain.location.LocationRepository;
import fr.cailliaud.domain.vehicule.TypeVehicule;
import fr.cailliaud.domain.vehicule.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationRepositoryImpl implements LocationRepository {

  @Autowired private VehiculeRepository vehiculeRepository;
  @Autowired private VehiculeMapper vehiculeMapper;

  @Override
  public Optional<Voiture> getVoiture(String referenceVoiture) {
    return vehiculeRepository
        .findByReferenceAndType(referenceVoiture, TypeVehicule.VOITURE)
        .map(vehiculeMapper::map);
  }
}
