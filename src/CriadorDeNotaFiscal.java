import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorDeNotaFiscal {

    private String razaoSocial;
    private String cnpj;

    private List<ItemDaNota>todosItens = new ArrayList<ItemDaNota>();
    private double valoBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;
    private List<AcaoAposGerarNota>todasAcoesASeremExecutadas;

    public CriadorDeNotaFiscal(){
        this.todasAcoesASeremExecutadas = new ArrayList<>();
    }

    public void adicionaAcao(AcaoAposGerarNota acao){
        this.todasAcoesASeremExecutadas.add(acao);
    }

    public CriadorDeNotaFiscal paraEmpresa(String razaoSocial){
        this.razaoSocial = razaoSocial;
        return this;
    }

    public CriadorDeNotaFiscal comCNPJ(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public CriadorDeNotaFiscal comItem(ItemDaNota item){
        todosItens.add(item);
        valoBruto += item.getValor();
        impostos += item.getValor()*0.05;
        return this;
    }

    public CriadorDeNotaFiscal comObservacoes(String observacoes){
        this.observacoes = observacoes;
        return this;
    }

    public CriadorDeNotaFiscal naDatAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi(){
        NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valoBruto, impostos, todosItens, observacoes );

        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas)
            acao.executa(nf);

        return nf;
    }


}
