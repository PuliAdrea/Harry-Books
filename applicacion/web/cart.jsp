<%-- 
    Document   : cart
    Created on : 17/01/2019, 10:32:34 AM
    Author     : user
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>

<%@page import="classes.Producto"%>
<%@page import="controllers.ControladorProducto"%>
<%@page import="classes.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%
     HttpSession sesion = request.getSession(true);
     ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");
%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link href="estilos.css" rel="stylesheet" type="text/css"/>
   <!-- Iconos -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    <title>Carrito de Compras</title>
  </head>
  <body>
    
     <nav class="navbar navbar-light bg-light">
          <a class="navbar-brand" href="shop.jsp">
              
             
            <img src="7729-200.png" width="30" height="30" class="d-inline-block align-top" alt="">
            Harry Books Tienda Online
          </a>
            
        </nav>
      
      
      <div class="p" style="margin: 5% 10% 5% 10%" >
       <h1 class="titulo">Carrito de Compras</h1>
          
                 <table class="table table-condensed" id="shop-table">
					<thead>
						<tr class="cart_menu">
                                                    <td class="description"></td>
							<td class="image">Libros</td>
							<td class="description"></td>
							<td class="price">Precio</td>
							<td class="quantity">Cantidad</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
                                            
                                            
                                                <%
                                                    ControladorProducto cp = new ControladorProducto();
                                                    double total = 0;
                                                    if(articulos != null){
                                                    for(Articulo a: articulos){
                                                        Producto producto = cp.getProducto(a.getIdProducto());
                                                        total += a.getCantidad() * producto.getPrecio();
                                                        
                                                                                                            
                                                %>
                                            
						<tr>
                                                         <td class="cart_delete">
                                                            <span id="idarticulo" style="display: none;"><%= producto.getId()%></span>
                                                            
                                                            <a href="eliminar.jsp?cod=<%= producto.getId()%>">
                                                            <a class="cart_quantity_delete" href="" id="deleteitem"><i class="fa fa-times"></i></a>
                                                            </a>
							</td>
                                                          
							<td class="cart_product">
                                                            <a href=""><img src="<%= producto.getImg()%>" alt="" width="120"></a>
							</td>
							<td class="cart_description">
								<h4><%= producto.getNombre()%></h4>
								
							</td>
							<td class="cart_price">
								<p>$<%= producto.getPrecio()%></p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									
                                                                    <p>   <%= a.getCantidad()%> </p>
									
								</div>
							</td>
							<td >
								<p class="cart_total_price">$<%= Math.round(producto.getPrecio()*a.getCantidad()*100.0) / 100.0%></p>
							</td>
							
						</tr>
                                                
                                                
                                                <%}}%>
                                                
                                                
                                                
                                                
                                                
                                                
                                                

						
					</tbody>
                                                   
				</table>
                                                    <% if (articulos == null){%>
                                                    <h4>No hay Articulos en el carro</h4>
                                                     <%}%>
                                                     <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                  <li class="total"  aria-current="page"> Total a pagar: $ <%=  Math.round(total*100.0)%></li>
                </ol>
          </nav>
                
                <div class="botones">
                                        
                    <button id="cancelar" type="button" class="btn btn-danger btn-lg">Cancelar la compra</button>
                    
                    <button id="aceptar" type="button"  class="b1 btn btn-success btn-lg">Confirmar Compra</button>
                    
                </div>      
      </div>  
           
      
                                                   
                                                
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
   <script src="js/carrito.js" type="text/javascript"></script>
  </body>
</html>
