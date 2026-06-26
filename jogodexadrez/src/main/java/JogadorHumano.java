import java.util.Scanner;

public class JogadorHumano extends Jogador{
    public JogadorHumano(char cor)
    {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa)
    {
        Scanner entrada = new Scanner(System.in);
        while (true)
        {
            System.out.println("Qual peça você quer mover?");
            String peca = entrada.nextLine();
            System.out.println("Para qual casa você deseja mover?");
            String casa = entrada.nextLine();
            if (tabuleiro.moverPeca(peca, casa))
            {
                tabuleiro.mostrar();
                break;
            }
            System.out.println("A casa já está ocupada.");
        }
        System.out.println("Deseja continuar jogando? (S/N)");
        String resposta = entrada.nextLine();
        return !resposta.equalsIgnoreCase("N");
    }
}
