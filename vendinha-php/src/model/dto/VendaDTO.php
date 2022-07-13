<?php

namespace dto;

class VendaDTO
{
  private $id, $id_cliente, $valor_total, $data_venda, $pagamento;

  public function __construct(int $id, int $id_cliente, float $valor_total, $data_venda, string $pagamento)
  {
    $this->id = $id;
    $this->id_cliente = $id_cliente;
    $this->valor_total = $valor_total;
    $this->data_venda = $data_venda;
    $this->pagamento = $pagamento;
  }

  public function getId()
  {
    return $this->id;
  }

  public function setId($id)
  {
    $this->id = $id;

    return $this;
  }

  public function getId_cliente()
  {
    return $this->id_cliente;
  }

  public function setId_cliente($id_cliente)
  {
    $this->id_cliente = $id_cliente;

    return $this;
  }

  public function getValor_total()
  {
    return $this->valor_total;
  }

  public function setValor_total($valor_total)
  {
    $this->valor_total = $valor_total;

    return $this;
  }

  public function getData_venda()
  {
    return $this->data_venda;
  }

  public function setData_venda($data_venda)
  {
    $this->data_venda = $data_venda;

    return $this;
  }

  public function getPagamento()
  {
    return $this->pagamento;
  }

  public function setPagamento($pagamento)
  {
    $this->pagamento = $pagamento;

    return $this;
  }
}
