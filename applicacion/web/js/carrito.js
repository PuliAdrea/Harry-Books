
/*$(document).ready(function(){
  $("tr #deleteitem").click(function(e){
  
    e.preventDefault();
    var elemento = $(this);
    var idproducto = elemento.parent().find('#idarticulo').text();
    
        $.post('borraritem', {idproducto : idproducto}, 
                function(returnedData){
                console.log(returnedData);
                }, 'json');
    });
});*/
                   
$(document).ready(function(){  
     $("div.botones #cancelar").click(function(){
         
         var c =confirm("¿Decea cancelar la compra?");
        
     });
    });
    

            /* $.post('borraritem', {idproducto : idproducto}, 
                function(returnedData){
                console.log(returnedData);
                }, 'json');*/

            /*$.ajax({    
            url : "/borraritem", 
            method: "POST",   
            data:{idproducto : idproducto},
                              
            success: function(r){
                    alert( "saquese"+r);},
            error: function() {
                        console.log("No se ha podido obtener la información");}
                         
        });*/
              /* elemento.parent().parent().remove();
               var elementostabla = $('#shop-table tr');
               if(elementostabla.length <= 1){
                   $('#cart-container').append("<h4>No hay Articulos en el carro</h4>");
               }
               $('#txt-subtotal').text(r);
               $('#txt-total').text(r);*/
                 

