<?php

define("PATH", __DIR__);

require 'src/utils/php/utils.php';

use utils\UtilsController;

$utils = new UtilsController();
$utils->VerificaSession("./src/view/loginView.php");
