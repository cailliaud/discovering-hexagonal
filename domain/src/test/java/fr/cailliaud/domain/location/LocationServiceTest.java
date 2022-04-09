package fr.cailliaud.domain.location;

import fr.cailliaud.domain.exception.VoitureInconnuException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class LocationServiceTest {

  @InjectMocks LocationServiceImpl locationService;

  @Mock LocationRepository locationPort;

  @Test
  void given_vehicule_inconnu_then_throw_exception() {
    // Given
    String reference = "lesvozejp";
    Mockito.when(locationPort.getVoiture(Mockito.anyString())).thenReturn(Optional.empty());

    // When
    VoitureInconnuException vehiculeInconnuException =
        assertThrows(VoitureInconnuException.class, () -> locationService.estDisponible(reference));
    // Then
    Assertions.assertEquals(
        "Véhicule inconnue pour la référence : lesvozejp", vehiculeInconnuException.getMessage());
    Mockito.verify(locationPort).getVoiture("lesvozejp");
  }
}
