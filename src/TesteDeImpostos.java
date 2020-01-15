public class TesteDeImpostos {
   public static void main(String[] args){
       Imposto iss = new ISS();
       Imposto icms = new ICMS();
       Imposto iccc = new ICCC();
       Imposto icpp = new ICPP();

       Orcamento orcamento = new Orcamento(500.0);

//A classe calculadora de impostos não precisa exitir
       /*CalculadorImpostos calculadorImpostos = new CalculadorImpostos();

       calculadorImpostos.realizaCalulo(orcamento, iss);
       calculadorImpostos.realizaCalulo(orcamento, icms);
       calculadorImpostos.realizaCalulo(orcamento, iccc);*/

       System.out.println(iss.calcula(orcamento));
       System.out.println(icms.calcula(orcamento));
       System.out.println(iccc.calcula(orcamento));

   }
}
