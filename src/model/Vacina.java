 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Vacina {
    private String nomeVacina;
    private double dose;
    private String indicacao;
    private Data dataValidade;
    
    public Vacina(String nomeVacina, double dose, String indicacao, Data dataValidade) {
        this.nomeVacina = nomeVacina;
        this.dose = dose;
        this.indicacao = indicacao;
        this.dataValidade = dataValidade;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

   
}
