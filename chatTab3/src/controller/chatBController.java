package controller;

import java.io.IOException;

import Dao.ConnectionFactory;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.ChatService;
import pacote.ChatB;
import pacote.Cliente;
import pacote.Menssagem;
/**
 * Servlet implementation class chatBController
 */
@WebServlet("/chatBController.do")
public class chatBController extends HttpServlet {
	
	   private static final long serialVersionUID = 1L;
	   
	   
	   ChatB chat = new ChatB();
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   doPost(request, response);
		   }
	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();   
		Cliente cliente = (Cliente)session.getAttribute("cliente");
		if (cliente == null) {
			String pNome = request.getParameter("nome");
			String pEmail = request.getParameter("email");
			/*
			String pMenssagem = request.getParameter("");
			String pNomeMsg = request.getParameter("nome"); 
			String pPergunta = request.getParameter("txtMsg");
			*/
					
			//instanciar o javabean
			Cliente cli = new Cliente();
			cli.setNome(pNome);
			cli.setEmail(pEmail);
			
			//instanciar o service
			ChatService cs = new ChatService();
			cs.criarCliente(cli);
			cli = cs.carregar(cli.getId()); 
			
			
			session.setAttribute("cliente", cli);
			session.setAttribute("chat", chat);
			
		}
		   
		   
		RequestDispatcher view =
				request.getRequestDispatcher("chat.jsp");
				view.forward(request, response);
	   }
}


