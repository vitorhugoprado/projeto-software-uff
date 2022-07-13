<?php

namespace dto;

class ItemVendaDTO
{
  private $id, $id_venda,  $id_produto, $valor_unitario, $quant_item;

  public function __construct(int $id, int $id_venda, float $valor_unitario, int $quant_item)
  {
    $this->id = $id;
    $this->id_venda = $id_venda;
    $this->valor_unitario = $valor_unitario;
    $this->quant_item = $quant_item;
  }

  public function getId()
  {
    return $this->id;
  }

  public function setId($id)
  {
    $this->id = $id;
  }

  public function getId_venda()
  {
    return $this->id_venda;
  }

  public function setId_venda($id_venda)
  {
    $this->id_venda = $id_venda;
  }

  public function getId_produto()
  {
    return $this->id_produto;
  }

  public function setId_produto($id_produto)
  {
    $this->id_produto = $id_produto;
  }

  public function getValor_unitario()
  {
    return $this->valor_unitario;
  }

  public function setValor_unitario($valor_unitario)
  {
    $this->valor_unitario = $valor_unitario;
  }

  public function getQuant_item()
  {
    return $this->quant_item;
  }

  public function setQuant_item($quant_item)
  {
    $this->quant_item = $quant_item;
  }
}
