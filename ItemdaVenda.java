public class ItemdaVenda {
    private String nomeProduto;
    private float preçoProduto;
    private float quantidade;

    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public float getPreçoProduto() {
        return this.preçoProduto;
    }
    public void setPreçoProduto(float preçoProduto) {
      
        this.preçoProduto=preçoProduto;
    }
    public float getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    public ItemdaVenda(String np){
        this.nomeProduto=np;
  
}
public void status(){
    System.out.println("NOME DO PRODUTO: "+getNomeProduto());
}
}

