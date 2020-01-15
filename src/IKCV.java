public class IKCV extends TemplateDeImpostoCondicional{

    private boolean itemMaiorQue100ReaaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens())
            if(item.getValor() > 100)
                return true;
        return false;
    }

    @Override
    public double minimaTxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor()*0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && itemMaiorQue100ReaaisNo(orcamento);
    }

}
