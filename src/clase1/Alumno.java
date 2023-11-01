
package clase1;

import java.util.ArrayList;
import java.util.List;


//@author Fernando Racca
 
public class Alumno {
    
    private String legajo, nombre;
    private List<Materia> materiasInscriptas = new ArrayList<>();
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia materia){
        this.materiasInscriptas.add(materia);
    }
    
    public void aprobarMateria(Materia materia){
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    
    

}
