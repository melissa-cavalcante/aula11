public class Horista extends Empregado {
    private double horas;
    private double vl_horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public Horista(String nome, String endereco, double salario, double horas, double vl_horas) {
        super(nome, endereco, salario);
        this.horas = horas;
        this.vl_horas = vl_horas;
    }

    public Horista(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = vl_horas;
    }

    
}
