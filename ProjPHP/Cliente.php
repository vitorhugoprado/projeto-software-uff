<?php
   class Cliente{
   private $cod_cliente;
   private $nome;
   private $cep;
   private $telefone;
   private $email;
   private $logadouro;
   private $numero;
   private $dt_nasc;
   private $bairro;
   private $cidade;
   private $estado;
   private $login;
   private $senha;
   
   
 
 public function setcod_cliente($cod_cliente){
     $this->cod_cliente=$cod_cliente;
   }
   public function getcod_cliente() {
     return $this->cod_cliente;
   }
   public function setnome($nome){
     $this->nome=$nome;
   }
   public function getnome() {
     return $this->nome;
   }
   public function setcep($cep){
     $this->cep=$cep;
   }
   public function getcep() {
     return $this->cep;
   }
   public function settelefone($telefone){
     $this->telefone=$telefone;
   }
   public function gettelefone() {
     return $this->telefone;
   }
     public function setEmail($email){
     $this->email=$email;
   }
   public function getEmail() {
     return $this->email;
   }
     public function setlogadouro($logadouro){
     $this->logadouro=$logadouro;
   }
   public function getlogadouro() {
     return $this->logadouro;
   }
    public function setnumero($numero){
     $this->numero=$numero;
   }
   public function getnumero() {
     return $this->numero;
   }
   public function setdt_nasc($dt_nasc){
     $this->dt_nasc=$dt_nasc;
   }
   public function getdt_nasc() {
     return $this->dt_nasc;
   }
   public function setbairro($bairro){
     $this->bairro=$bairro;
   }
   public function getbairro() {
     return $this->bairro;
   }
   public function setcidade($cidade){
     $this->cidade=$cidade;
   }
   public function getcidade() {
     return $this->cidade;
   }
   public function setestado($estado){
     $this->estado=$estado;
   }
   public function getestado() {
     return $this->estado;
   }
      public function setlogin($login){
     $this->login=$login;
   }
   public function getlogin() {
     return $this->login;
   }
         public function setsenha($senha){
     $this->senha=$senha;
   }
   public function getsenha() {
     return $this->senha;
   }
   }
   ?>