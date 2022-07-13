<?php

namespace controller;

require '../model/dao/ProdutosDAO.php';
require '../model/dto/ProdutoDTO.php';

use dao\ProdutoDAO;
use dto\ProdutoDTO;

session_start();
class GerenteController
{
  public function listarProdutos()
  {
    $produtoDAO = new ProdutoDAO();
    $result = $produtoDAO->getProdutos();

    return $result;
  }

  public function excluirProduto($id)
  {
    $produtoDAO = new ProdutoDAO();
    $response = $produtoDAO->excluirProduto($id);

    unset($_SESSION["produtos"]);

    var_dump($response);
    return $response;
  }
}

$requestWasPost = isset($_POST);
$requestWasGet = isset($_GET);

if ($requestWasPost) {
  $action = $_POST["action"];
  $controller = new GerenteController();

  if ($action === 'listarProdutos') {
    $produtos = $controller->listarProdutos();
    $_SESSION['produtos'] = $produtos;
    header("Location: /projetos/CafeMania/src/view/gerente/ListarProdutos");
  }

  if ($action === 'excluirProduto') {
    $id = $_POST['id'];
    $response = $controller->excluirProduto($id);

    if ($response) {
      $_SESSION['success'] = 'Produto excluído com sucesso';
      header("Location: /projetos/CafeMania/src/view/gerente/ListarProdutos");
    }
    $_SESSION['error'] = 'Erro ao excluir produto';
    header("Location: /projetos/CafeMania/src/view/gerente/ListarProdutos");
  }
}
