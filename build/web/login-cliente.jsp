<%-- 
    Document   : login-cliente
    Created on : 28/05/2021, 05:27:54
    Author     : Junim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/caixa_icon.png"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-pic js-tilt" data-tilt>
                        <img src="images/logo_smartstock_escrita.png" alt="IMG">
                    </div>

                    <form class="login100-form validate-form" method="post" action="LoginCliente">
                        <span class="login100-form-title">
                            Área de login CLIENTE
                        </span>

                        <div class="wrap-input100 validate-input" data-validate = "Preencha com um login válido!">
                            <input class="input100" type="text" name="login" placeholder="Login">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Preencha com uma senha válida!">
                            <input class="input100" type="password" name="senha" placeholder="Senha">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn" type="submit" value="Entrar">
                                Login
                            </button>
                        </div>
                        
                        <br>
                        ${mensagem}
                        
                        <div class="text-center p-t-12">
                            <span class="txt1">
                                Esqueceu o
                            </span>
                            <a class="txt2" href="#">
                                Usuário / Senha?
                            </a>
                        </div>

                        <div class="text-center p-t-136">
                            <a class="txt2" href="cadastro-cliente.jsp">
                                Cadastre-se agora
                                <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                            </a>
                            <br>
                            <a class="txt2" href="index.jsp">
                                <i class="fa fa-long-arrow-left m-l-5" aria-hidden="true"></i>
                                Voltar
                            </a>
                        </div>

                    </form>
                </div>
            </div>
        </div>
                        




        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/tilt/tilt.jquery.min.js"></script>
        <script >
            $('.js-tilt').tilt({
                scale: 1.1
            })
        </script>
        <!--===============================================================================================-->
        <script src="js/mainIndex.js"></script>

    </body>
</html>
