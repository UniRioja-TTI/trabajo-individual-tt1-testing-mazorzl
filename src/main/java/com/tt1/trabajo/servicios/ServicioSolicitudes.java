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
        this.solicitudProvisional = sol;
        Random random = new Random();
        return random.nextInt(10000); 
    }

    @Override
    public List<Entidad> getEntities() {
        List<Entidad> lista = new ArrayList<>();
        lista.add(new Entidad(1, "Entidad Alfa", "A"));
        lista.add(new Entidad(2, "Entidad Beta", "B"));
        lista.add(new Entidad(3, "Entidad Gamma", "G"));
        
        return lista;
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
