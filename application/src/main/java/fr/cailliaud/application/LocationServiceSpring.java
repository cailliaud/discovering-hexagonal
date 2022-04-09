package fr.cailliaud.application;

import fr.cailliaud.domain.location.LocationRepository;
import fr.cailliaud.domain.location.LocationServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceSpring extends LocationServiceImpl {
  public LocationServiceSpring(LocationRepository locationPort) {
    super(locationPort);
  }
}
