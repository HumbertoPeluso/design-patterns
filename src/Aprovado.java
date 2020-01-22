public class Aprovado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento){
        orcamento.valor -= orcamento.valor*0.02;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já está aprovado.");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já está aprovado, não pode ser reprovado.");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }

}
