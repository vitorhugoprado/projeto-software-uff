<?php

// Beatriz de Freitas Dellatorre - 119083011

namespace interface;


/*
Interface Responsável na parte de pagamentos, que possui a função RealizarVenda
que é usada de diferentes formas de acordo com a forma de pagamento escolhida.
*/
interface Pagamento
{

  /*
  Função que realiza a venda e faz todas as operações necessárias
  de acordo com cada forma de pagamento que vai ser utilizada na venda
  de algum produto escolhido
  */
  public function RealizarVenda();
}
