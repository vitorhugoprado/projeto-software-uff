<?php 
    namespace loginController;

    if(empty($_POST["inputCpf"]) || empty($_POST["inputSenha"])) {
        header('Location: ../view/loginView.php?error=true');
        return;
    }

    $cpf = $_POST["inputCpf"];
    $senha = $_POST["inputSenha"];

    class LoginController {
        public function Logar(){

        }
    }


?>
loginController
