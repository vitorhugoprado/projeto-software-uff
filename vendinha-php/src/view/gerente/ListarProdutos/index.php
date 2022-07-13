<!DOCTYPE html>
<html lang="pt-br">
<?php
session_start();
$produtos = null;
if (empty($_SESSION['produtos'])) {
  header("Location: /projetos/CafeMania/src/view/gerente");
}
$produtos = $_SESSION['produtos'];
?>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Listar produto</title>
  <?php include '../../../includes/links.php'; ?>
</head>

<body>
  <table class="table">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Preço</th>
        <th>Qtd Estoque</th>
        <th>ações</th>
      </tr>
    </thead>
    <tbody>
      <?php foreach ($produtos as $produto) { ?>
        <tr>
          <td><?php echo $produto['nome'] ?></td>
          <td><?php echo $produto['preco'] ?></td>
          <td><?php echo $produto['estoque'] ?></td>
          <td>
            <form action="../../../controller/gerenteController.php" method="post" id="form">
              <input type="hidden" name="action" id="action" />
              <input type="hidden" name="id" id="inputId" />
              <button class="excluir" id="<?php echo $produto['id']; ?>" type="button">Excluir</button>
              <button class="editar" id="<?php echo $produto['id']; ?>" type="button">Editar</button>
            </form>
          </td>
        </tr>
      <?php } ?>
    </tbody>
  </table>

  <script>
    $(window).on("load", function() {
      let form = $('#form');

      $('.excluir').click(function() {
        let id = $(this).attr('id');
        $('#action').val('excluirProduto');
        $('#inputId').val(id);
        form.submit();
      });

      $('.editar').click(function() {
        $('#action').val('editarProduto');
        $('#inputId').val($(this).attr('id'));
        form.submit();
      });
    });
  </script>
</body>

</html>