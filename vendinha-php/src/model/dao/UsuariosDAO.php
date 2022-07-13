<?php

namespace dao;

require 'connection.php';

require $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/UsuarioDTO.php';

use Conexao\ConexaoBanco;
use dto\UsuarioDTO;

class UsuariosDao
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
  Esse método é responsável por retornar o usuário solicitado pelo cpf e senha informado
  Para que isso aconteça, é necessário que a conexão com o banco de dados seja aberta
  para que possamos fazer a consulta no mesmo e pegar os recursos solicitados
  Temos como parametro CPF e SENHA, na qual são atributos que existem no banco e que funcionam como
  dados de acesso ao sistema.
  */
  public function getUsuarioByCpfAndSenha($cpf, $senha)
  {
    $sql = 'SELECT * FROM usuarios WHERE cpf=? AND senha=?';

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
    $usuario = new UsuarioDTO(
      $result['id'],
      $result['nome'],
      $result['cpf'],
      $result['cargo']
    );

    //retorna o Funcionário
    return $usuario;
  }
}