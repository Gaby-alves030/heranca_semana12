public class Empregado extends Pessoa {
//codigoSetor (inteiro), salarioBase (vencimento base) e imposto
//(porcentagem retida dos impostos)

private int codigoSetor;
private double salarioBase;
private double imposto;


     //método de alteração
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor=codigoSetor;
     
  
    //método de consulta
    public int setCodigoSetor(){
        return this.codigoSetor;

        //método de alteração
        public void setSalarioBase(double salarioBase){
            this.salarioBase=salarioBase;

        }

        //método de consulta
        public double getSalarioBase(){
            return this.salarioBase;
        }
//metodo de alteração
        public void setImposto(double imposto){
            this.imposto=imposto;
        }
    
    //metodo de consulta
    public double getImposto(){
        return this.imposto;
   }

   public double calcularSalario(){
       double salarioLiquido=0;

       salarioLiquido=this.salarioBase=this.imposto;
    //iremos fazer o cálculo do salario liquido

      return salarioLiquido;
    }
    
}
    

