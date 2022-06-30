<?php
    require 'src/utils/utils.php';
    
    use utils\UtilsController;

    $utils = new UtilsController();
    $utils->VerificaSession("./src/view/loginView.php");
?>
