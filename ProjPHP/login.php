<html>
<head>
<title>
Cadastro de Cliente
</title>
<link rel="icon" 
      type="image/png" 
      href="icones/icone.png" />
<link rel="stylesheet" type="text/css" href="cizudo.css">
</head>
<body bgcolor="#5c4638">
<?php include ("testa.php"); ?>
<center><br><br><br>
<font face="Vijaya" size="5" color="#c8a46d"><u> Formulário de Login<p></u></font>
<form action="logando.php" method="post" >
    <table class="table">
        <tr>
            <td><font face="Vijaya" size="5" color="#c8a46d">Identificação:</font></td>
            <td><input class ="grande" type="text" name="login" /></td>
        </tr>
        <tr>
            <td><font face="Vijaya" size="5" color="#c8a46d">Senha:</font></td>
            <td><input class ="grande" type="password" name="senha" /></td>
        </tr>
		 
    </table>
	<br><br>
	   <button class="butinho" type="submit">Entrar</button><br><br><br></form>
	   <?php  
	   
	   if(isset($_GET['volta']) && $_GET['volta'] == 'deslogou'){
		   $_SESSION['mensagem_erro']= "";
		   echo "<font face='Vijaya' size='5' color='#c8a46d'>".$_SESSION['mensagem_erro']."</font>";
	   }else{
	    if(isset($_GET['volta']) && $_GET['volta'] == 'cadastrou'){
		   $_SESSION['mensagem_erro']= "";
		   echo "<font face='Vijaya' size='5' color='#c8a46d'>Agora faça login com os dados previamente inseridos</font>";
		}else {
		   $_SESSION['mensagem_erro']= "Login ou Senha inválidos, cheque seus dados e tente novamente";
		    echo "<font face='Vijaya' size='5' color='#c8a46d'>".$_SESSION['mensagem_erro']."</font>";
	   }}
	   ?>
<hr><hr>
<form action="aoresgate.php" method="post" >
<table class="table">
        <tr>
            <td><font face="Vijaya" size="5" color="#c8a46d">Numero de Cadastro:</font></td>
            <td><input class ="grande" type="text" name="cod_cliente" /></td>
        </tr>
        <tr>
            <td><font face="Vijaya" size="5" color="#c8a46d">login:</font></td>
            <td><input class ="grande" type="text" name="login1" /></td>
        </tr>
		<tr>
            <td><font face="Vijaya" size="5" color="#c8a46d">Senha:</font></td>
            <td><input class ="grande" type="password" name="senha1" /></td>
        </tr>
		 
    </table>
<button class="butinho" type="submit">Alterar</button><br><br><br></form>

</center>
</body>
</html>