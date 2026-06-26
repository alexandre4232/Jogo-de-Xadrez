abstract class Jogador implements JogadorInterface
{
    protected char cor;

    public Jogador(char cor)
    {
        if (cor != 'p' && cor != 'b')
        {
            throw new IllegalArgumentException("Cor deve ser p ou b");
        }
        this.cor = cor;
    }

    public char getCor()
    {
        return cor;
    }
}
