/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Enfermeira extends Pessoa{
    private int coren;

    public Enfermeira(int coren, String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
        this.coren = coren;
    }

    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }
}
