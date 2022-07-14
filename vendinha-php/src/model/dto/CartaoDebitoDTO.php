<?php

declare(strict_types=1);

namespace dto;

// Luana Victória Gonçalves Vidal Camargo Leão - 219083082

Class CartaoDebitoDTO extends CartaoDTO{

    /*
    Construtor da classe ClienteDTO
    Params: numero, nome, dataVencimento, codigoSeguranca, totalVenda
    */
    function __construct(string $numero, string $nome, string $dataVencimento,int $codigoSeguranca,float $totalVenda){
        $this->numero = $numero;
        $this->nome = $nome;
        $this->dataVencimento = $dataVencimento;
        $this->codigoSeguranca = $codigoSeguranca;
        $this->totalVenda = $totalVenda;
    }
}
?>