public class JogadorSintetico extends Jogador
{
    public JogadorSintetico(char cor)
    {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa)
    {
        System.out.println("Jogador sintetico de cor " + cor + " jogando " + NomeDaPeca + " para casa " + numeroDaCasa);
        return tabuleiro.realizarJogada(this, NomeDaPeca, numeroDaCasa);
    }
}
