
<html>
<head>
<link rel="stylesheet" type="text/css" href="cizudo.css">


</head>
<body>
<ul class="menu">

  <li style="float:left" class="aiai"><a class="active" href="oia.php"> <img src ="icones\icone.png" width="50" height="50"> </a> </li>
  <li><font size="14" face="Vladimir Script" color="#c8a46d">Café Com Serviços</font></li>
  
  <li style="float:right"><a href="sonoscontatinho.php"> <img src="icones\info.png" width="50" height="50"> </a></li>
  <li style="float:right" class="dropdown">
  <a href="javascript:void(0)" class="dropbtn"> <img src="icones\usuario.png" width="50" height="50"> </a>
  <div class="dropdown-content">
  <?php
  session_start();
   if(!isset($_SESSION['codusuario'])){	
	echo "<a href='TarantelaClientela.php'>Cadastrar-se</a><a href='login.php?volta=deslogou'>Entrar</a></div>";
}else
echo "<a href=#atual>Bem-Vindo ".$_SESSION['nomeusuario']."</a>
<a href='saiusuario.php'>Sair do usuário atual</a>";
if(!isset($_SESSION['ultimo'])){
	$_SESSION['ultimo']="Nenhum produto no carrinho";
}
?>
</div>
  </li>
  <li style="float:right" id="adicionar" class="dropdown">
  <a href="javascript:void(0)" class="dropbtn" ><img src="icones\marquinhos.png" width="50" height="50"></a>
  <div class="dropdown-content">
  <a href="carrinhofull.php"> Finalizar compra </a>
  <a href="#produto" id="nomelast">
  
  <?php echo $_SESSION['ultimo']."<br>";
  if($_SESSION['ultimo'] <> "Nenhum produto no carrinho" && $_SESSION['ultimo'] <> "Nenhum produto recente" ){
	  echo "<img src='".$_SESSION['ultimo'].".png' width='100' height'100'></center>";}?></a>  
  </div>
  </li>
</ul>

<br><br>
</body>
</html>
