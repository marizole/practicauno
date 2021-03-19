
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>PRACTICA 1</h1>");
            out.println("<a href='uno'>Ejercicio Uno</a>");
            out.println("<br>");
            out.println("<a href='dos'>Ejercicio Dos</a>");
            out.println("<br>");
            out.println("<a href='tres'>Ejercicio Tres</a>");
            out.println("<br>");
            out.println("<a href='cuatro'>Ejercicio Cuatro</a>");
            out.println("<br>");
            out.println("<a href='cinco'>Ejercicio Cinco</a>");
            out.println("<br>");
            out.println("<a href='seis'>Ejercicio Seis</a>");
            out.println("<br>");
            out.println("<a href='siete'>Ejercicio Siete</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
