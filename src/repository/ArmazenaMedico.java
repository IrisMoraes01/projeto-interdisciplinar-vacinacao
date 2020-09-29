/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Medico;

public class ArmazenaMedico {
    private static List<Medico> medicos = new ArrayList<>();
    
    static{
        medicos.add(new Medico(12345, 
                "Oncologia", 
                true, 
                "Rodrigo Lima", 
                30, 
                1344543459L, 
                "limarodrigo@hotmail.com", 
                "limaRodrigo0", 
                "01234", 
                new Endereco("Avenida", 10, "Padre Beltrão", "Limoeiro", "São Paulo", "SP", "03631208")));
    }
    
    public static List<Medico> getMedicos() {
        return medicos;
    }
    public static Medico getMedicoPorCRM(int crm){
        return medicos.stream()
                .filter(medico -> medico.getCrm()==crm)
                .findFirst()
                .get();
    }
    public void adicionarMedico(Medico medico){
        medicos.add(medico);
    }
}
