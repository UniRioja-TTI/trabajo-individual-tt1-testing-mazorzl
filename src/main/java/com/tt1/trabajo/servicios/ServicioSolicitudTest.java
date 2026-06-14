package com.tt1.trabajo.servicios;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.trabajo.servicios.ServicioSolicitud;

import org.junit.jupiter.api.Assertions.*;

public class ServicioSolicitudTest{
  private ServicioSolicitud servicio;
  @BeforeEach
  void setUp(){
    servicio = new ServicioSolicitud();
  }

  @Test
  void testsolicitarSimulationDevTokenRand(){
    int tok = servicio.solicitarSimulation(null);
    assertTrue(tok >= 0, "Token positivo");
  }

  @Test
  void testgetEntitiesNoVacio(){
    var entidades = servicio.getEntities();
    assertFalse(entidades.IsEmpty(), "Lista esta vacia");
  }

  @Test
  void testIdEntidadEsValida(){
    assertTrue(servicio.isValidEntityId());
  }
}
