package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salcinco", urlPatterns = {"/salcinco"})
public class salcinco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         int numa = Integer.parseInt(request.getParameter("numa"));
         int numb = Integer.parseInt(request.getParameter("numb"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> salcinco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos </h1>");
            out.println("<p>La suma es:</p>");
            out.println(numa+numb);
            out.println("<p>La resta es:</p>");
            out.println(numa-numb);
            out.println("<p>La multiplicacion es:</p>");
            out.println(numa*numb);
            out.println("<p>La division es:</p>");
            out.println(numa/numb);
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='cinco'>Volver al inicio</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>Volver a los ejercicios</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
