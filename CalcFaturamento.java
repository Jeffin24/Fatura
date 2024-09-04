public class CalcFaturamento {
    private ItemdaVenda item=new ItemdaVenda(null);
    private float preçoTotal;
    public CalcFaturamento(float quantidade,float pp){
        item.setPreçoProduto(pp);
        item.setQuantidade(quantidade);
        this.setPreçoTotal(item.getPreçoProduto()*item.getQuantidade());
    }
    
    public float getPreçoTotal() {
        return preçoTotal;
    }
    public void setPreçoTotal(float preçoTotal) {
        this.preçoTotal = preçoTotal;
    }
    public ItemdaVenda getItem() {
        return item;
    }
    public void setItem(ItemdaVenda item) {
        this.item = item;
    }
    public void preçoTotal(){
        System.out.println("PREÇO DA UNIDADE: "+item.getPreçoProduto());
        System.out.println("UNIDADES COMPRADAS: "+item.getQuantidade());
        System.out.println("PREÇO TOTAL: "+getPreçoTotal());
    }
    
    
}
