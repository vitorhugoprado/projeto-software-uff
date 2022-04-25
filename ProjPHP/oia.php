<!DOCTYPE html>
<html>
<head>
<title>Café com Serviços</title>
<link rel="icon" 
      type="image/png" 
      href="icones/icone.png" />
<link rel="stylesheet" type="text/css" href="cizudo.css">
</head>
<body bgcolor="#5c4638">
<!-- barra superior menu -->

<?php
 include ("testa.php");


$_SESSION['ultimo']="Nenhum produto recente";
	$conexao= new PDO('mysql:host=localhost;dbname=bancozilla',"root","");
	$select=$conexao->prepare("SELECT * FROM estoque_de_podrutos");
	$select->execute();
	$fetch = $select->fetchAll();
	$func='document.getElementById("nomelast").innerHTML =(this.value);';
	/*var_dump($fetch);*/
	$continho=1;
	
	echo "<div class='sidemenu'>
<center>
<font face='Vijaya' size='5' color='#5c4638'>Cardápio:<br>
<p align='left'><U>Salgados e Doces:.................................................................................................</u></p>";
	foreach($fetch as $produto){
		print str_pad($produto['produto'], 80, ".", STR_PAD_RIGHT)."R$".number_format($produto['preco'],2,",",".")."<br><br>";
//echo "<p align='left'>".$produto['produto'].".....................................................................R$".$produto['preco'].",00</p>";

	}
echo "</div><div class='normal' align='left'>";
	foreach($fetch as $produto){
		$espaco='&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ';
		
		echo "
		<img class ='zoomprod' src='".$produto['produto'].".png' width='200px'> 
		
		".$espaco."<font face='Vijaya' size='5' color='#c8a46d'><u>".$produto['produto']."<p> </u></font>
".$espaco."<div class='entaojae'><font face='Vijaya' size='5' color='#c8a46d'> ".$produto['descricao']." <font>
".$espaco."<font face='Vijaya' size='5' color='#c8a46d'>Preço: R$".number_format($produto['preco'],2,",",".")."  </font>
".$espaco."<form action='carrinhofull.php?add=carrinho&cod_prod=".$produto['cod_prod']."&back=quick' method='post'>
".$espaco."<button name=".$produto['produto']." class='Butinho' onclick=".$func.">Adicionar ao Carrinho </button> </form></div><br><br><br><br><br><br><br><br><br><br><br><br><hr>";
//qualquer coisa apaga o back quick do botão q ele para de voltar igual uma piranha Cassemiro do futuro
	}
echo "</div>";
	?>
	

<br><br><br><br><br><br><br><br><br><br><br><br>
</center>


<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>