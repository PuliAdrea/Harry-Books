package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import classes.Producto;
import controllers.ControladorProducto;
import classes.Articulo;
import java.util.ArrayList;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     HttpSession sesion = request.getSession(true);
     ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <!-- Iconos -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Carrito de Compras</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("     <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"shop.jsp\">\n");
      out.write("              \n");
      out.write("             \n");
      out.write("            <img src=\"7729-200.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n");
      out.write("            Harry Books Tienda Online\n");
      out.write("          </a>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div class=\"p\" style=\"margin: 5% 10% 5% 10%\" >\n");
      out.write("       <h1 class=\"titulo\">Carrito de Compras</h1>\n");
      out.write("          \n");
      out.write("                 <table class=\"table table-condensed\" id=\"shop-table\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr class=\"cart_menu\">\n");
      out.write("                                                    <td class=\"description\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"image\">Libros</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"description\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"price\">Precio</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"quantity\">Cantidad</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"total\">Total</td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                ");

                                                    ControladorProducto cp = new ControladorProducto();
                                                    double total = 0;
                                                    if(articulos != null){
                                                    for(Articulo a: articulos){
                                                        Producto producto = cp.getProducto(a.getIdProducto());
                                                        total += a.getCantidad() * producto.getPrecio();
                                                        
                                                                                                            
                                                
      out.write("\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("                                                         <td class=\"cart_delete\">\n");
      out.write("                                                            <span id=\"idarticulo\" style=\"display: none;\">");
      out.print( producto.getId());
      out.write("</span>\n");
      out.write("                                                            <a href=\"eliminar.jsp?cod=");
      out.print( producto.getId());
      out.write("\">\n");
      out.write("                                                            <a class=\"cart_quantity_delete\" href=\"\" id=\"deleteitem\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                                            </a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("                                                          \n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
      out.write("                                                            <a href=\"\"><img src=\"");
      out.print( producto.getImg());
      out.write("\" alt=\"\" width=\"120\"></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4><a href=\"\">");
      out.print( producto.getNombre());
      out.write("</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>$");
      out.print( producto.getPrecio());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_quantity_button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <p>   ");
      out.print( a.getCantidad());
      out.write(" </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">$");
      out.print( Math.round(producto.getPrecio()*a.getCantidad()*100.0) / 100.0);
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                ");
}}
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("                                                   \n");
      out.write("\t\t\t\t</table>\n");
      out.write("                                                    ");
 if (articulos == null){
      out.write("\n");
      out.write("                                                    <h4>No hay Articulos en el carro</h4>\n");
      out.write("                                                     ");
}
      out.write("\n");
      out.write("                                                     <nav aria-label=\"breadcrumb\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                  <li class=\"total\"  aria-current=\"page\"> Total a pagar: $ ");
      out.print(  Math.round(total*100.0));
      out.write("</li>\n");
      out.write("                </ol>\n");
      out.write("          </nav>\n");
      out.write("                \n");
      out.write("                <div class=\"botones\">\n");
      out.write("                                        \n");
      out.write("                    <button id=\"cancelar\" type=\"button\" class=\"btn btn-danger btn-lg\">Cancelar la compra</button>\n");
      out.write("                    \n");
      out.write("                    <button id=\"aceptar\" type=\"button\"  class=\"b1 btn btn-success btn-lg\">Confirmar Compra</button>\n");
      out.write("                    \n");
      out.write("                </div>      \n");
      out.write("      </div>  \n");
      out.write("           \n");
      out.write("      \n");
      out.write("                                                   \n");
      out.write("                                                \n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\" integrity=\"sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\" integrity=\"sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k\" crossorigin=\"anonymous\"></script>\n");
      out.write("   <script src=\"js/carrito.js\" type=\"text/javascript\"></script>\n");
      out.write("  </body>\n");
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
