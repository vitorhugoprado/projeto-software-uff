<?PHP
 $con= mysqli_connect("127.0.0.1", "root", "", "bancozilla");
SESSION_START();
//pegando os dados q vinheram da pagina de login 
$login = $_POST['login'];
$senha = $_POST['senha'];

 $_SESSION["item"]=0;
// Verifica se o e-mail do cliente já está cadastrado
$sql = "SELECT * ";
$sql = $sql . " FROM cliente ";
$sql = $sql . " WHERE login = '" . $login . "' ";
$sql = $sql . " AND senha = '" . $senha."'" ;
print $sql.'<br>';

$rs = mysqli_query($con, $sql);

 print "erro ". mysqli_error($con);
 
$reg = mysqli_fetch_array($rs);
// Recupera o número de acesso do usuário e taca de volta pra homepage
$id = $reg['cod_cliente'];
$nome=$reg['nome'];
$_SESSION['nomeusuario'] = $nome;
$_SESSION['codusuario'] = $id;
echo'<a href="oia.php">logou sim vai la</a><br> Codigo:'.$_SESSION['codusuario'].'<br>Nome:'.$_SESSION['nomeusuario'].'<br><meta HTTP-EQUIV="Refresh" CONTENT="0;URL=oia.php">';


//$acesso = $reg['acesso'];
$total_registros = mysqli_num_rows($rs);
if ($total_registros == 0) {
	$_SESSION['mensagem_erro'] = "Login ou senha inválidos";
	echo'<meta HTTP-EQUIV="Refresh" CONTENT="0;URL=login.php">';
} else {
	$_SESSION['mensagem_erro'] = "";
	// Autoriza liberação para as páginas de administração do site
	$_SESSION['acesso'] = "fs_liberado";	
	$_SESSION['nome'] =$nome;
	$_SESSION['id'] =$id;
	print (" cli ".$_SESSION['id']."   " .$id);
	print $nome;
	//print "<meta HTTP-EQUIV='Refresh' CONTENT='0;URL=oia.php'>";	
}
// Libera os recursos usados pela conexão atual
mysqli_free_result($rs);
mysqli_close ($con);
?>