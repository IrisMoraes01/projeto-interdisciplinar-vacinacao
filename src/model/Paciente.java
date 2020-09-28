/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Paciente extends Pessoa {
    private String cartaoDeAgendamento;
    private int cartaoDoSus;

    public Paciente(String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
    }

    public Paciente(String cartaoDeAgendamento, int cartaoDoSus, String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
        this.cartaoDeAgendamento = cartaoDeAgendamento;
        this.cartaoDoSus = cartaoDoSus;
    }

    public String getCartaoDeAgendamento() {
        return cartaoDeAgendamento;
    }

    public void setCartaoDeAgendamento(String cartaoDeAgendamento) {
        this.cartaoDeAgendamento = cartaoDeAgendamento;
    }

    public int getCartaoDoSus() {
        return cartaoDoSus;
    }

    public void setCartaoDoSus(int cartaoDoSus) {
        this.cartaoDoSus = cartaoDoSus;
    }
    
}
