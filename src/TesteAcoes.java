public class TesteAcoes {
    public static void main(String[] args){
        CriadorDeNotaFiscal builder = new CriadorDeNotaFiscal();
        builder.adicionaAcao(new EnviaadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDAO());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresa("Caelum")
                .comItem(new ItemDaNota("nome", 100))
                .comObservacoes("Qualquer")
                .naDatAtual()
                .constroi();

        System.out.println(nf.getValorBruto());
    }
}
