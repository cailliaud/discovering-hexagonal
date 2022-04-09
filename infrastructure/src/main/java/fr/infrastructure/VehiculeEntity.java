package fr.infrastructure;

import fr.cailliaud.domain.vehicule.TypeVehicule;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehicule")
@SequenceGenerator(
    name = "id_generateur_sequence",
    sequenceName = "vehicule_sequence",
    allocationSize = 1)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Getter
@Setter
public class VehiculeEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generateur_sequence")
  @Column(name = "id", updatable = false, nullable = false)
  @EqualsAndHashCode.Include
  @Setter(AccessLevel.NONE)
  private Long id;

  private String reference;

  @Enumerated(EnumType.STRING)
  private TypeVehicule type;

  private boolean disponible;
}
