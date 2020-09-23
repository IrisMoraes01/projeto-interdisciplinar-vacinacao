/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Enfermeira;

public class ArmazenaEnfermeira {
    private static List<Enfermeira> enfermeiras = new ArrayList<>();
    
    static {
        enfermeiras.add(new Enfermeira(1234,
                "Iris Lima", 
                25, 
                15778943657L, 
                "irislima@gmail.com", 
                "IrisLima01", 
                "12345", 
                new Endereco("Rua", 124, "Cachoeira Alta","Limoeiro", "São Paulo", "SP", "32451234")));
    }
    
    
    public static List<Enfermeira> getEnfermeiras() {
        return enfermeiras;
    }
    public static Enfermeira getEnfermeiraPorCoren(int coren){
        return enfermeiras.stream()
                .filter(enfermeira -> enfermeira.getCoren()==coren)
                .findFirst()
                .get();
    }
    public void adicionarEnfermeira(Enfermeira enfermeira){
        enfermeiras.add(enfermeira);
    }
    
}
