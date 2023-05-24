import java.util.Scanner;
public class Calcularsalario {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu ganho por hora :");
        double ValorHora =input.nextDouble();
        System.out.print("Digite o valor de horas trabalhadas no mes: ");
        double HorasTrabalhadas =input.nextDouble();
        double SalarioBruto = ValorHora+HorasTrabalhadas;
        double ImpostodeRenda = SalarioBruto* 0.11;
        double inss = SalarioBruto*0.08;
        double sindicato = SalarioBruto*0.05;
        double salarioLiquido= SalarioBruto - ImpostodeRenda-inss-sindicato;

        System.out.println("Salario bruto é R$: " +SalarioBruto);
        System.out.println("O desconto do imposto de renda é: R$ "+ImpostodeRenda);
        System.out.println(" O desconto do INSS é : R$ " +inss);
        System.out.println("O desconto do sindicato é: R$ " +sindicato);
        System.out.println(" O salario liquido é :R$ "+salarioLiquido);
    }
}
