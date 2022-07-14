<?php

namespace dto;

// Singleton: Vitor Prado - 219.083.132
//DTO: Luana Victória Gonçalves Vidal Camargo Leão - 219.083.082

class UsuarioDTO
{
  private $id, $nome, $cpf, $cargo;
  private static $instance; // campo para armazenar o objeto instanciado
  /*
  Construtor da classe UsuarioDTO
  Params: id, nome, cpf, cargo.
  */
  public function __construct(int $id, string $nome, string $cpf, string $cargo)
  {
    $this->id = $id;
    $this->nome = $nome;
    $this->cpf = $cpf;
    $this->cargo = $cargo;
  }

  /*
  retorna o id do Usuário
  */
  public function getId()
  {
    return $this->id;
  }

  /*
  define um valor para o id do Usuario
  */
  public function setId($id)
  {
    $this->id = $id;
  }

  /*
  retorna o nome do Usuário
  */
  public function getNome()
  {
    return $this->nome;
  }

  /*
  define um valor para o nome do Usuario
  */
  public function setNome($nome)
  {
    $this->nome = $nome;
  }

  /*
  retorna o cpf do Usuário
  */
  public function getCpf()
  {
    return $this->cpf;
  }

  /*
  define um valor para o cpf do Usuario
  */
  public function setCpf($cpf)
  {
    $this->cpf = $cpf;
  }

  /*
  retorna o cargo do Usuário
  */
  public function getCargo()
  {
    return $this->cargo;
  }

  /*
  define um valor para o cargo do Usuario
  */
  public function setCargo($cargo)
  {
    $this->cargo = $cargo;
  }

  //O getInstance do singleton é publico para que seja acessado por outras classes.

  public static function getInstance(int $id, string $nome, string $cpf, string $cargo)
  {
    if ($cargo === 'gerente') {
      //caso seja um gerente, o padrao singleton garante que somente uma instância da classe UsuarioDTO seja criada.
      if (self::$instance === null) {
        self::$instance = new self($id, $nome, $cpf, $cargo);
      }
      return self::$instance;
    }
  }
}
