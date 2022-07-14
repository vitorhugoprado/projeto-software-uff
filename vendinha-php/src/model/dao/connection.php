<?php

namespace Conexao;

use \PDO;
use \PDOException;

/*
Denerson Eduardo Gomes Berudio -- 219083107
*/

/*
Classe criada para abrir a conexão com o banco e fazer o login de forma automática
*/
class ConexaoBanco
{
  public static function getConnection()
  {
    $url = 'mysql:host=127.0.0.1:3308;dbname=banco_cafe_mania';
    $user = 'root';
    $password = '';

    try {
      $pdo = new PDO($url, $user, $password);
      return $pdo;
    } catch (PDOException $e) {
      echo 'Error: ' . $e->getMessage();
    }
  }
}
