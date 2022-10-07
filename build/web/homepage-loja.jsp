<%-- 
    Document   : homepage-loja
    Created on : 18/06/2021, 01:10:42
    Author     : Junim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Página Inicial</title>
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
          <li><a class="nav-link scrollto" href="#about">Sobre nós</a></li>
          <li><a class="nav-link scrollto" href="#pricing">Assinaturas</a></li>
          <li><a class="nav-link scrollto" href="#team">Equipe</a></li>
          <li><a class="nav-link scrollto" href="#contact">Suporte</a></li>
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
          <h2 class="animate__animated animate__fadeInDown">Loja, bem-vinda ao <span>SmartStock</span></h2>
          <p class="animate__animated fanimate__adeInUp">Desfrute de sua busca por produtos, reservas, gerenciamento de estoques e também
              reserve um tempo para nos conhecer através dos tópicos abaixo. </p>
          <p>Qualquer problema com o uso do site, por favor nos contate que resolveremos no menor tempo possível</p>
          
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

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container">

        <div class="section-title" data-aos="zoom-out">
          <h2>Sobre nós</h2>
          <p>Quem somos ?</p>
        </div>

        <div class="row content" data-aos="fade-up">
          <div class="col-lg-6">
            <p>
              Somos uma equipe de estudantes que busca através das novas tecnologias ajudas as pessoas a economizar
              tempo em suas buscas de produtos no comércio local. E nossa principal ferramenta é esse website que
              possibilita as pessoas a:
            </p>
            <ul>
              <li><i class="ri-check-double-line"></i> Checar os estoques das lojas locais para procurar produtos</li>
              <li><i class="ri-check-double-line"></i> Facilmente ter acesso a informações de contato da lojas</li>
              <li><i class="ri-check-double-line"></i> Utilizar da ferramenta "reserva" para avisar a loja sobre seu
              interesse no produto</li>
            </ul>
          </div>
          <div class="col-lg-6 pt-4 pt-lg-0">
            <p>
              Como entusiastas das ferramentas que a tecnlogia nos proporciona, buscamos cada dia mais melhorar para
              proporcionar aos nossos usuários uma melhor experiência, então estamos totalmente abertos a criticas
              e sugestões, o contato com nossa equipe é facilmente feito através do formulário de contato na seção
              "Suporte", experimente já!
            </p>
           
          </div>
        </div>

      </div>
    </section><!-- End About Section -->

   
    <!-- ======= Pricing Section ======= -->
    <section id="pricing" class="pricing">
      <div class="container">

        <div class="section-title" data-aos="zoom-out">
          <h2>Assinaturas</h2>
          <p>Nossas assinaturas e seus valores</p>
        </div>

        <div class="row">

          <div class="col-lg-3 col-md-6">
            <div class="box" data-aos="zoom-in">
              <h3>Grátis</h3>
              <h4><sup>R$</sup>0<span> / mês</span></h4>
              <ul>
                <li>Acesso ilimitado as informações de contato das lojas</li>
                <li>5 checagens de estoque por semana</li>
                <li>Cadastro de 1 estoque</li>
                <li>Sistema simples de reservas</li>
              </ul>
              <div class="btn-wrap">
                <a class="btn-buy">Já possui</a>
              </div>
            </div>
          </div>


          <div class="col-lg-3 col-md-6 mt-4 mt-lg-0">
            <div class="box" data-aos="zoom-in" data-aos-delay="200">
              <h3>Mensal</h3>
              <h4><sup>R$</sup>$$<span> / mês</span></h4>
              <ul>
                <li>Acesso ilimitado as informações de contato das lojas</li>
                <li>Checagens de estoque ilimitadas</li>
                <li>Cadastro de até 5 estques</li>
                <li>Sistema avançado de reservas</li>
                <li>Preferência no contato com nossa equipe</li>
              </ul>
              <div class="btn-wrap">
                <a href="#" class="btn-buy">Adquirir</a>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 mt-4 mt-lg-0">
            <div class="box" data-aos="zoom-in" data-aos-delay="300">
              <span class="advanced">Recomendada</span>
              <h3>Anual</h3>
              <h4><sup>R$</sup>$$<span> / ano</span></h4>
              <ul>
                <li>Acesso ilimitado as informações de contato das lojas</li>
                <li>Checagens de estoque ilimitadas</li>
                <li>Cadastro de estoques ilimitados</li>
                <li>Sistema avançado de reservas</li>
                <li>Preferência no contato com nossa equipe</li>
                <li>Acesso a área de descontos das lojas cadastradas</li>
              </ul>
              <div class="btn-wrap">
                <a href="#" class="btn-buy">Adquirir</a>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Pricing Section -->

    
    <!-- ======= Team Section ======= -->
    <section id="team" class="team">
      <div class="container">

        <div class="section-title" data-aos="zoom-out">
          <h2>Equipe</h2>
          <p>Nossa equipe SmartStock</p>
        </div>

        <div class="row">

          <div class="col-lg-3 col-md-6 d-flex align-items-stretch">
            <div class="member" data-aos="fade-up">
              <div class="member-img">
                <img src="images/foto-eros-eqp.jpg" class="img-fluid" alt="Eros">
                <div class="social">
                  <a href=""><i class="bi bi-twitter"></i></a>
                  <a href=""><i class="bi bi-facebook"></i></a>
                  <a href=""><i class="bi bi-instagram"></i></a>
                  <a href=""><i class="bi bi-linkedin"></i></a>
                </div>
              </div>
              <div class="member-info">
                <h4>Éros de Assis</h4>
                <span>Administrador & Chefe da Documentação</span>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 d-flex align-items-stretch">
            <div class="member" data-aos="fade-up" data-aos-delay="100">
              <div class="member-img">
                <img src="images/foto-murillo-eqp.jpg" class="img-fluid" alt="Murillo">
                <div class="social">
                  <a href=""><i class="bi bi-twitter"></i></a>
                  <a href=""><i class="bi bi-facebook"></i></a>
                  <a href=""><i class="bi bi-instagram"></i></a>
                  <a href=""><i class="bi bi-linkedin"></i></a>
                </div>
              </div>
              <div class="member-info">
                <h4>Murillo Teixeira</h4>
                <span>Administrador & Chefe da Documentação </span>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 d-flex align-items-stretch">
            <div class="member" data-aos="fade-up" data-aos-delay="200">
              <div class="member-img">
                <img src="images/foto-celso-eqp.jpg" class="img-fluid" alt="Celso">
                <div class="social">
                  <a href=""><i class="bi bi-twitter"></i></a>
                  <a href=""><i class="bi bi-facebook"></i></a>
                  <a href=""><i class="bi bi-instagram"></i></a>
                  <a href=""><i class="bi bi-linkedin"></i></a>
                </div>
              </div>
              <div class="member-info">
                <h4>Paulo Celso / Junim</h4>
                <span>Programador Front-End</span>
              </div>
            </div>
          </div>

          <div class="col-lg-3 col-md-6 d-flex align-items-stretch">
            <div class="member" data-aos="fade-up" data-aos-delay="300">
              <div class="member-img">
                <img src="images/foto-iutaka-eqp.jpg" class="img-fluid" alt="Iutaka">
                <div class="social">
                  <a href=""><i class="bi bi-twitter"></i></a>
                  <a href=""><i class="bi bi-facebook"></i></a>
                  <a href=""><i class="bi bi-instagram"></i></a>
                  <a href=""><i class="bi bi-linkedin"></i></a>
                </div>
              </div>
              <div class="member-info">
                <h4>Vinicius Iutaka</h4>
                <span>Programador Back-End</span>
              </div>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Team Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
      <div class="container">

        <div class="section-title" data-aos="zoom-out">
          <h2>Suporte</h2>
          <p>Entre em contato com nosso suporte:</p>
        </div>

        <div class="row mt-5">

          <div class="col-lg-4" data-aos="fade-right">
            <div class="info">
              <div class="address">
                <i class="bi bi-geo-alt"></i>
                <h4>Endereço</h4>
                <p>Centro, Fernandópolis-SP</p>
              </div>

              <div class="email">
                <i class="bi bi-envelope"></i>
                <h4>Email:</h4>
                <p>supSmartStock@outlook.com</p>
              </div>

              <div class="phone">
                <i class="bi bi-phone"></i>
                <h4>Telefone:</h4>
                <p>+55 (17) 1122-3344</p>
              </div>

            </div>

          </div>

          <div class="col-lg-8 mt-5 mt-lg-0" data-aos="fade-left">

            <form action="" method="post" role="form" class="php-email-form">
              <div class="row">
                <div class="col-md-6 form-group">
                  <input type="text" name="name" class="form-control" id="name" placeholder="Seu Nome" required>
                </div>
                <div class="col-md-6 form-group mt-3 mt-md-0">
                  <input type="email" class="form-control" name="email" id="email" placeholder="Seu Email" required>
                </div>
              </div>
              <div class="form-group mt-3">
                <input type="text" class="form-control" name="subject" id="subject" placeholder="Assunto" required>
              </div>
              <div class="form-group mt-3">
                <textarea class="form-control" name="message" rows="5" placeholder="Mensagem" required></textarea>
              </div>
              <div class="my-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">Your message has been sent. Thank you!</div>
              </div>
              <div class="text-center"><button type="submit">Send Message</button></div>
            </form>

          </div>

        </div>

      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <h3>SmartStock</h3>
      <p>O sistema que facilita a vida das pessoas e mantém o comércio local :)</p>
      
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
