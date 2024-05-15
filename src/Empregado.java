public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(){
        
    }

    public Empregado(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularIRPF(){
        double aux=0;
            if(salario>2112.01 && salario<2826.66){
                aux = salario * 0.07;
            } else if(salario>=2826.66 && salario<3751.05){
                aux = salario * 0.15;
            } else if(salario>=3751.05 && salario<4664.68){
                aux = salario * 0.255;
            } else if(salario>4664.68){
                aux = salario * 0.275;
            }
        return aux;
    }

    public double calcularINSS(){
        double aux = 0;
        if(salario<=1412){
            aux = salario*0.75;
        }else if(salario>1412 && salario<2667){
            aux = salario*0.09;
        }else if(salario>2667 && salario < 4000){
            aux = salario*0.12;
        }else if(salario>4000){
            aux = salario*0.14;
        }
        return aux;
    }
}
