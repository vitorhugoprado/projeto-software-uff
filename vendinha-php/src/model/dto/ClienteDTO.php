<?php

declare(strict_types=1);

namespace dto;

// Luana Victória Gonçalves Vidal Camargo Leão - 219083082

class ClienteDTO
{
  private $id, $nome, $endereco, $email, $cpf, $senha;

  /*
  Construtor da classe ClienteDTO
  Params: id, nome, cpf, endereço, bairro, 
  */
  function __construct(int $id, String $nome, String $endereco, String $email, $cpf, $senha)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->endereco = $endereco;
    $this->email = $email;
    $this->cpf = $cpf;
    $this->senha = $senha;
  }

  /*
  retorna o id do Cliente
  */
  public function getId(): int
  {
    return $this->id;
  }

  /*
  define um valor para o id do Cliente
  */
  public function setId(int $id)
  {
    $this->id = $id;
  }

  /*
  retorna o nome do Cliente
  */
  public function getNome(): String
  {
    return $this->nome;
  }

  /*
  define um valor para o nome do Cliente
  */
  public function setNome(String $nome)
  {
    $this->nome = $nome;
  }

  /*
  retorna o endereco do Cliente
  */
  public function getEndereco(): String
  {
    return $this->endereco;
  }

  /*
  define um valor para o endereco do Cliente
  */
  public function setEndereco(String $endereco)
  {
    $this->endereco = $endereco;
  }

  /*
  retorna o email do Cliente
  */
  public function getEmail(): String
  {
    return $this->email;
  }

  /*
  define um valor para o email do Cliente
  */
  public function setEmail(String $email)
  {
    $this->email = $email;
  }

  /*
  retorna o cpf do Cliente
  */
  public function getCpf(): String
  {
    return $this->cpf;
  }

  /*
  define um valor para o cpf do Cliente
  */
  public function setCpf(String $cpf)
  {
    $this->cpf = $cpf;
  }

  /*
  retorna a senha do Cliente
  */
  public function getSenha()
  {
    return $this->senha;
  }

  /*
  define um valor para a senha do Cliente
  */
  public function setSenha($senha)
  {
    $this->senha = $senha;
  }
}
