<?php

namespace dto;

class ItemVendaDTO
{
  private $id, $id_venda,  $id_produto, $valor_unitario, $quant_item;

  /*
  Construtor da classe ItemVendaDTO
  Params: id, id_venda, valor_unitario, quant_item.
  */
  public function __construct(int $id, int $id_venda, float $valor_unitario, int $quant_item)
  {
    $this->id = $id;
    $this->id_venda = $id_venda;
    $this->valor_unitario = $valor_unitario;
    $this->quant_item = $quant_item;
  }

  /*
  retorna o id do ItemVenda
  */
  public function getId()
  {
    return $this->id;
  }

  /*
  define um valor para o id do ItemVenda
  */
  public function setId($id)
  {
    $this->id = $id;
  }

    /*
  retorna o id_venda do ItemVenda
  */
  public function getId_venda()
  {
    return $this->id_venda;
  }

    /*
  define um valor para o id_venda do ItemVenda
  */
  public function setId_venda($id_venda)
  {
    $this->id_venda = $id_venda;
  }

  /*
  retorna o id_produto do ItemVenda
  */
  public function getId_produto()
  {
    return $this->id_produto;
  }

  /*
  define um valor para o id_venda do ItemVenda
  */
  public function setId_produto($id_produto)
  {
    $this->id_produto = $id_produto;
  }

  /*
  retorna o valor_unitario do ItemVenda
  */
  public function getValor_unitario()
  {
    return $this->valor_unitario;
  }

  /*
  define um valor para o valor_unitario do ItemVenda
  */
  public function setValor_unitario($valor_unitario)
  {
    $this->valor_unitario = $valor_unitario;
  }

    /*
  retorna o quant_item do ItemVenda
  */
  public function getQuant_item()
  {
    return $this->quant_item;
  }

  /*
  define um valor para o quant_item do ItemVenda
  */
  public function setQuant_item($quant_item)
  {
    $this->quant_item = $quant_item;
  }
}
