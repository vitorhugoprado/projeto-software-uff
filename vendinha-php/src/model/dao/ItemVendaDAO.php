<?php

namespace dao;

require 'connection.php';
require $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/ClienteDTO.php';

use Conexao\ConexaoBanco;
use \PDOException;

/*
Denerson Eduardo Gomes Berudio -- 219083107
*/
Class ItemVendaDAO
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
  todos os itens das vendas que existem dentro do banco, para que possam ser mostrados na tela,
  por exemplo.
  */
  public function getItensVendas()
  {
    $sql = "SELECT * FROM item_venda";

    //Abre conexão com o banco de dados
    $stmt = $this->connection->prepare($sql);

    //executa o comando feito na variável sql
    $stmt->execute();
    $result = $stmt->fetchAll();

    //retorna os itens que chegaram
    return $result;
  }

    /*
  Método responsável pela exclusão de um item de venda por um ID solicitado como parametro
  Acessando o banco de dados, procurando o item que tem o ID informado.
  Logo após, são feitos os passos para exclusão do item.
  */
  public function excluirItemVenda($id)
  {
    try {
      $sql = "DELETE FROM item_venda WHERE id=?";

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
  Método responsável por incluir um item_venda no banco de dados,
  recebendo id_venda, id_produto, valor_unitario e quant_item como parâmetros, 
  e adicionando essas informações no banco, gerando um ID para o mesmo
  */
  public function incluirItemVenda($id_venda, $id_produto, $valor_unitario, $quant_item)
  {
    try {
      //comando a ser executado para inserção do cliente no banco
      $sql = "INSERT INTO item_venda (id_venda, id_produto, valor_unitario, quant_item) VALUES (?, ?, ?, ?)";

      //abre a conexão com o banco de dados
      $stmt = $this->connection->prepare($sql);
      $stmt->bindParam(1, $id_venda);
      $stmt->bindParam(2, $id_produto);
      $stmt->bindParam(3, $valor_unitario);
      $stmt->bindParam(4, $quant_item);
      $stmt->execute();
      $stmt->fetchAll();

      //retorna true se a inserção for um sucesso
      return true;
    } catch (PDOException $e) {
      //retorna false se a inserção não é um sucesso
      return false;
    }
  }
}
?>
