package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor

public class Alumno {

    private String nombre;
    private ArrayList<Asignaturas> asignaturas ;

}
