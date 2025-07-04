package entities;

public class Funcionario {
    private int id;
    private String name;
    private double salario;

    public Funcionario(int id, String name, double salario) {
        this.id=id;
        this.name=name;
        this.salario= salario;
    }

    public int getId() {
        return id;
    }

    public void aumentoSalario(double porcentagem) {
        this.salario= ((porcentagem/100) * salario) + salario;
    }

    @Override
    public String toString() {
        return id +", " + name+", " + String.format("%.2f",salario);
    }
}

