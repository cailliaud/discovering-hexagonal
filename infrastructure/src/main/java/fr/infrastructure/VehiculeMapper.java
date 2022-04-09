package fr.infrastructure;

import fr.cailliaud.domain.vehicule.Voiture;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface VehiculeMapper {

  @Mapping(target = "electrique", ignore = true)
  @Mapping(target = "nom", ignore = true)
  @Mapping(target = "marque", ignore = true)
  Voiture map(VehiculeEntity vehicule);
}
