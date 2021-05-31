

package Parcial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club
{

    private String nombre;
    private Set<Deportista> socios;
    private Map<String, Evento> competencias;

    public Club(String nombre)
    {
        this.nombre = nombre;
        socios = new HashSet<Deportista>();
        competencias = new HashMap<String, Evento>();
    }

    public void agregarDeportista(Deportista deportista)
    {
        socios.add(deportista);
    }

    public void crearEvento(TipoDeEvento tipoDeEvento, String nombre)
    {
        competencias.put(nombre, new Evento(tipoDeEvento));
    }

    public Integer getCantidadSocios()
    {
        return socios.size();
    }

    public Integer inscribirEnEvento(String nombre, Deportista deportista)
    {
        Evento evento = competencias.get(nombre);
        if (evento == null) return -1;
        
        switch (evento.getTipo())
          {
            case CARRERA_5K:
            case CARRERA_10K:
            case CARRERA_21K:
            case CARRERA_42K:
                if (deportista instanceof Ciclista) return -1;

            case DUATLON:
                if (deportista instanceof Nadador) return -1;
                break;

            case CARRERA_NATACION_EN_PICINA:
            case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
                if (deportista instanceof Ciclista) return -1;
          }

        return evento.agregarParticipante(deportista);
    }
}
