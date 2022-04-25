<html>
<head>
<title> Nota Fiscal </title>
<link rel="icon" 
      type="image/png" 
      href="icones/icone.png" />
<link rel="stylesheet" type="text/css" href="cizudo.css">
<style>

table.ending{
    border-collapse: collapse;
    width: 80%;
}


th.ending, td.ending {
    padding: 15px;
    text-align: left;
	 background-color: #f8f800;
	 border: 1px solid black;
}
th.ending {
    background-color: #8c6635;
    color: white;
}
</style>
</head>
<body>


<?php
// dando include pra notinha aparecer me baixo do resultado final
include ('carrinhofull.php');

$pagamento = $_POST['pay'];
$cod_item=1;
$data=date("d/m/Y");

$conexao= new PDO('mysql:host=localhost;dbname=bancozilla',"root","");
// inserindo na venda 
$select=$conexao->prepare("insert into venda (cod_cliente,valor_total,dt_venda,pagamento) values 
	('".$_SESSION['codusuario']."',0,'".$data.".','".$pagamento."');");
	$select->execute();
	echo "<table class='ending'><tr class='ending'>";
	foreach($_SESSION['itens'] as $cod_prod =>$quantidade){
	
	$select=$conexao->prepare("SELECT * FROM estoque_de_podrutos where cod_prod=?");
	$select->bindParam(1,$cod_prod);
	$select->execute();
	$produtos = $select->fetchAll();
	
	$total=$quantidade*$produtos[0]['preco'];
	$_SESSION['ultimo']=null;
	echo 
	"<td class='ending'> ".$produtos[0]["produto"]."</td>
	<td class='ending'>".$quantidade."</td>
	<td class='ending'>".number_format($produtos[0]['preco'],2,",",".")."</td>
	<td class='ending'>".$total."</td></tr>";
	//inserindo venda
	
	//pegando pk da venda
	 $con= mysqli_connect("127.0.0.1", "root", "", "bancozilla");
	    $sql = "SELECT cod_venda FROM venda ORDER BY cod_venda DESC LIMIT 1;";
          $resultado = mysqli_query($con, $sql);
		  $registro = mysqli_fetch_array($resultado);
		  $cod=$registro['cod_venda'];
  
	//inserindo na intem_venda usando a pk de venda
	$select=$conexao->prepare("insert into item_venda (cod_venda,cod_item,cod_prod,valor_unitario,prod_comprado,quant_item) values 
	('".$cod."','".$cod_item."','".$cod_prod."','".$produtos[0]["preco"]."','".$produtos[0]["produto"]."','".$quantidade."');");
	
	$select->execute();
	$cod_item++;
	}
	echo "<td class='ending' colspan='4'><center>".$totinho."</center></td></table>";
	//updatando o valor da venda 
	$select=$conexao->prepare("UPDATE venda SET	valor_total=".$totinho." WHERE cod_venda=".$cod);
	$select->execute();
	
	
	//matando o carinho do cara pra não repitir a mesma venda
	unset($_SESSION['itens']);	
?>

</body>
</html>
