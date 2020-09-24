
package service;

import java.util.stream.Collectors;
import repository.ArmazenaEnfermeira;
import repository.ArmazenaMedico;
import repository.ArmazenaPaciente;

public class VerificarLogin {
    private ArmazenaPaciente armazenaPaciente = new ArmazenaPaciente();
    private ArmazenaEnfermeira armazenaEnfermeira = new ArmazenaEnfermeira();
    private ArmazenaMedico armazenaMedico = new ArmazenaMedico();
    
    public boolean fazerLoginPaciente(String login, String senha){
        return !armazenaPaciente.getPacientes().stream()
                .filter(paciente -> paciente.getLogin().equals(login) 
                        && paciente.getSenha().equals(senha))
                .collect(Collectors.toList())
                .isEmpty();
        
    }
    public boolean fazerLoginEnfermeira(String login, String senha){
        return !armazenaEnfermeira.getEnfermeiras().stream()
                .filter(enfermeira -> enfermeira.getLogin().equals(login) 
                        && enfermeira.getSenha().equals(senha))
                .collect(Collectors.toList())
                .isEmpty();
    }
    public boolean fazerLoginMedico(String login, String senha){
        return !armazenaMedico.getMedicos().stream()
                .filter(medico -> medico.getLogin().equals(login) 
                        && medico.getSenha().equals(senha))
                .collect(Collectors.toList())
                .isEmpty();
    }
    
    public boolean fazerLoginAdmin(String login, String senha){
        return login.equals("Admin") && senha.equals("1234");
    }
}
