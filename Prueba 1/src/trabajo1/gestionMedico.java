/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author d.lavado.2023
 */
interface gestionMedico {
        ArrayList<Consulta> HistorialConsultas = new ArrayList();
        
        
        default void anadirConsulta(Consulta nueva){
            HistorialConsultas.add(nueva);
        }
        
        default int dineroRecaudado(int LocalDate){
            int dineroTotal = 0;
            int i;
            for (i=0;i<HistorialConsultas.size()+1;i++){
                
            }
            dineroTotal = dineroTotal +i*50;
            return dineroTotal;
        }
        
        default Consulta verConsulta(int cip, int LocalDate){
            // asumimos que un paciente solo tiene como maximo una consutla al dia
            int i;
            for (i=0;i<HistorialConsultas.size()+1;i++){
                //Corregir el if para que tenga sentido la onsulta, per debeia ser este estilo de "consulta"
                if (cip == HistorialConsultas.get(i).get(cip) && LocalDate == HistorialConsultas.get(i).get(LocalDate){
                    return HistorialConsultas.get(i);
                }
            }
            return null;
        }
            
        default void verTodasCOnsultas(Medico medico){
            int i;
            for (i=0;i<HistorialConsultas.size()+1;i++){
                //Corregir el if para que tenga sentido la onsulta, per debeia ser este estilo de "consulta"
                if (medico == HistorialConsultas.get(i).get(Medico)){
                    System.out.println(HistorialConsultas.get(i));
                }
        }
}
