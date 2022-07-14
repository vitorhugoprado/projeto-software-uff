<?php

declare(strict_types=1);

namespace dto;


Class CartaoCreditoDTO extends CartaoDTO{

    private $numeroParcela;

    /*
    Construtor da classe ClienteDTO
    Params: numero, nome, dataVencimento, codigoSeguranca, totalVenda, numeroParcela
    */
    function __construct(string $numero, string $nome, string $dataVencimento,int $codigoSeguranca,float $totalVenda, int $numeroParcela){
        $this->numero = $numero;
        $this->nome = $nome;
        $this->dataVencimento = $dataVencimento;
        $this->codigoSeguranca = $codigoSeguranca;
        $this->totalVenda = $totalVenda;
        $this->numeroParcela = $numeroParcela;
    }

    /**
     * retorna o numeroParcela de CartaoCredito
     */ 
    public function getNumeroParcela()
    {
        return $this->numeroParcela;
    }

    /**
     * Define o valor para numeroParcela em CartaoCredito
     */ 
    public function setNumeroParcela($numeroParcela)
    {
        $this->numeroParcela = $numeroParcela;
    }
}
?>