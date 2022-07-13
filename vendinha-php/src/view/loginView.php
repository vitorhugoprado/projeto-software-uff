<?php
$temErro = !empty($_GET['error']) && $_GET['error'] === 'true';
?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <?php include '../includes/links.php'; ?>
</head>

<body>
  <section class="p-3 bgColorPrimary minHeight100vh d-flex justify-content-center align-items-center">
    <div class="container bg-color-white">
      <form action="../controller/loginController.php" class="col-lg-10" method="POST">
        <label for="inputCpf" class="form-label">Cpf</label>
        <input type="text" class="form-control" id="inputCpf" name="inputCpf" placeholder="Digite seu cpf">

        <br>

        <label for="inputSenha" class="form-label">Senha</label>
        <input type="password" class="form-control" id="inputSenha" name="inputSenha" placeholder="Digite sua senha">

        <?php if ($temErro) : ?>
          <div class="alert alert-danger mt-3" role="alert">
            Cpf ou senha errados. Verifique e tente novamente.
          </div>
        <?php endif; ?>

        <div class="w-100 d-flex justify-content-end mt-3">
          <button type="submit" class="btn rounded buttonPrimary">Logar</button>
        </div>
      </form>
    </div>
  </section>
</body>

</html>