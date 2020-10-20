/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import repository.ArmazenaPaciente;

public class Enfermeira extends Pessoa{
    private int coren;

    public Enfermeira(int coren, String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
        this.coren = coren;
    }

    public Enfermeira(String nome, int idade, long cpf, String email, String login, String senha, Endereco endereco) {
        super(nome, idade, cpf, email, login, senha, endereco);
    }
    
    
    public Enfermeira(){
        super();
    }
    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }
    public double aplicarVacina(int idade, int cartaoSus){
        double ml = 0;
        String vacina = ArmazenaPaciente.getPacientePorCartaoDoSus(cartaoSus).getCartaoDeAgendamento();
        if(null != vacina)switch (vacina) {
            case "Sarampo":
                if(idade>=0 && idade <=2){
                    ml = 0.4;
                }else if(idade>=3 && idade<=9){
                    ml = 0.6;
                }else if(idade>=10 && idade<=18){
                    ml = 0.8;
                }else if(idade>18){
                    ml = 1;
                }   break;
            case "H1N1":
                if(idade>=0 && idade <=2){
                    ml = 0.3;
                }else if(idade>=3 && idade<=9){
                    ml = 0.6;
                }else if(idade>=10 && idade<=18){
                    ml = 0.9;
                }else if(idade>18){
                    ml = 1.20;
                }   break;
            case "Meningite":
                if(idade>=0 && idade <=2){
                    ml = 0.1;
                }else if(idade>=3 && idade<=9){
                    ml = 0.4;
                }else if(idade>=10 && idade<=18){
                    ml = 0.6;
                }else if(idade>18){
                    ml = 0.90;
                }   break;
            case "Malária":
                if(idade>=0 && idade <=2){
                    ml = 0.25;
                }else if(idade>=3 && idade<=9){
                    ml = 0.35;
                }else if(idade>=10 && idade<=18){
                    ml = 0.75;
                }else if(idade>18){
                    ml = 0.80;
                }   break;
            case "Covid19":
                if(idade>=0 && idade <=2){
                    ml = 0.2;
                }else if(idade>=3 && idade<=9){
                    ml = 0.55;
                }else if(idade>=10 && idade<=18){
                    ml = 0.75;
                }else if(idade>18){
                    ml = 0.85;
                }   break;
            case "Outra Vacina":
                if(idade>=0 && idade <=2){
                    ml = 0.45;
                }else if(idade>=3 && idade<=9){
                    ml = 0.55;
                }else if(idade>=10 && idade<=18){
                    ml = 0.7;
                }else if(idade>18){
                    ml = 0.95;
                }   break;
            default:
                break;
        }
        return ml;
    }
}
