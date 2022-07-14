<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Efetuar Venda</title>
</head>

<body>
  <?php include('../../../includes/header.php') ?>
  <form action="" id="formPagamento">
    <label for="produto">Produto:</label>
    <select name="produto" id="produto">
      <option value="1">Mesa</option>
    </select>

    <label for="quantidade">Quantidade</label>
    <input type="number" id="quantidade" name="quantidade">

    <label for="valor">Valor da compra:</label>
    <input type="text" disabled id="valor" name="valor">

    <div id="produtosAdicionados">
      <div>
        <table>
          <thead>
            <tr>
              <th>Nome</th>
              <th>Valor uni</th>
              <th>Quantidade</th>
              <th>Valor total</th>
              <th>Ação</th>
            </tr>
          </thead>
        </table>
      </div>
    </div>

    <label for="tipoPagamento">Tipo de pagamento:</label>
    <select name="tipoPagamento" id="tipoPagamento">
      <option value="pix">Pix</option>
      <option value="cartaoDebito">Cartão débito</option>
      <option value="cartaoCredito">Cartão crédito</option>
      <option value="dinheiro">Dinheiro</option>
    </select>

    <div id="telaPix">
      <label for="chavePix">Chave pix</label>
      <h2>(21) 99212-2121</h2>
      <input type="hidden" name="pix" id="pix">
      <button type="button">Pagamento efetuado</button>
    </div>

    <div id="telaCartaoDebito">
      <input type="hidden" name="cartaoDebito" id="cartaoDebito">
      <button type="button">Pagamento efetuado</button>
    </div>

    <div id="telaCartaoCredito">
      <input type="hidden" name="cartaoCredito" id="cartaoCredito">
      <button type="button">Pagamento efetuado</button>
    </div>

    <div id="telaDinheiro">
      <input type="hidden" name="dinheiro" id="dinheiro">
      <button type="button">Pagamento efetuado</button>
    </div>
  </form>
  <?php include('../../../includes/footer.php') ?>
</body>

</html>