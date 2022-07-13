<?php

namespace dto;

class UsuarioDTO
{
  private $id, $nome, $cpf, $cargo;

  public function __construct(int $id, string $nome, string $cpf, string $cargo)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->cpf = $cpf;
    $this->cargo = $cargo;
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

  public function getCpf()
  {
    return $this->cpf;
  }

  public function setCpf($cpf)
  {
    $this->cpf = $cpf;
  }

  public function getCargo()
  {
    return $this->cargo;
  }

  public function setCargo($cargo)
  {
    $this->cargo = $cargo;
  }
}
