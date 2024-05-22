public class Mensalista extends Empregado {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Construtor 
    public Mensalista(String nome, String endereco, 
            double salario, String cargo){
                super(nome,endereco,salario);
                this.cargo = cargo;

    }

    public void calcularSalario(){
        if(cargo.equals("Junior")){
            salario = 2500;
        }else if (cargo.equals("Pleno")){
            salario = 3500;
        }else {
            salario = 5500;
        }
        
    }

}
