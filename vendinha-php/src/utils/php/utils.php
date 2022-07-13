<?php

namespace utils;

class UtilsController
{
  public function VerificaSession($redirecionarPara)
  {
    $userLogado = $_SESSION['login'];
    if ($userLogado === "gerente") {
      header('Location: ./src/view/GerenteView.php');
      return;
    }
    if ($userLogado === "atendente") {
      header('Location: ./src/view/AtendenteView.php');
      return;
    }
    header('Location: ./src/view/loginView.php');
    return;
  }
}
