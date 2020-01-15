public class CalculadorImpostos {

    /*public void realizaCalculo(Orcamento orcamento, String imposto){

        // Para cada tipo de imposto um if deve ser adicionado
        if(imposto.equals("ICMS")){
            double icms = orcamento.getValor()*0.1;
            System.out.println(icms);
        }
        else if (imposto.equals("ISS")){
            double iss = orcamento.getValor()* 0.06;
            System.out.println(iss);
        }


    }*/

    // Esta classe com este método continuará crescendo pra sempre para
    // cada tipo de imposto adicionado
   /* public void realizaCalulo(Orcamento orcamento, String imposto){
        if(imposto.equals("ICMS")){
            double icms = new ICMS().calculaICMS(orcamento);
            System.out.println(icms);
        }
        else if (imposto.equals("ISS")){
            double iss = new ISS().calculaISS(orcamento);
            System.out.println(iss);
        }
    }*/

   //Com um método para cada tipo de imposto é possível remover od IFs
    // e remover o paramentro imposto
    // Porém a classe continuará crescendo

  /* public void realizaCalculoICMS(Orcamento orcamento){
       double icms = new ICMS().calculaICMS(orcamento);
       System.out.println(icms);
   }

    public void realizaCalculoISS(Orcamento orcamento){
        double iss = new ISS().calculaISS(orcamento);
        System.out.println(iss);
    }
*/

    public void realizaCalulo(Orcamento orcamento, Imposto imposto) {

        double resultado = imposto.calcula(orcamento);
        System.out.println(resultado);
    }

}
