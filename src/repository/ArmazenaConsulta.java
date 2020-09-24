package repository;

import java.util.ArrayList;
import java.util.List;
import model.Consulta;
import model.Data;

public class ArmazenaConsulta {
    private static List<Consulta> consultas = new ArrayList<>();
    static{
        consultas.add(new Consulta(ArmazenaMedico.getMedicoPorCRM(12345), 
                ArmazenaEnfermeira.getEnfermeiraPorCoren(1234), 
                ArmazenaPaciente.getPacientePorCartaoDoSus(123456), 
                new Data(28, 12, 2021)));
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
