package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "dos", urlPatterns = {"/dos"})
public class dos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            int A=0;
            int B=1;
            int Aux;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>dos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos para el fibonaci</h1>");
            out.println("<form action='saldos' method='post'>");
            out.println("<label> Inserte un numero: </label>");
            out.println("<input type='namber' name='longitud'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
