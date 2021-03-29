package Controllers;


import Entities.Alumno;
import Entities.Diploma;
import Services.ObtenerDiplomaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DiplomaControllers {

    @PostMapping("obtener")
        public Object obtenerDiploma( @RequestBody Alumno al){

            Diploma diploma = new Diploma();


            diploma.setMensaje("Felicitaciones por graduarte");
             if(ObtenerDiplomaServices.calcularPromedio(al.getAsignaturas()) > 9){
                 diploma.setMensaje("Felicitaciones obtuviste un excelente promedio");
             }
             diploma.setPromedio(ObtenerDiplomaServices.calcularPromedio(al.getAsignaturas()));
             diploma.setNombre(al.getNombre());

             return diploma;

    }

}
