<%-- 
    Document   : verprodutos-loja
    Created on : 21/06/2021, 00:13:52
    Author     : Junim
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Lista de produtos</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="images/icons/caixa_icon.png" rel="icon">
        <link href="images/icons/caixa_icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">

        <!-- =======================================================
        * Template Name: Selecao - v4.3.0
        * Template URL: https://bootstrapmade.com/selecao-bootstrap-template/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top d-flex align-items-center  header-transparent ">
            <div class="container d-flex align-items-center justify-content-between">

                <div class="logo">
                    <h1><img src="images/caixacaixa_icon.png" alt="caixalogo"/><a href="homepage-loja.jsp">SmartStock</a><img src="images/buscaestoque_icon.png" alt="lupalogo"/></h1>

                    <!-- Uncomment below if you prefer to use an image logo -->
                    <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
                </div>

                <nav id="navbar" class="navbar">
                    <ul>
          <li><a class="nav-link scrollto active" href="ListarLojaLoja">Buscar Lojas</a></li>
          <li><a class="nav-link scrollto active" href="ListarEstoque1?codigo=${idloja}">Estoques</a></li>
          <li><a class="nav-link scrollto active" href="ListarReserva?codigo=${idloja}">Reservas</a></li>
          <li><a class="nav-link scrollto active" href="PuxarIdEstoque?codigo=${sessionScope.idloja}">Cadastrar Produtos</a></li>
          <li class="dropdown"><a href="#"><span>Minha Conta</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="CarregarLoja?codigo=${idloja}">Alterar Dados</a></li>
              <li><a href="ExcluirLoja?codigo=${idloja}">Excluir Conta</a></li>
              <li><a href="index.jsp">Deslogar</a></li>
            </ul>
          </li>
          
        </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex flex-column justify-content-end align-items-center">
            <div id="heroCarousel" data-bs-interval="5000" class="container carousel carousel-fade" data-bs-ride="carousel">

                <!-- Slide 1 -->
                <div class="carousel-item active">
                    <div class="carousel-container">
                        <h2 class="animate__animated animate__fadeInDown">Loja, </h2>
                        <p class="animate__animated fanimate__adeInUp">veja abaixo os produtos do estoque selecionado</p>
                        <p></p>

                    </div>
                </div>

                <a class="carousel-control-prev" href="#heroCarousel" role="button" data-bs-slide="prev">

                </a>

                <a class="carousel-control-next" href="#heroCarousel" role="button" data-bs-slide="next">

                </a>

            </div>

            <svg class="hero-waves" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 24 150 28 " preserveAspectRatio="none">
            <defs>
            <path id="wave-path" d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z">
            </defs>
            <g class="wave1">
            <use xlink:href="#wave-path" x="50" y="3" fill="rgba(255,255,255, .1)">
            </g>
            <g class="wave2">
            <use xlink:href="#wave-path" x="50" y="0" fill="rgba(255,255,255, .2)">
            </g>
            <g class="wave3">
            <use xlink:href="#wave-path" x="50" y="9" fill="#fff">
            </g>
            </svg>

        </section><!-- End Hero -->

        <main id="main">

            <table border="3px" align="center" width="100%" bordercolor="#2f3244">
                <tr>
                    <td bgcolor="#B4B6C5" height="50px"><font color="black" size="5">Nome</font></td>
                    <td bgcolor="#B4B6C5" height="50px"><font color="black" size="5">Quantidade</font></td>
                    <td bgcolor="#B4B6C5" height="50px"><font color="black" size="5">Validade</font></td>
                    <td bgcolor="#B4B6C5" height="50px"><font color="black" size="5">Preco</font></td>
                </tr>
                <c:forEach items="${Produto}" var="produto">
                    <tr>
                        <td height="50px"><font color="black" size="3">${produto.nome}</font></td>
                        <td height="50px"><font color="black" size="3">${produto.quantidade}</font></td>
                        <td height="50px"><font color="black" size="3">${produto.validade}</font></td>
                        <td height="50px"<font color="black" size="3">>${produto.preco}</font></td>
                    </tr>
                </c:forEach>
            </table>

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">
            <div class="container">
                <h3>SmartStock</h3>
                <p>O sistema que facilita a vida das pessoas e mant??m o com??rcio local :)</p>

                <div class="copyright">
                    &copy; Copyright <strong><span>SmartStocks</span></strong>. Todos os direitos reservados
                </div>

            </div>
        </footer><!-- End Footer -->

        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/aos/aos.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>
        <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>

</html>
