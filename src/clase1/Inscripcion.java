
package clase1;


//@author Fernando Racca
 
public class Inscripcion {
    
    private Alumno alumno;
    private Materia materia;
    boolean inscripcionAprobada = aprobada();
    
    private boolean aprobada (){
        
        int contador = 0;
        
        for (Materia mc : this.materia.getCorrelativas()){
            for (Materia ma : this.alumno.getMateriasAprobadas()){
                if (mc.getId()== ma.getId()){
                    contador++;
                }
            }
        }
        
        if (contador == this.materia.getCorrelativas().size()){
            return true;
        } else {   
            return false;
        }
    }
    
}
