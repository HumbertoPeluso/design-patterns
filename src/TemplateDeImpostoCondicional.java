public abstract class TemplateDeImpostoCondicional implements Imposto {
    @Override
    public final double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento);
        else 
            return minimaTxacao(orcamento);
    }

    public abstract double minimaTxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
