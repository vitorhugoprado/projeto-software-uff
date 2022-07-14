<?php

namespace dao;

require_once  'connection.php';
require_once  $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/UsuarioDTO.php';

use Conexao\ConexaoBanco;
use dto\UsuarioDTO;
use \PDOException;

/*
Denerson Eduardo Gomes Berudio -- 219083107
*/
class ClienteDAO
{
  private $connection;

  /*
    No construtor da classe, é a parte em que o DAO abre a conexão com o banco de dados
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
  Esse método é responsável por retornar o cliente solicitado pelo cpf e senha informado
  Para que isso aconteça, é necessário que a conexão com o banco de dados seja aberta
  para que possamos fazer a consulta no mesmo e pegar os recursos solicitados
  Temos como parametro CPF e SENHA, na qual são atributos que existem no banco e que funcionam como
  dados de acesso ao sistema.
  */
  public function getClienteByCPF($cpf, $senha)
  {
    $sql = 'SELECT * FROM clientes WHERE cpf=? AND senha=?';

   /*
    Aqui é onde a conexão com o banco é feita, usando o comando que foi criado em SQL na linha 38
    na qual as interrogações são substituidas pelo cpf e senha vindos como parametro.
    */
    $stmt = $this->connection->prepare($sql);
    $stmt->bindParam(1, $cpf);
    $stmt->bindParam(2, $senha);
    $stmt->execute();
    $result = $stmt->fetchAll()[0];

    /*
    Caso o funcionário não exista no banco, ele irá retornar null, mostrando na view que
    o usuário informado não existe
    */
    if (empty($result)) {
      return null;
    }

    /*
    Caso o Funcionário exista, ele irá retortar o mesmo, com seus dados e cargo, para que
    seja feita a manipulação de telas de acordo com seu cargo e mostrando a tela que ele 
    deve ter o acesso.
    */
    $cliente = new UsuarioDTO(
      $result['id'],
      $result['nome'],
      $result['cpf'],
      'cliente'
    );

    //retorna o Usuario
    return $cliente;
  }

  /*
  Esse método é responsável por fazer uma requisição ao banco, e retornando 
  todos os clientes que existem dentro do banco, para que possam ser mostrados na tela,
  por exemplo.
  */
  public function getClientes()
  {
    $sql = "SELECT * FROM clientes";

    //Abre conexão com o banco de dados
    $stmt = $this->connection->prepare($sql);

    //executa o comando feito na variável sql
    $stmt->execute();
    $result = $stmt->fetchAll();

    //retorna os produtos que chegaram
    return $result;
  }

  /*
  Método responsável pela exclusão de um cliente por um ID solicitado como parametro
  Acessando o banco de dados, procurando o cliente que tem o ID informado.
  Logo após, são feitos os passos para exclusão do cliente.
  */
  public function excluirCliente($id)
  {
    try {
      $sql = "DELETE FROM clientes WHERE id=?";

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
  recebendo nome, endereco, email, cpf e senha como parâmetros, 
  e adicionando essas informações no banco, gerando um ID para o mesmo
  */
  public function incluirCliente($nome, $endereco, $email, $cpf, $senha)
  {
    try {
      //comando a ser executado para inserção do cliente no banco
      $sql = "INSERT INTO clientes (nome, endereco, email, cpf, senha) VALUES (?, ?, ?, ?, ?)";

      //abre a conexão com o banco de dados
      $stmt = $this->connection->prepare($sql);
      $stmt->bindParam(1, $nome);
      $stmt->bindParam(2, $endereco);
      $stmt->bindParam(3, $email);
      $stmt->bindParam(4, $cpf);
      $stmt->bindParam(5, $senha);
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
