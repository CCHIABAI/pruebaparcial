/** 
 *
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 **/

package Parcial;
/**
 * 
 */
public class Corredor extends Deportista {
    
    Integer kilometrosEntrenados = 0;
    Integer kilometrosPreferidos = 0;

    public Corredor(Integer nroSocio, String nombre, Integer kilometrosPreferidos)
    {
        super(nroSocio, nombre);
        this.kilometrosPreferidos = kilometrosPreferidos;
    }

    void setCantidadDeKilometrosEntrenados(Integer km)
    {
        this.kilometrosEntrenados = km;        
    }

    Integer getDistanciaPreferida()
    {
       return kilometrosPreferidos;
    }

    Object getCantidadDeKilometrosEntrenados()
    {
        return kilometrosEntrenados;
    }

}
