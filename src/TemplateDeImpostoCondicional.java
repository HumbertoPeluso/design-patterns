public abstract class TemplateDeImpostoCondicional extends Imposto {
    @Override
    public final double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        else 
            return minimaTxacao(orcamento) + calculaOutroImposto(orcamento);
    }

    public abstract double minimaTxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
