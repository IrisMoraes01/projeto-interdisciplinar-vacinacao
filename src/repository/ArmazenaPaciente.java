/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Paciente;

public class ArmazenaPaciente {
    private static List<Paciente> pacientes = new ArrayList<>();
    
    static{
        pacientes.add(new Paciente("", 
                123456, 
                "Ivy Martins", 
                22, 
                12213443, 
                "ivy0martins@gmail.com", 
                "Ivy0Martins", 
                "ivy123", 
                new Endereco("Viela", 33, "Ascendino Azul", "Penha", "São Paulo", "SP", "75890324")));
    }
    
    public static List<Paciente> getPacientes() {
        return pacientes;
    }
    public static Paciente getPacientePorCartaoDoSus(int cartaoDoSus){
        return pacientes.stream()
                .filter(paciente -> paciente.getCartaoDoSus()==cartaoDoSus)
                .findFirst()
                .get();
    }
    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
}
