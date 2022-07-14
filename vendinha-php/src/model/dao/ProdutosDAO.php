<?php

namespace dao;

require_once  'connection.php';
require_once  $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/ProdutoDTO.php';

use Conexao\ConexaoBanco;
use dto\ProdutoDTO;
use \PDOException;

/*
Denerson Eduardo Gomes Berudio -- 219083107
*/
class ProdutoDAO
{
  private $connection;

  /*
    No construtor da classe, é a parte em que o DAO abre a conexão com o banco de dados
    Instanciando um objeto do tipo ConexaoBanco, na qual possui o método getConnection
    Logo em seguida, ele atribui o valor da operação feita com o objeto na variável
    connection, que passa a ser utilizada nos métodos do UsuariosDAO, evitando assim
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

    /*
  Método responsável por incluir um cliente no banco de dados,
  recebendo nome, preco e estoque como parametro 
  e adicionando essas informações no banco, gerando um ID para o mesmo
  */
  public function incluirProduto($nome, $preco, $estoque)
  {
    try {
      //comando que vai ser executado para inserção de um produto no banco
      $sql = "INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)";

      //abre a conexão com o banco e coloca o comando para ser executado
      $stmt = $this->connection->prepare($sql);
      $stmt->bindParam(1, $nome);
      $stmt->bindParam(2, $preco);
      $stmt->bindParam(3, $estoque);
      $stmt->execute();
      $stmt->fetchAll();

      //retorna true se a inserção for um sucesso
      return true;
    } catch (PDOException $e) {
      //retorna false se a inserção der algum problema
      return false;
    }
  }
}
