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
public class Nadador extends Deportista {
    
    String estilo;

    public Nadador(Integer nroSocio, String nombre, String estilo)
    {
        super(nroSocio, nombre);
        this.estilo = estilo;
    }

    public String getEstiloPreferido()
    {
        return estilo;
    }
    
    
}
