<html>
<head><title>café com Serviços </title>
<link rel="icon" 
      type="image/png" 
      href="icones/icone.png" />
<link rel="stylesheet" type="text/css" href="cizudo.css">

</head>
<body bgcolor="#5c4638">

<?php 

include ("testa.php");


	$totaludo=0;
	$totinho=0;
	$total=0;
	
	
if(!isset($_SESSION['itens'])){
	$_SESSION['itens'] = array();	
}
if(isset($_GET['add']) && $_GET['add'] == "carrinho"){
	//pega o cod_prod q o usuário clickou e insere no carrinho
	$cod_prod = $_GET['cod_prod'];
	if(!isset($_SESSION['itens'][$cod_prod])){
		//verifica se já existe pra caso exista colocar por cima oa invés de criar outro
		$_SESSION['itens'][$cod_prod] = 1;
	}else{
		$_SESSION['itens'][$cod_prod] +=1;
	}
}
//carrinho vazio
if(count($_SESSION['itens']) == 0){
	
	unset($_SESSION['ultimo']);	
	echo "<center><font size='8' face='Vijaya' color='white'> Carrinho Vazio, clique no link abaixo para <BR>
	<a href='oia.php'>comprar itens</a></font></center>";
}else{
	//carrinho com algo mostra tudo com um foreach
	$conexao= new PDO('mysql:host=localhost;dbname=bancozilla',"root","");
	
	
	echo "<center><table class='carrinho'><tr class='carrinho'><th class='carrinho'>Nome</th><th class='carrinho'>Remover</th><th class='carrinho'>Quantidade</th><th class='carrinho'>Preço</th><th class='carrinho'>Total</th></tr>";
	foreach($_SESSION['itens'] as $cod_prod =>$quantidade){
	$select=$conexao->prepare("SELECT * FROM estoque_de_podrutos where cod_prod=?");
	$select->bindParam(1,$cod_prod);
	$select->execute();
	$produtos = $select->fetchAll();
	
	$total=$quantidade*$produtos[0]['preco'];
    
	$_SESSION['ultimo']=$produtos[0]["produto"];
	echo 
	"
	<tr class='carrinho'><td class='carrinho'>".$produtos[0]["produto"]."<br></td>
	<td class='carrinho'><a href='saidemonio.php?remover=carrinho&cod_prod=".$cod_prod."'>Remover</a><br></td>
	<td class='carrinho'>".$quantidade."<br></td>
	<td class='carrinho'>".number_format($produtos[0]['preco'],2,",",".")."<br></td>
	<td class='carrinho'>".$total."<br></td></tr>";
	$_SESSION['ultimo']=$produtos[0]["produto"];
	$totinho=$total+$totinho;
	
	}
	
	echo "<tr><th class='carrinho'>total a pagar</td><td colspan='4' class='carrinho'>".number_format($totinho,2,",",".")."<br></td></tr>

		
	
	</table>
	<br><br><br>";
	// só deixa o cara finalizar a compra caso ele esteja logado
	if(!isset($_SESSION['codusuario'])){	
	echo "<button disable class='Butinhomagicwall'>Finalizar compra</button> <br><br></form>
	<font size='5' color='c8a46d'>ou 
	<br><br>
	<form action='oia.php' method='post'>
	<button class='Butinho'>Continuar Comprando</button> <br><br><br></form></center>";
	}else{
		echo "
		<form action='finalizar.php?finalizar=carrinho&cod_prod=".$cod_prod."' method='post'>
		<font size='5' color='c8a46d'>escolha o metodo de pagamento<br></font>
		
		<select name='pay'>
			<option value='debito'>Débito</option>
			<option value='credito'>Crédito</option>
			<option value='dinheiro'>Dinheiro</option>
			<option value='vale'>Vale Alimentação</option>
			</select>
			<br>
		<button class='Butinho'>Finalizar compra</button> <br><br></form>
	<font size='5' color='c8a46d'>ou 
	<br><br>
	<form action='oia.php' method='post'>
	<button class='Butinho'>Continuar Comprando</button> <br><br><br></form></center>
	
";
		
	}
	

}
// toca de volta pra oia caso tenha clicado no produto, só fica na pagina mesmo caso tenha chegado pelo finalizar compra
if(isset($_GET['back']) && $_GET['back'] == "quick"){
	echo'<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=oia.php">';
}



?>

</body>
</html>








