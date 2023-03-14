
package javaapplication1;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    
    public Pessoa(String nome, int idade, String email)
    {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//    
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
//    
//    public void setEmail (String email) {
//        this.email = email;
//    }
   
    public void imprime ()
    {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(email);
    }
}
