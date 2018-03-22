/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Parant;
import model.Student;

/**
 *
 * @author lambopunchh
 */
@WebServlet(name = "ParantServlet", urlPatterns = {"/Parant"})
public class ParantServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        
//        String pid = request.getParameter("parantId");
//        HttpSession session = request.getSession(false);
//        if(session!=null && session.getAttribute("user")!=null){
//            Student parants = (Student)session.getAttribute("user");
//            Parant p = new Parant();
//            p.setParantId(Integer.parseInt(pid));
//            System.out.println(p.getParantId()+"d่อนส่ง");
//            p = Parant.getParantStudent(p.getParantId());
////            int index = parants.indexOf(p);
////            p = parants.get(index);
//
//            request.setAttribute("parant", p);
//            
//            
//        }else{}
//        
        
                HttpSession s = request.getSession();
        Student parants = (Student)s.getAttribute("user") ;
        
        String param = request.getParameter("parantId");
        System.out.println(param);
        try {
            int id = Integer.parseInt(param);
            Parant p = Parant.findById(id);
            if (p == null) {
                
            } else {
                System.out.println(p.toString());
                 request.getSession().setAttribute("parants", p);
            }
        } catch (Exception e) {
        }
        getServletContext().getRequestDispatcher("/Parant.jsp").forward(request, response);
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
