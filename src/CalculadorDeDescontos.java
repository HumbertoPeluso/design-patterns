public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento) {

        //  O código aabaixo foi descartado
        /*//mais de 5 iens, desconto
        if(orcamento.getItens().size()>5){
            return orcamento.getValor() * 0.1;
        }

        // segunda regra...
        else if(orcamento.getValor() > 500.0)
            return orcamento.getValor() * 0.07;
        //em caso contrário
        return 0;*/

        //proximo codigo tambem descartado

        /*double desconto = new DescontoPorCincoItens().desconta(orcamento);
        if (desconto == 0) desconto = new DescontoPorMaisDeQuinhetosReais().desconta(orcamento);
            return 0;*/

        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
        Desconto d3 = new DesontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconta(orcamento);

    }

    }


