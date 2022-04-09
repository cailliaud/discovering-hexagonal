package fr.infrastructure;

import fr.cailliaud.domain.vehicule.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehiculeRepository extends JpaRepository<VehiculeEntity, Long> {
  Optional<VehiculeEntity> findByReferenceAndType(
      String referenceVehicule, TypeVehicule typeVehicule);
}
