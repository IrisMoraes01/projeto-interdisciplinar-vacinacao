
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Vacina;

public class ArmazenaVacina {
    private static List<Vacina> vacinas = new ArrayList<>();
    
    public static List<Vacina> getVacinas() {
        return vacinas;
    }
    public static Vacina getNomeDaVacina(String nomeVacina){
        return vacinas.stream()
                .filter(vacina -> vacina.getNomeVacina()==nomeVacina)
                .findFirst()
                .get();
    }
    public void adicionarPaciente(Vacina vacina){
        vacinas.add(vacina);
    }
}
