
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Data;
import model.Vacina;

public class ArmazenaVacina {
    private static List<Vacina> vacinas = new ArrayList<>();
    
    static{
        vacinas.add(new Vacina("Sarampo",1500,"Livre",new Data(22,03,2025)));
        vacinas.add(new Vacina("H1N1",1600,"Exceto alergicos a morfina",new Data(02,9,2028)));
        vacinas.add(new Vacina("Meningite",1700,"Exceto alergicos a ovo",new Data(22,01,2029)));
        vacinas.add(new Vacina("Malária",1800,"Livre",new Data(20,10,2030)));
        vacinas.add(new Vacina("Covid19",1900,"Livre",new Data(01,07,2035)));
        vacinas.add(new Vacina("Outras vacinas",2000,"Livre",new Data(17,11,2045)));
    }
    
    public static List<Vacina> getVacinas() {
        return vacinas;
    }
    public static Vacina getNomeDaVacina(String nomeVacina){
        return vacinas.stream()
                .filter(vacina -> vacina.getNomeVacina().equals(nomeVacina))
                .findFirst()
                .get();
    }
    public void adicionarPaciente(Vacina vacina){
        vacinas.add(vacina);
    }
}
