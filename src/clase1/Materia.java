
package clase1;

import java.util.ArrayList;
import java.util.List;


//@author Fernando Racca
 
public class Materia {
    
    private int id;
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();
    private List<Alumno> alumnosInscriptos = new ArrayList<>();

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCorrelativa(Materia materia){
        this.correlativas.add(materia);
    }
    
    public void agregarAlumno(Alumno alumno){
        this.alumnosInscriptos.add(alumno);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    
    

}
