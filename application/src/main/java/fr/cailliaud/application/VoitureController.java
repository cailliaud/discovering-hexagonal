package fr.cailliaud.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/voitures")
public class VoitureController {

  @Autowired private ApplicationVehiculeService applicationVehiculeService;

  @GetMapping("/{referenceVoiture}/disponibilite")
  public Optional<DisponibliteVoiture> recupereVoitureDisponibilite(
      @PathVariable String referenceVoiture) {
    return applicationVehiculeService.recupereVoitureDisponibilite(referenceVoiture);
  }
}
