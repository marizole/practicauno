package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cinco", urlPatterns = {"/cinco"})
public class cinco extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>cinco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos para las operaciones aritmeticas</h1>");
            out.println("<form action='salcinco' method='post'>");
            out.println("<label> Inserte un numero: </label>");
            out.println("<input type='namber' name='numa'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label> Inserte un numero: </label>");
            out.println("<input type='namber' name='numb'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
