public class DesontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.contemItemDeNome("Lapis") && orcamento.contemItemDeNome("Caneta"))
            return orcamento.getValor() * 0.05;
        else
            return this.proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
