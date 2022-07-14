<?php

declare(strict_types=1);

namespace dto;


Class CartaoDTO{

    private $numero, $nome, $dataVencimento, $codigoSeguranca, $totalVenda;
    
    /*
    Construtor da classe ClienteDTO
    Params: numero, nome, dataVencimento, codigoSeguranca, totalVenda, numeroParcela
    */
    function __construct(string $numero, string $nome, string $dataVencimento,int $codigoSeguranca,float $totalVenda){
        $this->numero = $numero;
        $this->nome = $nome;
        $this->dataVencimento = $dataVencimento;
        $this->codigoSeguranca = $codigoSeguranca;
        $this->totalVenda = $totalVenda;
    }

    /**
     *retorna o numero do Cartao
     */ 
    public function getNumero()
    {
        return $this->numero;
    }

    /**
     * Define um valor para o numero do Cartao
     */ 
    public function setNumero($numero)
    {
        $this->numero = $numero;
    }

    /**
     *retorna o nome do Cartao
     */ 
    public function getNome()
    {
        return $this->nome;
    }

    /**
     * Define um valor para o nome do Cartao
     */ 
    public function setNome($nome)
    {
        $this->nome = $nome;

        return $this;
    }

     /**
     *retorna o dataVencimento do Cartao
     */ 
    public function getDataVencimento()
    {
        return $this->dataVencimento;
    }

    /**
     * Define um valor para o dataVencimento do Cartao
     */ 
    public function setDataVencimento($dataVencimento)
    {
        $this->dataVencimento = $dataVencimento;
    }

    /**
     *retorna o codigoSeguranca do Cartao
     */ 
    public function getCodigoSeguranca()
    {
        return $this->codigoSeguranca;
    }

    /**
     * Define um valor para o codigoSeguranca do Cartao
     */ 
    public function setCodigoSeguranca($codigoSeguranca)
    {
        $this->codigoSeguranca = $codigoSeguranca;
    }

     /**
     *retorna o totalVenda do Cartao
     */ 
    public function getTotalVenda()
    {
        return $this->totalVenda;
    }

    /**
     * Define um valor para o totalVenda do Cartao
     */ 
    public function setTotalVenda($totalVenda)
    {
        $this->totalVenda = $totalVenda;
    }
}
?>