package fr.cailliaud.infrastructure;

import fr.cailliaud.domain.location.LocationRepository;
import fr.cailliaud.domain.vehicule.Voiture;
import fr.infrastructure.InfrastructureConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

@DataJpaTest
@ContextConfiguration(classes = InfrastructureConfiguration.class)
class LocationRepositoryIT {
  @Autowired LocationRepository locationPort;

  @Test
  @Sql("/sql/insert_vehicules.sql")
  void test() {
    // Given
    String reference = "REF-VEHICULE";

    // When
    Optional<Voiture> voiture = locationPort.getVoiture(reference);

    // Then
    Assertions.assertTrue(voiture.isPresent());
  }
}
