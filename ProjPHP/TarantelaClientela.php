<html>
<head>
<title>
Cadastro de Cliente
</title>

<link rel="icon" 
      type="image/png" 
      href="icones/icone.png" />
<link rel="stylesheet" type="text/css" href="cizudo.css">
<style>

input.data[type=text] {
	width:130px;
    color:c8a46d;
    padding: 12px 20px;
	background: #5c4638;
    margin: 8px 0;
    box-sizing: 50px;
    border: none;
    border-bottom: 2px solid black;	
}
input::placeholder {
  color: #c8a46d;
}
input.media[type=text] {
	width:150px;
    color:c8a46d;
    padding: 12px 20px;
	background: #5c4638;
    margin: 8px 0;
    box-sizing: 50px;
    border: none;
    border-bottom: 2px solid black;	
}
input.media[type=password] {
	width:150px;
    color:c8a46d;
    padding: 12px 20px;
	background: #5c4638;
    margin: 8px 0;
    box-sizing: 50px;
    border: none;
    border-bottom: 2px solid black;	
}
input.cep[type=text] {
	width:100px;
    color:c8a46d;
    padding: 12px 20px;
	background: #5c4638;
    margin: 8px 0;
    box-sizing: 50px;
    border: none;
    border-bottom: 2px solid black;	
}
input.pequena[type=text] {
	width:150px;
    color:c8a46d;
    padding: 12px 20px;
	background: #5c4638;
    margin: 8px 0;
    box-sizing: 50px;
    border: none;
    border-bottom: 2px solid black;	
}
 select{
	   -webkit-appearance: none;
	   background-color:c8a46d;
		font-family:Vijaya;
		font-size:18px;
		color:5c4638;
		border-radius: 4px;
}


</style>

<script type="text/javascript" language="javascript">
function valida_form (){
if(document.getElementById("obrigatorio").value.length < 1){
alert('Por favor, preencha o campo obrigatorio');
document.getElementById("obrigatorio").focus();
return false
}
}
</script>


</head>
<body bgcolor="#5c4638">

<?php
include ("testa.php");
?>
<center>
<font face="Vijaya" size="5" color="#c8a46d"><u> Formulário de cadastro<p></u></font>
<font face="Vijaya" size="3" color="#c8a46d">Preencha os campos com atenção<p></font>
<form action="CNTRL_CLI.php" method="post" action="#" onsubmit="return valida_form(this)">
    
    <font face="Vijaya" size="5" color="#c8a46d"><u> Dados pessoais:<p></u></font>    
            <font face="Vijaya" size="5" color="#c8a46d">Nome Completo:</font></td>
            <input class="grande" type="text" name="nome" id="obrigatorio"></span></td>
			
			<font face="Vijaya" size="5" color="#c8a46d" >data nascimento:</font></td>
            <input class="data" type="text" name="dt_nasc" placeholder="DD/MM/AAAA" id="obrigatorio"></td>
			<br>
        
        		<font face="Vijaya" size="5" color="#c8a46d">Email:</font></td>
            <input class="grande" type="text" name="email" id="obrigatorio"/></td>
			
			
			<font face="Vijaya" size="5" color="#c8a46d" >Telefone:</font></td>
            <input class="grande" type="text" name="telefone" id="obrigatorio"/></td>
			
			<br><br><br>
			<hr>
			<font face="Vijaya" size="5" color="#c8a46d"><u> Endereço:<p></u></font>
            <font face="Vijaya" size="5" color="#c8a46d">Cep:</font></td>
            <input class="grande" type="text" name="cep" id="obrigatorio"/></td>
     
	 
		<font face="Vijaya" size="5" color="#c8a46d">Logadouro:</font></td>
            <input class="grande" type="text" name="logadouro" id="obrigatorio"/></td>
			
        
		<font face="Vijaya" size="5" color="#c8a46d">Numero:</font></td>
            <input class="pequena" type="text" name="numero" id="obrigatorio"/></td>
				
		
		<font face="Vijaya" size="5" color="#c8a46d">Bairro:</font></td>
            <input class="media" type="text" name="bairo" id="obrigatorio"/></td><br>
			
			
		<font face="Vijaya" size="5" color="#c8a46d">Cidade:</font></td>
            <input class="grande" type="text" name="cidade" id="obrigatorio"/></td>
			
		<font face="Vijaya" size="5" color="#c8a46d">Estado:</font></td>
		<select name="estado">
			<option value="AC">Acre(AC)</option>
			<option value="AL">Alagoas(AL)</option>
			<option value="AP">Amapá</option>
			<option value="AM">Amazonas(AM)</option>
			<option value="BA">Bahia(BA)</option>
			<option value="CE">ceará(CE)</option>
			<option value="DF">Distrito Federal(DF)</option>
			<option value="ES">Espírito Santo(ES)</option>
			<option value="GO">Goiás(GO)</option>
			<option value="MA">Maranhão(MA)</option>
			<option value="MT">Mato Grosso(MT)</option>
			<option value="MS">Mato Grosso do Sul(MS)</option>
			<option value="MG">Minas Gerais(MG)</option>
			<option value="PA">Pará(PA)</option>
			<option value="PB">Paraíba(PB)</option>
			<option value="PR">Paraná(PR)</option>
			<option value="PE">Pernanbuco(PE)</option>
			<option value="PI">Piauí(PI)</option>
			<option value="RJ">Rio de Janeiro(RJ)</option>
			<option value="RN">Rio Grande do Norte(RN)</option>
			<option value="RS">Rio Grande do Sul(RS)</option>
			<option value="RO">Rondônia(RO)</option>
			<option value="RR">Roraima(RR)</option>
			<option value="SC">Santa Catarina(SC)</option>
			<option value="SP">São Paulo(SP)</option>
			<option value="SE">Sergipe(SE)</option>
			<option value="TO">Tocantins(TO)</option>
		</select><br>
		
		<hr>
		<font face="Vijaya" size="5" color="#c8a46d"><u> Identificação:<p></u></font>    
		<font face="Vijaya" size="5" color="#c8a46d">Login:</font></td>
            <input class="media" type="text" name="login" id="obrigatorio"/></td>
			
			<font face="Vijaya" size="5" color="#c8a46d">senha:</font></td>
            <input class="media" type="password" name="senha" id="obrigatorio"/></td>
			<br>
		<button class="Butinho" type="submit"><b>Cadastrar</b></button></td>
		<br>
		</body>
		</html>
            
			
        
</form>
