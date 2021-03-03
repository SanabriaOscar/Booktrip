package servlet;

import controlador.municipiosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.actividades;
import modelo.municipios;

/**
 *
 * @author 57321
 */
@WebServlet(name = "controllerMunicipio", urlPatterns = {"/controllerMunicipio"})
public class controllerMunicipio extends HttpServlet {

    municipios p = new municipios();
    municipiosDAO dao = new municipiosDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        switch (accion) {

            case "Listar":
                List<municipios> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Dashboard/listaMunicipios.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("vista/Dashboard/listaMunicipios.jsp").forward(request, response);
                break;
            case "Guardar":
                int departamento = Integer.parseInt(request.getParameter("txtDepartamento"));

                String nombre = request.getParameter("txtNombre");

                p.setIdDepartamento(departamento);
                p.setNombre(nombre);
                dao.agregar(p);
                request.getRequestDispatcher("controllerMunicipio?accion=Listar").forward(request, response);
                break;
            case "Editar":
                
                int ide = Integer.parseInt(request.getParameter("id"));
                municipios res = dao.listarId(ide);
                request.setAttribute("dato", res);
                request.getRequestDispatcher("vista/Dashboard/municipio/edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                
                int id = Integer.parseInt(request.getParameter("id"));
                int departamento1 = Integer.parseInt(request.getParameter("txtDepartamento"));
                String nombre1 = request.getParameter("txtNombre");

                p.setIdMunicipio(id);
                p.setIdMunicipio(departamento1);
                p.setNombre(nombre1);

                dao.update(p);
                request.getRequestDispatcher("controllerMunicipio?accion=Listar").forward(request, response);
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerMunicipio?accion=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerMunicipio?accion=Listar").forward(request, response);
                ;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
