package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "saldos", urlPatterns = {"/saldos"})
public class saldos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int longitud = Integer.parseInt(request.getParameter("longitud"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            int A=0;
            int B=1;
            int Aux;
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos </h1>");
            out.println("<p>El numero fibonaci es:</p>");
            out.println("<br>" + A);
            for(int i=0; i< longitud; i++){
                out.println(A+B);
                Aux = A;
                A = A+B;
                B = Aux;
            }
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='dos'>Volver al inicio</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>Volver a los ejercicios</a>");
            out.println("</body>");
            out.println("</html>");
            out.flush();
            out.close();
        }
    }
}
