package model;
public class Item {
    int cod_item;
    int cod_venda;
    int cod_prod;
    float valor_unitario;
    String prod_comprado;
    int quant_item;
    
    public int getCod_item() {
        return cod_item;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getProd_comprado() {
        return prod_comprado;
    }

    public void setProd_comprado(String prod_comprado) {
        this.prod_comprado = prod_comprado;
    }

    public int getQuant_item() {
        return quant_item;
    }

    public void setQuant_item(int quant_item) {
        this.quant_item = quant_item;
    }
  
    
    
}
