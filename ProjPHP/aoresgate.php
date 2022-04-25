<?PHP
 $con= mysqli_connect("127.0.0.1", "root", "", "bancozilla");
SESSION_START();
// Captura dados 
$cod_cliente = $_POST['cod_cliente'];
$login = $_POST['login1'];
$senha = $_POST['senha1'];

 $_SESSION["item"]=0;
 
//usa os dados q vinheram do get pra dar update no login e na senha

$sql = "UPDATE cliente ";
$sql = $sql . " SET ";
$sql = $sql . "  login = '" . $login . "', ";
$sql = $sql . " senha = '" . $senha."'" ;
$sql = $sql . " WHERE cod_cliente = '" . $cod_cliente."'" ;
print $sql.'<br>';

$rs = mysqli_query($con, $sql);

 print "erro ". mysqli_error($con);
 // toca de volta pra pagina de login
  echo'<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=login.php?volta=deslogou">';

?>