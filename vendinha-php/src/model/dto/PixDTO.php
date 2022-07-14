<?php

declare(strict_types=1);

namespace dto;

class PixDTO{

    private $tipoChave, $chave, $totalVenda;

    /*
    Construtor da classe ClienteDTO
    Params: numero, nome, dataVencimento, codigoSeguranca, totalVenda, numeroParcela
    */
    function __construct(string $tipoChave, string $chave, float $totalVenda){

        $this->tipoChave = $tipoChave;
        $this->chave = $chave;
        $this->totalVenda = $totalVenda;
    }

    /**
     * retorna o tipoChave do Pix
     */ 
    public function getTipoChave()
    {
        return $this->tipoChave;
    }

    /*
    define um valor para o tipoChave do Pix
   */
    public function setTipoChave($tipoChave)
    {
        $this->tipoChave = $tipoChave;
    }

    /**
     * retorna o Chave do Pix
     */ 
    public function getChave()
    {
        return $this->chave;
    }

    /*
    define um valor para a Chave do Pix
   */
    public function setChave($chave)
    {
        $this->chave = $chave;
    }

    /**
     * retorna o totalVenda do Pix
     */ 
    public function getTotalVenda()
    {
        return $this->totalVenda;
    }

    /*
    define um valor para o totalVenda do Pix
   */
    public function setTotalVenda($totalVenda)
    {
        $this->totalVenda = $totalVenda;
    }
}

?>