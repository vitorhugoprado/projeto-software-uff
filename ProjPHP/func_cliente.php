<?php
class func_cliente{
 function incluir($c) {
		
         $con= mysqli_connect("127.0.0.1", "root", "", "bancozilla");
         $sql = "Insert into cliente (nome,cep,telefone,email,logadouro,numero,dt_nasc,bairro,cidade,estado, login, senha) values(". 	 "'".			 	 
         $c -> getNome()."'  ,'".
         $c -> getcep()."'  ,'".
         $c -> gettelefone()."','" .
		 $c -> getEmail()."','" .
		 $c -> getlogadouro()."','" .
		 $c -> getnumero()."','" .
		 $c -> getdt_nasc()."','" .
		 $c -> getbairro()."','" .
		 $c -> getcidade()."','" .
		 $c -> getestado()."','" .
		 $c -> getlogin()."','" .
		 $c -> getsenha()."')";
		 	 
         print "sql " .$sql;
          if(mysqli_query($con, $sql)) {
		     print "inserido com sucessso!!!<br>";
        	}
	    else
		   print "erro ". mysqli_error($con);

			
 }
	   
}
	   ?>