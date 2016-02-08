<div class="contenedorLogin">
	<div class="panel panelDocumental">
		<div class="panel-heading">Iniciar Sesión</div>
		<div class="panel-body">
			<form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
				<div class="input-group margin-bottom-20">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                       <input type="text" placeholder="Username" class="form-control">
                   </div>
                   <div class="input-group margin-bottom-20">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                       <input type="text" placeholder="Username" class="form-control">
                   </div>
				<div class="form-group margin-top-20">
					<button type="submit" class="btn btn-documental btn-login">Loguear</button>
				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
		</div>
	</div>
</div>