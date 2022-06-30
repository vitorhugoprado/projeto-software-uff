<?php
    namespace utils;

    class UtilsController {
        public function VerificaSession($redirecionarPara) {
            $logado = $_SESSION['login'];
            if($logado === "gerente"){
                header('Location: ./src/view/GerenteView.php');
                return;
            }
            if($logado === "atendente"){
                header('Location: ./src/view/AtendenteView.php');
                return;
            }
            header('Location: ' . $redirecionarPara);
            return;
        }
    }
?>