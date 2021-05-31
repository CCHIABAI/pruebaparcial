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
public class Deportista {
    
    Integer nroSocio;
    String nombre;

    public Deportista(Integer nroSocio, String nombre)
    {
        this.nombre = nombre;
        this.nroSocio = nroSocio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getNumeroDeSocio()
    {
        return nroSocio;
    }

    public void setNumeroDeSocio(Integer nroSocio)
    {
        this.nroSocio = nroSocio;
    }
    
                
}
