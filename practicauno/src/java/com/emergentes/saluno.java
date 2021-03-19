package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "saluno", urlPatterns = {"/saluno"})
public class saluno extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int año = Integer.parseInt(request.getParameter("año"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            int aac = 2021;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>saluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos </h1>");
            out.println("<p>Su edad es:</p>");
            out.println(aac-año);
            out.println("<br>");
            out.println("<a href='uno'>Volver al inicio</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>Volver a los ejercicios</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
