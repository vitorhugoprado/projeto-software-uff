/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALEXANDRE
 */
public class Produto {
    private int cod_prod;
    private String produto;
    private String descricao;
    private int quantidade;
    private float preco;
    private int estMin;


    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
     public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quant) {
        this.quantidade = quant;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
     public int getEstMin() {
        return estMin;
    }

    public void setEstMin(int estMin) {
        this.estMin = estMin;
    }
}
