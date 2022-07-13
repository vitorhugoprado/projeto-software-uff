<?php

namespace dto;

class ProdutoDTO
{
  private $id, $nome, $preco, $estoque;

  public function __construct(int $id, string $nome, float $preco, int $estoque)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->preco = $preco;
    $this->estoque = $estoque;
  }

  public function getId()
  {
    return $this->id;
  }

  public function setId($id)
  {
    $this->id = $id;
  }

  public function getNome()
  {
    return $this->nome;
  }

  public function setNome($nome)
  {
    $this->nome = $nome;
  }

  public function getPreco()
  {
    return $this->preco;
  }

  public function setPreco($preco)
  {
    $this->preco = $preco;
  }

  public function getEstoque()
  {
    return $this->estoque;
  }

  public function setEstoque($estoque)
  {
    $this->estoque = $estoque;
  }
}
