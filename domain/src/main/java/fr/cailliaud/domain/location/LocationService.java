package fr.cailliaud.domain.location;

import fr.cailliaud.domain.exception.VoitureInconnuException;

public interface LocationService {

  boolean estDisponible(String referenceVoiture) throws VoitureInconnuException;
}
