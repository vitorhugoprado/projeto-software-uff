<?php

namespace dto;

require_once "../dto/VendaDTO.php";

use dto\VendaDTO;

/*
Denerson Eduardo Gomes Berudio -- 219083107
*/
class RelatoriosVendaBuilder
{
  private VendaDTO $venda;

  public function BuscarDados()
  {
    $sql = 'SELECT * FROM venda';

    $stmt = $this->connection->prepare($sql);
    $stmt->execute();
    $result = $stmt->fetchAll();

    if (empty($result)) return null;

    return $result;
  }

  public function constroiRelatorio()
  {
    //
  }

  public function getProduct()
  {
    //
  }
}
