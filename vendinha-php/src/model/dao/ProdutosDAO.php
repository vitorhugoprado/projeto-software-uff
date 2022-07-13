<?php

namespace dao;

require 'connection.php';
require $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/ProdutoDTO.php';

use Conexao\ConexaoBanco;
use dto\ProdutoDTO;
use \PDOException;

class ProdutoDAO
{
  private $connection;

  /*
    No construtor da classe, é a parte em que o DAO abre a contexão com o banco de dados
    Instanciando um objeto do tipo ConexaoBanco, na qual possui o método getConnection
    Logo em seguida, ele atribui o valor da operação feita com o objeto na variável
    connection, que passa a ser utilizada nos métodos do UsuariosDao, evitando assim
    a repetição de código de sempre ter que abrir a conexão em cada método.
  */
  function __construct()
  {
    $conexaoBanco = new ConexaoBanco();
    $this->connection = $conexaoBanco->getConnection();
  }

  /*
  Esse método é responsável por fazer uma requisição ao banco, e retornando 
  todos os produtos que existem dentro do banco, para que possam ser mostrados na tela
  por exemplo.
  */
  public function getProdutos()
  {
    $sql = "SELECT * FROM produtos";

    //Abre conexão com o banco de dados
    $stmt = $this->connection->prepare($sql);

    //executa o comando feito na variável sql
    $stmt->execute();
    $result = $stmt->fetchAll();

    //retorna os produtos que chegaram
    return $result;
  }

  /*
  Método responsável pela exclusão de um produto por um ID solicitado como parametro
  Acessando o banco de dados, procurando o produto que tem o ID informado.
  Logo após, são feitos os passos para exclusão do produto.
  */
  public function excluirProduto($id)
  {
    try {
      $sql = "DELETE FROM produtos WHERE id=?";

      //aberta a conexão com o banco e inserido o comando a ser executado
      $stmt = $this->connection->prepare($sql);

      //trocando a interrogação pelo parametro id vindo quando chamado o método no código
      $stmt->bindParam(1, $id);
      $stmt->execute();
      $stmt->fetchAll();

      //retornando um boolean mostrando o sucesso da exclusão
      return true;
    } catch (PDOException $e) {
      return false;
    }
  }

  public function incluirProduto(ProdutoDTO $produto)
  {
    try {
      $sql = "INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)";

      $stmt = $this->connection->prepare($sql);
      $stmt->bindParam(1, $produto->getNome());
      $stmt->bindParam(2, $produto->getPreco());
      $stmt->bindParam(3, $produto->getEstoque());
      $stmt->execute();
      $stmt->fetchAll();

      return true;
    } catch (PDOException $e) {
      return false;
    }
  }
}
