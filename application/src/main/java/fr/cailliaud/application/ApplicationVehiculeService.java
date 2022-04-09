package fr.cailliaud.application;

import fr.cailliaud.domain.exception.VoitureInconnuException;
import fr.cailliaud.domain.location.LocationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationVehiculeService {

  private final LocationService locationService;

  public ApplicationVehiculeService(LocationService locationService) {
    this.locationService = locationService;
  }

  public Optional<DisponibliteVoiture> recupereVoitureDisponibilite(String referenceVoiture) {
    try {
      DisponibliteVoiture disponibliteVoiture = new DisponibliteVoiture();
      disponibliteVoiture.setDisponible(locationService.estDisponible(referenceVoiture));
      return Optional.of(disponibliteVoiture);
    } catch (VoitureInconnuException voitureInconnuException) {
      return Optional.empty();
    }
  }
}
