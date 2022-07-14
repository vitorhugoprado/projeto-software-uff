<?php

namespace dto;

class VendaDTO
{
  private $id, $id_cliente, $valor_total, $data_venda, $pagamento;

  /*
  Construtor da classe VendaDTO
  Params: id, id_cliente, valor_total, data_venda, pagamento.
  */
  public function __construct(int $id, int $id_cliente, float $valor_total, $data_venda, string $pagamento)
  {
    $this->id = $id;
    $this->id_cliente = $id_cliente;
    $this->valor_total = $valor_total;
    $this->data_venda = $data_venda;
    $this->pagamento = $pagamento;
  }

  /*
  retorna o id da Venda
  */
  public function getId()
  {
    return $this->id;
  }

   /*
  define um valor para o id da Venda
  */
  public function setId($id)
  {
    $this->id = $id;

    return $this;
  }

  /*
  retorna o id_cliente da Venda
  */
  public function getId_cliente()
  {
    return $this->id_cliente;
  }

  /*
  define um valor para o id_cliente da Venda
  */
  public function setId_cliente($id_cliente)
  {
    $this->id_cliente = $id_cliente;
  }

    /*
  retorna o valor_total da Venda
  */
  public function getValor_total()
  {
    return $this->valor_total;
  }

     /*
  define um valor para o valor_total da Venda
  */
  public function setValor_total($valor_total)
  {
    $this->valor_total = $valor_total;
  }

    /*
  retorna o data_venda da Venda
  */
  public function getData_venda()
  {
    return $this->data_venda;
  }

  /*
  define um valor para o data_venda da Venda
  */
  public function setData_venda($data_venda)
  {
    $this->data_venda = $data_venda;
  }

  /*
  retorna o pagamento da Venda
  */
  public function getPagamento()
  {
    return $this->pagamento;
  }

  /*
  define um valor para o pagamento da Venda
  */
  public function setPagamento($pagamento)
  {
    $this->pagamento = $pagamento;
  }
}
