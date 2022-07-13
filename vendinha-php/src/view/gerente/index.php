<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Home</title>
  <?php include '../../includes/links.php'; ?>
</head>

<body>
  <h1>Menu</h1>
  <form action="../../controller/gerenteController.php" id="formMenuGerente" method="post">
    <input type="hidden" name="action" id="action" value="">

    <button type="button" id="relatorioCaixa">Emitir relatório de fechamento de caixa</button>
    <button type="button" id="relatorioVenda">Emitir relatório de produtos vendidos</button>
    <button type="button" id="relatorioQtdProduto">Emitir relatório da quantidade de produtos</button>
    <button type="button" id="notaFiscal">Emitir nota fiscal</button>
    <button type="button" id="manterCliente">ManterCliente</button>
    <button type="button" id="listarProdutos">Listar produtos</button>
  </form>

  <script>
    $(window).on("load", function() {
      let form = $('#formMenuGerente');

      $('#relatorioCaixa').click(function() {
        $('#action').val('relatorioCaixa');
        form.submit();
      });

      $('#relatorioVenda').click(function() {
        $('#action').val('relatorioVenda');
        form.submit();
      });

      $('#relatorioQtdProduto').click(function() {
        $('#action').val('relatorioQtdProduto');
        form.submit();
      });

      $('#notaFiscal').click(function() {
        $('#action').val('notaFiscal');
        form.submit();
      });

      $('#manterCliente').click(function() {
        $('#action').val('manterCliente');
        form.submit();
      });

      $('#listarProdutos').click(function() {
        $('#action').val('listarProdutos');
        form.submit();
      });
    });
  </script>
</body>

</html>