<?php
$nome=$_POST['nome'];
$cep=$_POST['cep'];
$telefone=$_POST['telefone'];
$email=$_POST['email'];
$logadouro=$_POST['logadouro'];
$numero=$_POST['numero'];
$dt_nasc=$_POST['dt_nasc'];
$bairo=$_POST['bairo'];
$cidade=$_POST['cidade'];
$estado=$_POST['estado'];
$login=$_POST['login'];
$senha=$_POST['senha'];









include("Cliente.php");
include("func_cliente.php");


$objCli = new Cliente();
$objCli->setnome($nome);
$objCli->setcep($cep);
$objCli->settelefone($telefone);
$objCli->setEmail($email);
$objCli->setlogadouro($logadouro);
$objCli->setnumero($numero);
$objCli->setdt_nasc($dt_nasc);
$objCli->setbairro($bairo);
$objCli->setcidade($cidade);
$objCli->setestado($estado);
$objCli->setlogin($login);
$objCli->setsenha($senha);




$daoCli = new func_cliente();
$daoCli->incluir($objCli);	
echo'<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=login.php?volta=cadastrou">';
?>