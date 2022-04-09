package fr.cailliaud.domain.vehicule;

import lombok.Data;

@Data
public class Voiture {

  private String nom;

  private String marque;

  private boolean disponible = true;

  private boolean electrique;

  public TypeVehicule getType() {
    return TypeVehicule.VOITURE;
  }

  public void recharger() {
    if (!electrique) {
      throw new IllegalArgumentException(
          "Il ne s'agit pas d'un véhicule électrique, donc recharge impossible");
    }
  }

  public int getPourcentageCharge() {
    return 100;
  }
}
