public class Teste {

    public static void main(String args[]){
       //criando objeto empregado
       Empregado empregado=new Empregado();

       empregado.setCodigoSetor(1);
       empregado.setSalarioBase(1000);
       empregado.setImposto(100);

       //iremos apresentar o salário Líquido
       System.out.println(empregado.calcularSalario());




    
    }
    


}
