public class Finalizado implements EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orcamentos reprovados nao recebem desconto extra");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento finalizado não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento finalizado não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já stá finalizado");
    }
}
