package repository;

import java.util.ArrayList;
import java.util.List;
import model.Consulta;

public class ArmazenaConsulta {
    private static List<Consulta> consultas = new ArrayList<>();
    static{
    }
       
    
    public static List<Consulta> getConsultas() {
        return consultas;
    }
    public static Consulta getConsultaPorCartaoDoSusDoPaciente(int cartaoDoSus){
        return consultas.stream()
                .filter(consulta -> consulta.getPaciente().getCartaoDoSus()== cartaoDoSus)
                .findFirst()
                .get();
    }
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
}
