<%-- 
    Document   : cadastro-loja
    Created on : 28/05/2021, 05:36:52
    Author     : Junim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Cadastro Loja</title>
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
                    <form class="login100-form validate-form" method="post" action="CadastrarLoja">
                        <span class="login100-form-title">
                            Área de cadastro LOJA
                        </span>

                        <div>
                            <input class="input100" type="hidden" name="idloja" value="${loja.idloja}">
                            <span class="focus-input100"> </span>

                        </div>


                        <div class="wrap-input100 validate-input" data-validate = "Insira um CNPJ válido!">
                            <input class="input100" type="text" name="cnpj" value="${loja.cnpj}" placeholder="CNPJ">
                            <span class="focus-input100"></span>

                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Insira o tipo do seu comércio!">
                            <input class="input100" type="text" name="tipo" value="${loja.tipo}" placeholder="Categoria do comércio">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira uma breve descrição!">
                            <input class="input100" type="text" name="descricao" value="${loja.descricao}" placeholder="Breve descrição">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira o nome do comércio!">
                            <input class="input100" type="text" name="nome" value="${loja.nome}" placeholder="Nome do comércio">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um email válido!">
                            <input class="input100" type="email" name="email" value="${loja.email}" placeholder="Email">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um endereço válido!">
                            <input class="input100" type="text" name="endereco" value="${loja.endereco}" placeholder="Endereço">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um telefone válido!">
                            <input class="input100" type="text" name="telefone" value="${loja.telefone}" placeholder="Telefone">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira a cidade onde resido seu comércio!">
                            <input class="input100" type="text" name="cidade" value="${loja.cidade}" placeholder="Cidade">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira um login válido!">
                            <input class="input100" type="text" name="login" value="${loja.login}" placeholder="Login">
                            <span class="focus-input100"></span>

                        </div>
                        <div class="wrap-input100 validate-input" data-validate = "Insira uma senha válida!">
                            <input class="input100" type="password" name="senha" value="${loja.senha}" placeholder="Senha">
                            <span class="focus-input100"></span>

                        </div>

                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn" type="submit" value="Cadastrar">
                                Cadastrar
                            </button>
                        </div>
                        <br>
                        


                        <div class="text-center p-t-136">
                            <a class="txt2" href="login-loja.jsp">
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
