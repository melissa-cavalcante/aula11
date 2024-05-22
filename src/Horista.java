public class Horista extends Empregado {
    private double horas;

    public Horista(String nome, String endereco, double h){
        super(nome, endereco);
        horas = h;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void calcularSalario() {
        salario = horas * 50;
    }
}
