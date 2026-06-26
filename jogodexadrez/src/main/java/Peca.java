public abstract class Peca
{
    protected String nome;

    public Peca(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void mover()
    {
        System.out.println(nome + " movendo");
    }

    @Override
    public String toString()
    {
        return nome;
    }
}

