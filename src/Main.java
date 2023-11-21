import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Bem vindo ao Conversor de numeros:");

        // Controle do loop principal do programa
        boolean continua = true;

        // Loop principal
        do {
            // Imprime o menu de opções
            System.out.println(" ");
            System.out.println("Digite 1 para converter algarismos Arabicos em algarismos Romanos (0 a 3999)");
            System.out.println("Digite 2 para converter algarismos Romanos em algarismos Arabicos, digite-os corretamente");
            System.out.println("Digite 3 para Sair");

            try {
                //Scanner para ler a entrada do usuário
                Scanner sc = new Scanner(System.in);
                // Lê a escolha do usuário
                int n = sc.nextInt();

                // Cria um objeto da classe Conversor
                Conversor cv = new Conversor();

                // Estrutura de seleção para tratar a escolha do usuário
                switch (n) {
                    //chama o metodo que converte Arabicos em Romanos
                    case 1:
                        System.out.println("Digite o numero em algarismo arabicos: ");
                        System.out.println(cv.converterArabicoParaRomano(sc.nextInt()));
                        break;
                    //chama o metodo que converte Romanos em Arabicos
                    case 2:
                        // Opção de conversão de números romanos para arábicos
                        System.out.println("Digite o numero em algarismo Romanos: ");
                        // Lê o número e chama o método de conversão, imprimindo o resultado
                        System.out.println(cv.converterRomanoParaArabico(sc.next()));
                        break;
                    // Opção para sair do programa
                    case 3:

                        continua = false;
                        break;
                }

            } catch (Exception e) {
                // Trata erros de entrada inválida
                System.out.println("Numero Invalido!");
            }

            // Repete o loop enquanto o usuário não escolher sair
        } while(continua);
    }
}
