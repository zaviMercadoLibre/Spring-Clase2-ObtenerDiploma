package Services;

import Entities.Asignaturas;

import java.util.ArrayList;
public  class ObtenerDiplomaServices {

    public static double calcularPromedio(ArrayList<Asignaturas> list){
        int count = 0;
        double total = 0;
        for (Asignaturas a: list) {
            total = total + a.getNota();
            count++;
        }
        double promedio = total / count;
        return promedio;
    }


}
