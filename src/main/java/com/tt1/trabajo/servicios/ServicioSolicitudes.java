package com.tt1.trabajo.servicios;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import interfaces.InterfazContactoSim;
import modelo.DatosSolicitud;
import modelo.DatosSimulation;
import modelo.Entidad;

@Service
public class ServicioSolicitudes implements InterfazContactoSim {
	private DatosSolicitud solicitudProvisional;

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        return 0;
    }

    @Override
    public List<Entidad> getEntities() {
        return List.of();
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null; 
    }

    @Override
    public boolean isValidEntityId() {
        return true;
    }
}
