
package model;
public class Venda {

    int cod_venda;
    int cod_cliente;
    String dt_venda;
    float valor_total;
    String form;

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
   
    
    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public String getDt_venda() {
        return dt_venda;
    }

    public void setDt_venda(String dt_venda) {
        this.dt_venda = dt_venda;
    }
    
}
