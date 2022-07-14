<?php

namespace dto;

class ProdutoDTO
{
  private $id, $nome, $preco, $estoque;

  /*
  Construtor da classe ProdutoDTO
  Params: id, nome, preco, estoque.
  */
  public function __construct(int $id, string $nome, float $preco, int $estoque)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->preco = $preco;
    $this->estoque = $estoque;
  }

  /*
  retorna o id do Produto
  */
  public function getId()
  {
    return $this->id;
  }

   /*
  define um valor para o id do Produto
  */
  public function setId($id)
  {
    $this->id = $id;
  }

  /*
  retorna o nome do Produto
  */
  public function getNome()
  {
    return $this->nome;
  }

  /*
  define um valor para o nome do Produto
  */
  public function setNome($nome)
  {
    $this->nome = $nome;
  }

  /*
  retorna o preco do Produto
  */
  public function getPreco()
  {
    return $this->preco;
  }

  /*
  define um valor para o preco do Produto
  */
  public function setPreco($preco)
  {
    $this->preco = $preco;
  }

  /*
  retorna o estoque do Produto
  */
  public function getEstoque()
  {
    return $this->estoque;
  }

  /*
  define um valor para o estoque do Produto
  */
  public function setEstoque($estoque)
  {
    $this->estoque = $estoque;
  }
}
