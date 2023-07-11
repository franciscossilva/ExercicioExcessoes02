import java.util.Scanner;

public class ConversordeMoedasMain {
    public ConversordeMoedasMain(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversordeMoedas conversor = new ConversordeMoedas();
    System.out.println(" Bem vindo ao conversor de Moedas");

    String opcao;
    do {
        try {
            System.out.println("Qual moeda deseja converter? Dolar Americano, Dolar Canadense, Euro ou Libra ?");
            opcao = scanner.nextLine();
            System.out.println("Informe o valor a ser convertido: ");
            String valorString = scanner.nextLine();
            double valor = Double.parseDouble(valorString);
            double valorconvertido = conversor.converterparareal(opcao, valor);
            System.out.println("A " + opcao + " na cotação de hoje " + conversor.getDiaAtual() + " está em" + conversor.getCotacaoAtual(opcao) +
                    "o valor que solicitou para converter de " + valor + " em reais é R$: " + valorconvertido);
        } catch (NumberFormatException var9) {
            System.out.println("Para moedas o valor deve ser em Decimal");
        } catch (IllegalAccessException var10) {
            System.out.println(" Tipo invalido");
        }
        System.out.println("Deseja fazer outra conversao: (S/N)");
        opcao = scanner.nextLine();
    }while (opcao.equalsIgnoreCase("s"));
    System.out.println("Obrigado, tchau ! ");
    scanner.close();

            }

        }

