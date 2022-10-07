<%-- 
    Document   : cadastro-cliente
    Created on : 28/05/2021, 05:36:35
    Author     : Junim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Cadastro Cliente</title>
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

                    <p align="center">
                    <form class="login100-form validate-form" method="post" action="CadastrarCliente">
                        <span class="login100-form-title">
                            Área de cadastro CLIENTE
                        </span>

                        <div>
                            <input class="input100" type="hidden" name="idcliente" value="${cliente.idcliente}">
                            
                        </div>


                        <div class="wrap-input100 validate-input" data-validate = "Insira um CPF válido!">
                            <input class="input100" type="text" name="cpf" value="${cliente.cpf}" placeholder="CPF">
                            <span class="focus-input100"></span>

                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Insira um nome válido!">
                            <input class="input100" type="text" name="nome" value="${cliente.nome}" placeholder="Nome">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um email válido!">
                            <input class="input100" type="email" name="email" value="${cliente.email}" placeholder="Email">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um endereço válido!">
                            <input class="input100" type="text" name="endereco" value="${cliente.endereco}" placeholder="Endereço">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um telefone válido!">
                            <input class="input100" type="text" name="telefone" value="${cliente.telefone}" placeholder="Telefone">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "insira um login válido!">
                            <input class="input100" type="text" name="login" value="${cliente.login}" placeholder="Login">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um senha válida!">
                            <input class="input100" type="password" name="senha" value="${cliente.senha}" placeholder="Senha">
                            <span class="focus-input100"></span>

                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn" value="Cadastrar">
                                Cadastrar
                            </button>
                        </div>
                        <br>
                        


                        <div class="text-center p-t-136">
                            <a class="txt2" href="login-cliente.jsp">
                                <i class="fa fa-long-arrow-left m-l-5" aria-hidden="true"></i>
                                Voltar
                            </a>
                        </div>

                    </form>
                    </p>
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
