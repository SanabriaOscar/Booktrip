package org.apache.jsp.vista.Dashboard.usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.rol;
import controlador.rolDAO;
import modelo.tipoDocumentos;
import controlador.tipoDocumentosDAO;
import modelo.usuario;
import controlador.usuarioDao;
import modelo.estados;
import controlador.estadosDAO;
import java.sql.ResultSet;
import modelo.inmuebles;
import java.util.ArrayList;
import controlador.inmueblesDAO;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilosBooktrip.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"fondo-estado container my-10\" style=\"background: #4d80e4\">\n");
      out.write("             <div class=\"container  col-md-6 mt-5 bg-light\">\n");
      out.write("        <h3>Agregar Nuevo usuario</h3>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"/booktripO/controllerUsuario\" method=\"POST\">\n");
      out.write("         \n");
      out.write("\n");
      out.write("            \n");
      out.write("          \n");
      out.write("                    <label>id tipo</label>\n");
      out.write("                   \n");
      out.write("                     <div class=\"col-sm-6\">\n");
      out.write("               \n");
      out.write("                        ");

                            tipoDocumentosDAO UDAO = new tipoDocumentosDAO();
                            ArrayList<tipoDocumentos>  listaU = UDAO.ConsultarListadoTipos("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtTipoDocumento\">\n");
      out.write("                            ");

                        for (tipoDocumentos i : listaU) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdTipoDocumento());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                         <div class=\"col-sm-6\">     \n");
      out.write("                    <label>numero</label>\n");
      out.write("                    <input type=\"text\" name=\"txtNumDocu\">\n");
      out.write("                      </div>\n");
      out.write("                    \n");
      out.write("                      <label>id rol</label>\n");
      out.write("                      <div class=\"col-sm-6\">\n");
      out.write("               \n");
      out.write("                        ");

                            rolDAO RDAO = new rolDAO();
                            ArrayList<rol>  listaR = RDAO.ConsultarListadoRoles("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtRol\">\n");
      out.write("                            ");

                        for (rol i : listaR) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdRol());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>nombre</label>\n");
      out.write("                    <input type=\"text\" name=\"txtNombre\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>apellido</label>\n");
      out.write("                    <input type=\"text\" name=\"txtApellido\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>direcion</label>\n");
      out.write("                    <input type=\"text\" name=\"txtDirecion\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>Telefono</label>\n");
      out.write("                    <input type=\"text\" name=\"txtTelefono\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>fecha</label>\n");
      out.write("                    <input type=\"text\" name=\"txtFecha\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>email</label>\n");
      out.write("                    <input type=\"text\" name=\"txtEmail\">\n");
      out.write("                      </div>\n");
      out.write("                          \n");
      out.write("                       <div class=\"col-sm-6\">     \n");
      out.write("                    <label>contraseña</label>\n");
      out.write("                    <input type=\"text\" name=\"txtPassword\">\n");
      out.write("                      </div>\n");
      out.write("<div>  \n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Guardar\" class=\"btn-primary btn-block\">\n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn-danger btn-block\">\n");
      out.write("                       </div>\n");
      out.write("                </form>\n");
      out.write("                           </div>\n");
      out.write("                             </div>\n");
      out.write("            </center>\n");
      out.write("                          <script src=\"../js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"../js/validaciones.js\"</script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("   \n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
