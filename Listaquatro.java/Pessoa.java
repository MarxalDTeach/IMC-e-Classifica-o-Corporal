public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

public Pessoa(String nome, int idade, double altura, 
double peso, double imc){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
 }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void altura(double peso){
        this.pes = peso;
    }
    public double calcImc(){
        return imc = ((getAltura()*getAltura()) / getPeso());  
    }
}
