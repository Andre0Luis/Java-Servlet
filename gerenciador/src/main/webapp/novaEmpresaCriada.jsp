<%
//scriptlet

String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);

%>

<html><body>
Empresa <%= nomeEmpresa %> cadastrada com SUCESSO!!!
</body></html>