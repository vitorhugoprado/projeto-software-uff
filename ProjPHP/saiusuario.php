<?php 
session_start();
$_SESSION['codusuario']=null;
	unset($_SESSION['jadeuruim']);	
echo '<META HTTP-EQUIV="REFRESH" CONTENT="0;URL=login.php?volta=deslogou">';
session_destroy();	
?>