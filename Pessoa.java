//nome da classe
public class Pessoa{

    //atributos
private String nome;
private String endereço;
private String telefone;

//método de alteração
public void setNome(String nome){
    this.nome=nome;
}
//método de consulta
public String getNome(){
    return this.nome;
     
}
//método de alteração
public void setENdereco(String endereço){
    this.endereço=endereço;
}
//método de consulta
public String getEndereço(){
    return this.endereço;
}
    //método de alteração
    public void setTelefone(String telefone){
        this.telefone=telefone;

        //método de consulta
        String getTelefone(){
            return this.telefone;
        }

        
    }
//construtor padrão
public Pessoa(){

}
//construtor com um parametro
public Pessoa(String nome){
    this.nome=nome;

}
//construtor com dois parametros
    public Pessoa(String nome,String endereço){
        this.nome=nome;
        this.endereço=endereço;
    }
}