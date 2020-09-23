/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Medico extends Pessoa {
    private int crm;
    private String especialidade;
    private boolean residente;

    public Medico(int crm, String especialidade, boolean residente, String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
        this.residente = residente;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isResidente() {
        return residente;
    }

    public void setResidente(boolean residente) {
        this.residente = residente;
    }
}
