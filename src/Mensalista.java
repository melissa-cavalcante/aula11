public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Mensalista(String cargo) {
        this.cargo = cargo;
    }

    public Mensalista(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public Mensalista(){

    }

    public void calcularSalario(){
        if(cargo.equals("Júnior")){
            salario = 2500;
        }else if(cargo.equals("Pleno")){
            salario = 3500;            
        }else{
            salario = 5500;
        }
    } 
}
