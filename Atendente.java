public class Atendente extends Funcionario{
    double comissao;
    Atendente(String nome,int CPF,double salario, String datadeNascimento){
        super(nome,CPF,salario,datadeNascimento);
        this.comissao=comissao;
    }
    double getSalario(){
        return salario;
    }

}
