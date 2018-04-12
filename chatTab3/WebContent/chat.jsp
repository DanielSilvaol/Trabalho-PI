<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@page import="pacote.Cliente"%>
<%@ page import="Dao.ConnectionFactory"%>
<%@ page import="java.sql.Statement"%>
<%@page import="pacote.ChatB"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; harset=UTF-8">
<title>ChatBot</title>
</head>
<body bgcolor="#6495ED">



	<h6>
		<%
			Cliente cli = (Cliente) session.getAttribute("cliente");
		%>
		id :=
		<%=cli.getId()%><br> Nome: =
		<%=cli.getNome()%><br> email: =
		<%=cli.getEmail()%><br>
	</h6>

	<%
		String pPergunta = request.getParameter("txtMsg");
	%>
	<%
		ChatB chat = (ChatB) session.getAttribute("chat");
	%>
	<%
		chat.setPergunta(pPergunta);
	%>

	<h2>
		Olá
		<%=cli.getNome()%><br> <br> Bem-Vindo
	</h2>
	<br>
	<hr>

	<form name="chatBController.do" action="chatBController.do"
		method="post">
				
		Menssagem: <input type="text" name="txtMsg" value=""> <input
			type="submit" value="Enviar" name="cmdSend"> <br> <br>
		Conversa: <br>
		<br>
		<textarea readonly="readonly" name="txtMessage" rows="20" cols="60">
			
         	<%
			         		if (request.getParameter("txtMsg") != null) {

			         			try {
			         				Connection conn = ConnectionFactory.obtemConexao();
			         				Statement st = conn.createStatement();

			         				int id = 0;
			         				int x = 1 ;
			         				
			         				String status = "aberto";

			         				String sql = "insert into pergunta values ('" + chat.getPergunta() + "')";
			         				String sql2 = "insert into atendimento values ( '" + status + "','" + 1 + "','" + 1
			         						+ "','" + x + "')";
			         				st.executeUpdate(sql);
			         				st.executeUpdate(sql2);
			         				st.execute("commit");
			         				x++;

			         			} catch (Exception ex1) {
			         				System.err.println(ex1.getMessage());
			         				String messages = "Erro.";
			         				out.println(messages);
			         			}
			         		}
			         		try {
			         			Connection conn = ConnectionFactory.obtemConexao();
			         			Statement st = conn.createStatement();

			         			ResultSet rs = st.executeQuery(
			         					"select cliente.Nome_Cliente, atendimento.Status_Atendimento, pergunta.Pergunta from cliente join atendimento on cliente.ID_Cliente = atendimento.ID_Cliente  join pergunta  on   atendimento.Pergunta_ID_Pergunta = pergunta.ID_Pergunta");

			         			// imprimir todas as perguntas
			         			while (rs.next()) {
			         				String messages = rs.getString(1) + "  " + rs.getString(2) + " >> " + rs.getString(3);

			         				out.println(messages);
			         			}

			         			conn.close();
			         		} catch (Exception ex1) {
			         			System.err.println(ex1.getMessage());
			         		}
			         	%>
     
         </textarea>
		<hr>
	</form>
</body>
</html>