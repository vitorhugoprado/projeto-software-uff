<?php 
session_start();

if(isset($_GET['remover']) && $_GET['remover'] == 'carrinho'){
$cod_prod = $_GET['cod_prod'];
unset($_SESSION['itens'][$cod_prod]);	
echo'<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=carrinhofull.php">';
}else {
	if(isset($_GET['remover']) && $_GET['remover'] == 'carrinhoum'){
		$quantidade = $_GET['quantidade'];
		$cod_prod = $_GET['cod_prod'];
		$quantidadenew=$quantidade-1;
	
		echo'<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=carrinhofull.php">';
		
	}
}
?>