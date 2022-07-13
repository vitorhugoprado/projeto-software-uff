<?php

namespace controller;

require $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dao/ProdutosDAO.php';
require $_SERVER['DOCUMENT_ROOT'] . '/projetos/CafeMania/src/model/dto/ProdutoDTO.php';

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

  public function incluirProduto(ProdutoDTO $produto)
  {
    $produtoDAO = new ProdutoDAO();
    $response = $produtoDAO->incluirProduto($produto);
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

  if ($action === 'cadastrarProdutos') {
    $nome = $_POST['nome'];
    $preco = $_POST['preco'];
    $estoque = $_POST['estoque'];
    $produto = new ProdutoDTO(
      0,
      $nome,
      $preco,
      $estoque
    );

    $response = $controller->incluirProduto($produto);

    if ($response) {
      $_SESSION['success'] = 'Produto adicionado com sucesso';
      header("Location: /projetos/CafeMania/src/view/gerente/ListarProdutos");
    }

    $_SESSION['error'] = 'Produto não foi adicionado';
    header("Location: /projetos/CafeMania/src/view/gerente");
  }
}
