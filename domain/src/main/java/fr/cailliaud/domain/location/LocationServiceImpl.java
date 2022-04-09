package fr.cailliaud.domain.location;

import fr.cailliaud.domain.exception.VoitureInconnuException;
import fr.cailliaud.domain.vehicule.Voiture;

import java.util.Optional;

public class LocationServiceImpl implements LocationService {

  private final LocationRepository locationPort;

  public LocationServiceImpl(LocationRepository locationPort) {
    this.locationPort = locationPort;
  }

  @Override
  public boolean estDisponible(String referenceVoiture) throws VoitureInconnuException {
    Optional<Voiture> optVehicule = locationPort.getVoiture(referenceVoiture);

    if (optVehicule.isPresent()) {
      return optVehicule.get().isDisponible();
    } else {
      throw new VoitureInconnuException(referenceVoiture);
    }
  }
}
