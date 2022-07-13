<?php

namespace controller;

require '../model/dao/UsuariosDAO.php';

use dao\UsuariosDao;

class LoginController
{
  function logar($cpf, $senha)
  {
    $usuarioDao = new UsuariosDao();
    $usuarioLogado = $usuarioDao->getUsuarioByCpfAndSenha($cpf, $senha);

    if (empty($usuarioLogado)) {
      header('Location: ../view/loginView.php');
    }

    $usuarioLogado->getCargo() === 'gerente'
      ? header('Location: ../view/gerente/')
      : header('Location: ../view/atendente/homeAtendente.php');
  }

  function deslogar()
  {
    //
  }
}

$cpf = $_POST["inputCpf"];
$senha = $_POST["inputSenha"];
$validandoParametro = !empty($cpf) && !empty($senha);

if (!$validandoParametro) {
  header('Location: ../view/loginView.php');
  return;
}

$login = new LoginController();
$login->logar($cpf, $senha);
