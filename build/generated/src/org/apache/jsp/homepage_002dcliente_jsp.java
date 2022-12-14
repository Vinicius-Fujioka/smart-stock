package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_002dcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Página Inicial</title>\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"images/icons/caixa_icon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"images/icons/caixa_icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("  * Template Name: Selecao - v4.3.0\n");
      out.write("  * Template URL: https://bootstrapmade.com/selecao-bootstrap-template/\n");
      out.write("  * Author: BootstrapMade.com\n");
      out.write("  * License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================== -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"fixed-top d-flex align-items-center  header-transparent \">\n");
      out.write("    <div class=\"container d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><img src=\"images/caixacaixa_icon.png\" alt=\"caixalogo\"/><a href=\"homepage-cliente.jsp\">SmartStock</a><img src=\"images/buscaestoque_icon.png\" alt=\"lupalogo\"/></h1>\n");
      out.write("        \n");
      out.write("        <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("        <!-- <a href=\"index.html\"><img src=\"assets/img/logo.png\" alt=\"\" class=\"img-fluid\"></a>-->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"#\">Buscar Lojas</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#about\">Sobre nós</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#pricing\">Assinaturas</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#team\">Equipe</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#contact\">Suporte</a></li>\n");
      out.write("          <li class=\"dropdown\"><a href=\"#\"><span>Minha Conta</span> <i class=\"bi bi-chevron-down\"></i></a>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">Alterar Dados</a></li>\n");
      out.write("              <li><a href=\"#\">Excluir Conta</a></li>\n");
      out.write("              <li><a href=\"#\">Deslogar</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </header><!-- End Header -->\n");
      out.write("\n");
      out.write("  <!-- ======= Hero Section ======= -->\n");
      out.write("  <section id=\"hero\" class=\"d-flex flex-column justify-content-end align-items-center\">\n");
      out.write("    <div id=\"heroCarousel\" data-bs-interval=\"5000\" class=\"container carousel carousel-fade\" data-bs-ride=\"carousel\">\n");
      out.write("\n");
      out.write("      <!-- Slide 1 -->\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("        <div class=\"carousel-container\">\n");
      out.write("          <h2 class=\"animate__animated animate__fadeInDown\">Cliente, bem-vindo ao <span>SmartStock</span></h2>\n");
      out.write("          <p class=\"animate__animated fanimate__adeInUp\">Desfrute de sua busca por produtos nas lojas locais e também\n");
      out.write("              reserve um tempo para nos conhecer através dos tópicos abaixo. </p>\n");
      out.write("          <p>Qualquer problema com o uso do site, por favor nos contate que resolveremos no menor tempo possível</p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("        \n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("        \n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <svg class=\"hero-waves\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 24 150 28 \" preserveAspectRatio=\"none\">\n");
      out.write("      <defs>\n");
      out.write("        <path id=\"wave-path\" d=\"M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z\">\n");
      out.write("      </defs>\n");
      out.write("      <g class=\"wave1\">\n");
      out.write("        <use xlink:href=\"#wave-path\" x=\"50\" y=\"3\" fill=\"rgba(255,255,255, .1)\">\n");
      out.write("      </g>\n");
      out.write("      <g class=\"wave2\">\n");
      out.write("        <use xlink:href=\"#wave-path\" x=\"50\" y=\"0\" fill=\"rgba(255,255,255, .2)\">\n");
      out.write("      </g>\n");
      out.write("      <g class=\"wave3\">\n");
      out.write("        <use xlink:href=\"#wave-path\" x=\"50\" y=\"9\" fill=\"#fff\">\n");
      out.write("      </g>\n");
      out.write("    </svg>\n");
      out.write("\n");
      out.write("  </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("  <main id=\"main\">\n");
      out.write("\n");
      out.write("    <!-- ======= About Section ======= -->\n");
      out.write("    <section id=\"about\" class=\"about\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\" data-aos=\"zoom-out\">\n");
      out.write("          <h2>Sore nós</h2>\n");
      out.write("          <p>Quem somos ?</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row content\" data-aos=\"fade-up\">\n");
      out.write("          <div class=\"col-lg-6\">\n");
      out.write("            <p>\n");
      out.write("              Somos uma equipe de estudantes que busca através das novas tecnologias ajudas as pessoas a economizar\n");
      out.write("              tempo em suas buscas de produtos no comércio local. E nossa principal ferramenta é esse website que\n");
      out.write("              possibilita as pessoas a:\n");
      out.write("            </p>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i> Checar os estoques das lojas locais para procurar produtos</li>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i> Facilmente ter acesso a informações de contato da lojas</li>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i> Utilizar da ferramenta \"reserva\" para avisar a loja sobre seu\n");
      out.write("              interesse no produto</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 pt-4 pt-lg-0\">\n");
      out.write("            <p>\n");
      out.write("              Como entusiastas das ferramentas que a tecnlogia nos proporciona, buscamos cada dia mais melhorar para\n");
      out.write("              proporcionar aos nossos usuários uma melhor experiência, então estamos totalmente abertos a criticas\n");
      out.write("              e sugestões, o contato com nossa equipe é facilmente feito através do formulário de contato na seção\n");
      out.write("              \"Suporte\", experimente já!\n");
      out.write("            </p>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End About Section -->\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- ======= Pricing Section ======= -->\n");
      out.write("    <section id=\"pricing\" class=\"pricing\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\" data-aos=\"zoom-out\">\n");
      out.write("          <h2>Assinauras</h2>\n");
      out.write("          <p>Nossas assinaturas e seus valores</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6\">\n");
      out.write("            <div class=\"box\" data-aos=\"zoom-in\">\n");
      out.write("              <h3>Grátis</h3>\n");
      out.write("              <h4><sup>R$</sup>0<span> / mês</span></h4>\n");
      out.write("              <ul>\n");
      out.write("                <li>Acesso ilimitado as informações de contato das lojas</li>\n");
      out.write("                <li>5 checagens de estoque por semana</li>\n");
      out.write("                <li>2 reservas por semana</li>\n");
      out.write("              </ul>\n");
      out.write("              <div class=\"btn-wrap\">\n");
      out.write("                <a class=\"btn-buy\">Já possui</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 mt-4 mt-lg-0\">\n");
      out.write("            <div class=\"box\" data-aos=\"zoom-in\" data-aos-delay=\"200\">\n");
      out.write("              <h3>Mensal</h3>\n");
      out.write("              <h4><sup>R$</sup>$$<span> / mês</span></h4>\n");
      out.write("              <ul>\n");
      out.write("                <li>Acesso ilimitado as informações de contato das lojas</li>\n");
      out.write("                <li>Checagens de estoque ilimitadas</li>\n");
      out.write("                <li>Reservas ilimitadas</li>\n");
      out.write("                <li>Preferência no contato com nossa equipe</li>\n");
      out.write("              </ul>\n");
      out.write("              <div class=\"btn-wrap\">\n");
      out.write("                <a href=\"#\" class=\"btn-buy\">Adquirir</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 mt-4 mt-lg-0\">\n");
      out.write("            <div class=\"box\" data-aos=\"zoom-in\" data-aos-delay=\"300\">\n");
      out.write("              <span class=\"advanced\">Recomendada</span>\n");
      out.write("              <h3>Anual</h3>\n");
      out.write("              <h4><sup>R$</sup>$$<span> / ano</span></h4>\n");
      out.write("              <ul>\n");
      out.write("                <li>Acesso ilimitado as informações de contato das lojas</li>\n");
      out.write("                <li>Checagens de estoque ilimitadas</li>\n");
      out.write("                <li>Reservas ilimitadas</li>\n");
      out.write("                <li>Preferência no contato com nossa equipe</li>\n");
      out.write("                <li>Acesso a ára de desconta nas lojas cadastradas</li>\n");
      out.write("              </ul>\n");
      out.write("              <div class=\"btn-wrap\">\n");
      out.write("                <a href=\"#\" class=\"btn-buy\">Adquirir</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Pricing Section -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- ======= Team Section ======= -->\n");
      out.write("    <section id=\"team\" class=\"team\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\" data-aos=\"zoom-out\">\n");
      out.write("          <h2>Equipe</h2>\n");
      out.write("          <p>Nossa equipe SmartStock</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 d-flex align-items-stretch\">\n");
      out.write("            <div class=\"member\" data-aos=\"fade-up\">\n");
      out.write("              <div class=\"member-img\">\n");
      out.write("                <img src=\"images/foto-eros.jpeg\" class=\"img-fluid\" alt=\"Eros\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-twitter\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"member-info\">\n");
      out.write("                <h4>Éros de Assis</h4>\n");
      out.write("                <span>Administrador & Chefe da Documentação</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 d-flex align-items-stretch\">\n");
      out.write("            <div class=\"member\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("              <div class=\"member-img\">\n");
      out.write("                <img src=\"images/foto-murillo.jpg\" class=\"img-fluid\" alt=\"Murillo\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-twitter\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"member-info\">\n");
      out.write("                <h4>Murillo Teixeira</h4>\n");
      out.write("                <span>Administrador & Chefe da Documentação </span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 d-flex align-items-stretch\">\n");
      out.write("            <div class=\"member\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("              <div class=\"member-img\">\n");
      out.write("                <img src=\"images/foto-celso.jpg\" class=\"img-fluid\" alt=\"Celso\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-twitter\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"member-info\">\n");
      out.write("                <h4>Paulo Celso / Junim</h4>\n");
      out.write("                <span>Programador Front-End</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 d-flex align-items-stretch\">\n");
      out.write("            <div class=\"member\" data-aos=\"fade-up\" data-aos-delay=\"300\">\n");
      out.write("              <div class=\"member-img\">\n");
      out.write("                <img src=\"images/foto-iutaka.jpg\" class=\"img-fluid\" alt=\"Iutaka\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-twitter\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("                  <a href=\"\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"member-info\">\n");
      out.write("                <h4>Vinicius Iutaka</h4>\n");
      out.write("                <span>Programador Back-End</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Team Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Contact Section ======= -->\n");
      out.write("    <section id=\"contact\" class=\"contact\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\" data-aos=\"zoom-out\">\n");
      out.write("          <h2>Suporte</h2>\n");
      out.write("          <p>Entre em contato com nosso suporte:</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row mt-5\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4\" data-aos=\"fade-right\">\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <div class=\"address\">\n");
      out.write("                <i class=\"bi bi-geo-alt\"></i>\n");
      out.write("                <h4>Endereço</h4>\n");
      out.write("                <p>Centro, Fernandópolis-SP</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"email\">\n");
      out.write("                <i class=\"bi bi-envelope\"></i>\n");
      out.write("                <h4>Email:</h4>\n");
      out.write("                <p>supSmartStock@outlook.com</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"phone\">\n");
      out.write("                <i class=\"bi bi-phone\"></i>\n");
      out.write("                <h4>Telefone:</h4>\n");
      out.write("                <p>+55 (17) 1122-3344</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-8 mt-5 mt-lg-0\" data-aos=\"fade-left\">\n");
      out.write("\n");
      out.write("            <form action=\"\" method=\"post\" role=\"form\" class=\"php-email-form\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 form-group\">\n");
      out.write("                  <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Seu Nome\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 form-group mt-3 mt-md-0\">\n");
      out.write("                  <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Seu Email\" required>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group mt-3\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" placeholder=\"Assunto\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group mt-3\">\n");
      out.write("                <textarea class=\"form-control\" name=\"message\" rows=\"5\" placeholder=\"Mensagem\" required></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"my-3\">\n");
      out.write("                <div class=\"loading\">Loading</div>\n");
      out.write("                <div class=\"error-message\"></div>\n");
      out.write("                <div class=\"sent-message\">Your message has been sent. Thank you!</div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Contact Section -->\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h3>SmartStock</h3>\n");
      out.write("      <p>O sistema que facilita a vida das pessoas e mantém o comércio local :)</p>\n");
      out.write("      \n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong><span>SmartStocks</span></strong>. Todos os direitos reservados\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </footer><!-- End Footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"assets/vendor/aos/aos.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
