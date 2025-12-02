/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo1;

import java.util.ArrayList;

/**
 *
 * @author d.lavado.2023
 */
interface gestionPaciente {
    ArrayList<Paciente> HistorialConsultas = new ArrayList();
    
    
    default void verHistorial(TarjetaSanitaria nueva){
        int i;
            for (i=0;i<HistorialConsultas.size()+1;i++){
                //Corregir el if para que tenga sentido la onsulta, per debeia ser este estilo de "consulta"
                if (nueva == HistorialConsultas.get(i).get(TarjetaSanitaria)){
                    System.out.println(HistorialConsultas.get(i));
                }
    }
    
    
}
