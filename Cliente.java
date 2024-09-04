public class Cliente{
    private String nome;
    private int idade;
    public void status(){
        System.out.println("===========");
        System.out.println("F A T U R A");
        System.out.println("============");
        System.out.println("NOME: "+getNome());
        System.out.println("IDADE: "+getIdade());
    }
    public void adicionarNome(String nome){
        this.setNome(nome);
    }
    public void adicionarIdade(int idade){
        this.setIdade(idade);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Cliente(String nome,int idade){
        this.nome=nome;
        this.idade=idade;

    }
}