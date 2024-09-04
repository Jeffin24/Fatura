import java.util.Scanner;
public class Fatura {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        Scanner nomp= new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome=leia.nextLine();
        System.out.print("Digite sua idade: ");
        int idade=leia.nextInt();
        Cliente pessoa=new Cliente(nome, idade);
        System.out.print("Digite o nome do item da venda: ");
        String nop=nomp.nextLine();
        ItemdaVenda np=new ItemdaVenda(nop);
        System.out.print("Digite o preço por unidade do item: ");
        float pp=leia.nextFloat();
        System.out.print("Digite quantas unidades comprou: ");
        float quantidade=leia.nextFloat();
        CalcFaturamento fatura=new CalcFaturamento(quantidade, pp);

        pessoa.status();
        np.status();
        fatura.preçoTotal();
       
    }
    
}
