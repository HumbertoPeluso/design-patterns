import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

    public static void main(String[] args){

        /*List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0),
                new ItemDaNota("item 2", 400.0));

        double valorTotal = 0;
        for(ItemDaNota item : itens)
            valorTotal += item.getValor();

        double impostos = valorTotal * 0.05;

        NotaFiscal nf = new NotaFiscal("razão social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "observacoes");*/


        CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal();
        criador.paraEmpresa("Ensino e inovacao")
        .comCNPJ("1234567891")
        .comItem(new ItemDaNota("item 1", 200.0))
        .comItem(new ItemDaNota("item 2", 300.0))
        .comItem(new ItemDaNota("item 3", 400.0))
        .comObservacoes("observacoes")
        .naDatAtual();

      NotaFiscal nf = criador.constroi();

        // e assim por adiante

        System.out.println(nf.getValorBruto());


    }

}
