<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com SUCESSO!!!!
	</c:if>
	
	<c:if test="${empty empresa}">
		Nenhuma empresa CADASTRADA!
	</c:if>
		
		
	</body>
</html>