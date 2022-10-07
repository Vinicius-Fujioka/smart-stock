<%-- 
    Document   : index
    Created on : 28/05/2021, 05:24:52
    Author     : Junim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>SmartStock</title>
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
                        <img src="images\caixacaixa_icon.png" alt="logo_inicial" widht="200px" height="200px" data-tilt>
                    </p>
                    <p align="center">
                        <img src="images\caixacaixa_icon.png" alt="logo_inicial" widht="200px" height="200px" data-tilt>
                    </p>
                    <p align="center">
                        <img src="images\caixacaixa_icon.png" alt="logo_inicial" widht="200px" height="200px" data-tilt>
                    </p>



                    <span class="login100-form-title">
                        <font color="black">Bem-vindo ao SmartStock</font>
                    </span>

                    <span class="login100-form-title">
                        <font color="black">Como deseja entrar no sistema ?</font>
                    </span>


                    <div class="container-login100-form-btn">
                        <a href="login-cliente.jsp" class="login100-form-btn">
                            Cliente
                        </a>
                    </div>

                    <div class="container-login100-form-btn">
                        <a href="login-loja.jsp" class="login100-form-btn">
                            Loja
                        </a>
                    </div>
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
