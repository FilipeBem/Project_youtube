package org.example;

public class Aluno extends Pessoa{

    private String login;
    private int toAsssistindo;

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.toAsssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getToAsssistindo() {
        return toAsssistindo;
    }

    public void setToAsssistindo(int toAsssistindo) {
        this.toAsssistindo = toAsssistindo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                super.toString() +
                " login= '" + login + '\'' +
                ", toAsssistindo= " + toAsssistindo +
                '}';
    }
}
