package fr.cailliaud.application;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class VoitureControllerIT {

  @Autowired MockMvc mockMvc;
  @MockBean ApplicationVehiculeService applicationVehiculeService;

  @Test
  void test() throws Exception {
    Mockito.when(applicationVehiculeService.recupereVoitureDisponibilite(Mockito.anyString()))
        .thenReturn(Optional.empty());
    mockMvc
        .perform(get("/api/voitures/iefhoazehzpo/disponiblite"))
        .andExpect(status().isNotFound());
  }
}
