public class Funcionario {
    String nome;
    int CPF;
    double salario;
    String datadeNascimento;
    Funcionario(String nome,int CPF,double salario, String datadeNascimento){
        this.nome=nome;
        this.CPF=CPF;
        this.salario=salario;
        this.datadeNascimento= datadeNascimento;
    }
    double getSalario(){
        return salario;
    }
    
}
