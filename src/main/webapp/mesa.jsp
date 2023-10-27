<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body{
		margin: 0;
		background-color: darkgreen;
	}
	
	#conteudo {
		display: flex;
		flex-direction: column;
		align-items:center;
		margin:auto;
		justify-content:center;
		width: 80%;
		height: 100vh;
	}
	
	#topo {
		width: 80%;
		margin: auto;
		height: 150px;
		display: flex;
		align-items:center;
		padding:0 20px;
		background-color: #006e8b;
	}
	
 	#meio {
 		width: 50%;
 		margin: auto;
 		height: 150px;
 		margin-top: 10px;
 		display: flex;
 		justify-content: center;
 		align-items: center;
 		background-color: #ff5252;
 	}
 	
 	#rodape {
 		width: 80%;
 		margin: auto;
 		height: 150px;
 		margin-top: 10px; 		
 		display: flex;
 		flex-wrap: wrap;
		align-items:center;
		padding:0 20px;
		background-color: #006e8b;
 	}
</style>
</head>
<body>
	<div id="conteudo">
		<div id="topo">
			<c:choose>
				<c:when test="${not mostra}">
					<img src="img/${mao_cpu[0].imagem}"/>
					<img src="img/b2fv.png"/>
				</c:when>
				
				<c:otherwise>
					<c:forEach items="${mao_cpu}" var="carta">
						<img src="img/${carta.imagem}" />
					</c:forEach>
				</c:otherwise>
				
			</c:choose>			
		</div>
		<div id="meio">
			
			<a href="ViraCarta"><img src="img/b2fv.png"/></a>
			<a href="ParaCompra"><img src="img/jr.png" /></a>
			
		</div>
		<div id="rodape">
			<c:forEach items="${mao_usuario}" var="carta">
				<img src="img/${carta.imagem}" />
			</c:forEach>
		</div>	
	</div>



</body>
</html>