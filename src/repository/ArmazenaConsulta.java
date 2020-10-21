package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Consulta;

public class ArmazenaConsulta {
    private static List<Consulta> consultas = new ArrayList<>();
   
    public static List<Consulta> getConsultas() {
        return consultas;
    }
    public static Consulta getConsultaPorCartaoDoSusDoPaciente(int cartaoDoSus){
        return consultas.stream()
                .filter(consulta -> consulta.getPaciente().getCartaoDoSus()== cartaoDoSus)
                .findFirst()
                .get();
    }
    public static List<Consulta> getConsultasporCartaoDoSus(int cartaoDoSus){
        return consultas.stream()
                .filter(consulta -> consulta.getPaciente().getCartaoDoSus()== cartaoDoSus)
                .collect(Collectors.toList());
    }
    public static List<Consulta> getConsultasporCrm(int crm){
        return consultas.stream()
                .filter(consulta -> consulta.getMedico().getCrm() == crm)
                .collect(Collectors.toList());
    }
    public static List<Consulta> getConsultasporCoren(int coren){
        return consultas.stream()
                .filter(consulta -> consulta.getEnfermeira().getCoren() == coren)
                .collect(Collectors.toList());
    }
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
}
