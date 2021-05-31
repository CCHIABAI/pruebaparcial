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
public class Ciclista extends Deportista {

    String tipoDeBicicleta = "";

    public Ciclista(Integer nroSocio, String nombre, String tipoDeBicicleta)
    {
        super(nroSocio, nombre);
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    String getTipoDeBicicleta()
    {
        return tipoDeBicicleta;
    }

}
