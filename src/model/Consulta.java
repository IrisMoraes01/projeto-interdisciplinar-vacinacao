/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consulta {
    private Medico medico;
    private Enfermeira enfermeira;
    private Paciente paciente;
    private final List<Vacina> vacina = new ArrayList<>();
    private Date data;

    public Consulta(Medico medico, Enfermeira enfermeira, Paciente paciente, Date data) {
        this.medico = medico;
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
