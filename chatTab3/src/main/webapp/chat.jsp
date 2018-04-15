<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@page import="br.edu.saojudas.pi.pacote.Cliente"%>
<%@page import="br.edu.saojudas.pi.pacote.ChatB"%>
<%@ page import="br.edu.saojudas.pi.pacote.Conversa" %>

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
	<h2>
		Olá <%=cli.getNome()%><br><br>
		Bem-Vindo ao Chat Boot
	</h2>

	<br>
	<hr>

	<form name="chatBController.do" action="chatBController.do" method="post">
				
		Faça sua pergunta: <input id="pergunta" type="text" name="pergunta" value="">
		<input type="submit" value="Enviar" name="cmdSend"> <br> <br>
		Conversa: <br>
		<br>
		<textarea readonly="readonly" name="txtMessage" rows="20" cols="60">
         	<%
				ChatB chat = (ChatB) session.getAttribute("chat");
				for (Conversa conversa : chat.getConversas()) {
					out.println(cli.getNome() + ": " + conversa.getPergunta());
					out.println("Boot: "+ conversa.getResposta());
				}
			%>
         </textarea>
		<hr>
	</form>
</body>
</html>