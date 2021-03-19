package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salcuatro", urlPatterns = {"/salcuatro"})
public class salcuatro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int boliviano = Integer.parseInt(request.getParameter("boliviano"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");            
            double D = 6.9;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet salcuatro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos </h1>");
            out.println("<p>El cambio en Bolivianos es:</p>");
            out.println(boliviano*D);
            out.println("<p>El cambio en Dolares es:</p>");
            out.println(boliviano/D);
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='cuatro'>Volver al inicio</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>Volver a los ejercicios</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
