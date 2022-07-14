<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cadastrar produto</title>
</head>

<body>
  <?php include('../../../includes/header.php') ?>
  <form action="../../../controller/gerenteController.php" method="post">
    <label for="nome">Nome do produto:</label>
    <input type="text" name="nome" id="nome">

    <label for="preco">Preco do produto:</label>
    <input type="text" name="preco" id="preco">

    <label for="estoque">Quantiade de produto em estoque:</label>
    <input type="text" name="estoque" id="estoque">

    <input type="hidden" name="action" value="cadastrarProdutos">

    <button>Cadastrar</button>
  </form>

  <?php include('../../../includes/footer.php') ?>
</body>

</html>