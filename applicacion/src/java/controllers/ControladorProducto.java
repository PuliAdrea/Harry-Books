package controllers;

import classes.Producto;
import models.ModeloProducto;


public class ControladorProducto {
    public String getProductos(){
        ModeloProducto mp = new ModeloProducto();
        String htmlcode = "";
        for(Producto producto : mp.getAllProductos()){
            htmlcode += "<div class=\"card\">\n" +
"              <div class=\"card-header\">\n" +
"                  Destacado\n" +
"                </div>\n" +
"                <div class=\"card-body\" >\n" +
"                    <img src=\""+producto.getImg()+"\"  class=\"ima\" alt=\"...\" >\n" +
"                    <div  class=\"contenedor\" > \n" +
"                         <h4 class=\"card-title\">"+producto.getNombre()+"</h4>\n" +
"                       \n" +
"                        <h5 class=\"card-title\">Cantidad Disponible :"+producto.getStock()+"</h5>\n" +
"                        <h4 class=\"card-title\">Precio: $"+producto.getPrecio()+"</h4>\n" +
"\n" +
"                       <form class=\"formulario\" action=\"agregarproducto\" method=\"post\">\n" +
"                       <input type=\"hidden\" value="+ producto.getId()+" name=\"idproducto\">"+                    
"                            <label>Agregar al carrito:</label>  <input type=\"number\" value=\"1\" min=\"0\" max=\"15\" id=\"txt-cantidad\" name=\"cantidad\" >\n" +
"                        \n" +
"                            <button type=\"submit\" class=\"btn btn-primary\" href=\"#\" align=\"right\">\n" +
"                                <i class=\"fa fa-shopping-cart\"></i>\n" +
"                                Agregar\n" +
"                            </button>\n" +
"                        </form> "+
"                       \n" +
"                   </div>\n" +
"                </div>\n" +
"    </div>";
        }        
        return htmlcode;        
    }
    
    
    public Producto getProducto(int id){
        return new ModeloProducto().getProducto(id);
    }
}
