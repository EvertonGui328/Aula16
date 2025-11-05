import java.util.ArrayList;
import java.util.Scanner;

public class testar{
    public static void main(String[] args) {
        ArrayList<String>funcionarios= new ArrayList<>();
        Scanner leitor= new Scanner(System.in);
        int escolha=0;
        while (escolha!=5){
            System.out.println("Escolha uma das opções:\nAdicionar Gerente\nAdicionar atendente\nListar todos os funcionários\nMostrar salário de funcionário (Informe o CPF do usuário)");
            escolha=leitor.nextInt();
            switch (escolha){
                case 1:
                System.out.println("Digite o nome do gerente: ");
                String novogerente=leitor.next();
                System.out.println("Digite o nome: ");
                String nomeg=leitor.next();
                System.out.println("Digite o cpf: ");
                int cpfg=leitor.nextInt();
                System.out.println("Digite o salário: ");
                double salariog= leitor.nextInt();
                System.out.println("Digite a data de nascimento: ");
                String datanascimentog= leitor.next();
                Funcionario f=new Funcionario(nomeg, cpfg, salariog, datanascimentog);
                funcionarios.add(nomeg);
                break;
                case 2:
                System.out.println("Digite o nome do atendente: ");
                String nomea=leitor.next();
                System.out.println("Digite o cpf: ");
                int cpfa=leitor.nextInt();
                System.out.println("Digite o salário: ");
                double salarioa= leitor.nextInt();
                System.out.println("Digite a data de nascimento: ");
                String datanascimentoa= leitor.next();
                Atendente c= new Atendente(nomea, cpfa, salarioa, datanascimentoa);
                funcionarios.add(nomea);
                break;
                case 3:
                System.out.println(funcionarios);
                break;
                case 4:
                System.out.println("Digite o salário do funcionário: ");
                break;
                case 5:
                break;
        
                default:
                    System.out.println("Número incorreto !");
            }
        }
    }
}  
