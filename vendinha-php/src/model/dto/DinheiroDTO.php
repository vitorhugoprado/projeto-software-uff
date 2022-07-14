<?php

declare(strict_types=1);

namespace dto;

Class DinheiroDTO{

    private $totalVenda, $troco, $valorPago;

    /*
    Construtor da classe ClienteDTO
    Params: totalVenda, Troco, valorPago
    */
    function __construct(float $totalVenda, float $troco, float $valorPago){
        $this->totalVenda = $totalVenda;
        $this->troco = $troco;
        $this->valorPago = $valorPago;
    }

    /**
     * retorna o totalVenda do Dinheiro
     */ 
    public function getTotalVenda()
    {
        return $this->totalVenda;
    }

    /*
    define um valor para o totalVenda do Dinheiro
   */
    public function setTotalVenda($totalVenda)
    {
        $this->totalVenda = $totalVenda;
    }

    /**
     * retorna o troco do Dinheiro
     */ 
    public function getTroco()
    {
        return $this->troco;
    }

    /*
    define um valor para o troco do Dinheiro
   */
    public function setTroco($troco)
    {
        $this->troco = $troco;
    }

    /**
     * retorna o valorPago do Pix
     */ 
    public function getValorPago()
    {
        return $this->valorPago;
    }

    /*
    define um valor para o valorPago do Dinheiro
   */
    public function setValorPago($valorPago)
    {
        $this->valorPago = $valorPago;

    }
}
?>