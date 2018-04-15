package br.edu.saojudas.pi.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by daniel on 15/04/18.
 */

@WebServlet("/")
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bem-Vindo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href=\"index.html\">Clique aqui para logar ao chat bot</a>");
        out.println("</body>");
        out.println("</html>");


    }
}
