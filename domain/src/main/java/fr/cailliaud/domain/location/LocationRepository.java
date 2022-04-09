package fr.cailliaud.domain.location;

import fr.cailliaud.domain.vehicule.Voiture;

import java.util.Optional;

public interface LocationRepository {

  Optional<Voiture> getVoiture(String referenceVoiture);
}
