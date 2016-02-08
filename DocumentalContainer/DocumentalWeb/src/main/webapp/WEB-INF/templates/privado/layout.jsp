<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
		<link rel="stylesheet" href="//cdn.datatables.net/1.10.7/css/jquery.dataTables.min.css">
		<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		<script src="//cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
    </head>
    <body>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menuPrincipal" />
		<section class="contenido">
			<div class="panelManipular">
				<tiles:insertAttribute name="menuSecundario" />
				<div class="manipular">
					<tiles:insertAttribute name="body" />
				</div>
			</div>
		</section>
		<tiles:insertAttribute name="footer" />
	
    </body>
</html>
