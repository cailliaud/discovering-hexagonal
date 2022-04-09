package fr.cailliaud.domain.exception;

public class VoitureInconnuException extends Exception {

  public VoitureInconnuException(String referenceVehicule) {
    super("Véhicule inconnue pour la référence : " + referenceVehicule);
  }
}
