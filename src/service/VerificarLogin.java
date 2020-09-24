
package service;

import java.util.stream.Collectors;
import repository.ArmazenaPaciente;

public class VerificarLogin {
    private ArmazenaPaciente armazenaPaciente = new ArmazenaPaciente(); 
    
    public boolean fazerLoginPaciente(String login, String senha){
        return armazenaPaciente.getPacientes().stream()
                .filter(paciente -> paciente.getLogin().equals(login) 
                        && paciente.getSenha().equals(senha))
                .collect(Collectors.toList())
                .isEmpty();
        
    }
    public boolean fazerLoginAdmin(String login, String senha){
        return login.equals("Admin") && senha.equals("1234");
    }
}
