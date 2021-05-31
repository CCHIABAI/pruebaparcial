/**
 *
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 *
 */

package Parcial;

/**
 *
 */
public class Triatleta extends Deportista
{
    TipoDeBicicleta tipoDeBicicleta;
    String estilo;
   
    public Triatleta(Integer nroSocio, String nombre, String estilo, TipoDeBicicleta tipoDeBicicleta)
    {
        super(nroSocio, nombre);
        this.tipoDeBicicleta = tipoDeBicicleta;
        this.estilo = estilo;
    }

    private String tipoDeBicicletaToString()
    {
        switch (tipoDeBicicleta)
          {
            case BMX:
                return "BMX";
            case MOUNTAIN:
                return "MOUNTAIN";
            case RUTA:
                return "RUTA";
            case TRIA:
                return "TRIA";
          }
        
        return "";
    }

    String getDistanciaPreferida()
    {
       return estilo;
    }

    TipoDeBicicleta getTipoDeBicicleta()
    {
        return tipoDeBicicleta;
    }

}
