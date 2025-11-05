public class Gerente extends Funcionario {
    Gerente(String nome,int CPF,double salario, String datadeNascimento){
        super(nome, CPF, salario, datadeNascimento);
    }
    double getSalario(){
        return (salario+2000);
    }
}
