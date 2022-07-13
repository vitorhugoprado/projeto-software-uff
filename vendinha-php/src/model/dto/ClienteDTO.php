<?php

declare(strict_types=1);

namespace dto;

class ClienteDTO
{
  private $id, $nome, $endereco, $email, $cpf;

  function __construct(int $id, String $nome, String $cpf, String $endereco, String $bairro, String $cidade, String $uf, String $cep, String $telefone, String $email)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->endereco = $endereco;
    $this->email = $email;
    $this->cpf = $cpf;
  }

  public function getId(): int
  {
    return $this->id;
  }

  public function setId(int $id)
  {
    $this->id = $id;
  }

  public function getNome(): String
  {
    return $this->nome;
  }

  public function setNome(String $nome)
  {
    $this->nome = $nome;
  }

  public function getEndereco(): String
  {
    return $this->endereco;
  }

  public function setEndereco(String $endereco)
  {
    $this->endereco = $endereco;
  }

  public function getEmail(): String
  {
    return $this->email;
  }

  public function setEmail(String $email)
  {
    $this->email = $email;
  }

  public function getCpf(): String
  {
    return $this->cpf;
  }

  public function setCpf(String $cpf)
  {
    $this->cpf = $cpf;
  }
}
