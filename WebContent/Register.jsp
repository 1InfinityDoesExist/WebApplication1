<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delhi Interview</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body bgcolor="#f8f88">
<BODY onload="noBack();" onpageshow="if (event.persisted) noBack();"
	onunload="">


	<SCRIPT type="text/javascript">
		window.history.forward();
		function noBack() {
			window.history.forward();
		}
	</SCRIPT>
	<script language="JavaScript" type="text/javascript">
		window.history.forward(1);
	</script>



	<center>

		<div class="container">
			<h1>Delhi </h1>
			<div class="form-responsive">
				<form action="reg" method="post">
					<table>
						<tr>
							<td>
								<div class="input-group">
									<div class="col-xs-2">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-user"></i></span>
							</td>
							<td><input id="email" type="text" class="form-control"
								name="username" placeholder="Email" size="25" required></td>
							</div>

						</tr>
						<tr>
							<td>
								<div class="input-group">
									<div class="col-xs-2">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span>
							</td>
							<td><input id="password" type="password"
								class="form-control" name="pass" placeholder="Password"
								size="25" required></td>
							</div>
						</tr>
						<tr>
							<td>
								<div class="input-group">
									<div class="col-xs-2">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span>
							</td>
							<td><input id="password" type="password"
								class="form-control" name="psw-repeat" placeholder="Password"
								size="25" required></td>
							</div>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" class="btn btn-info"
								value="Register"></td>
						</tr>
					</table>
					<br>
				</form>
			</div>
		</div>

		<br> <br>
		<p>If You Have Already Registered GO TO SIGN IN PAGE</p>
		<tr>
			<td></td>
			<td><input
				style="width: 200px; padding: 20px; cursor: pointer; box-shadow: 6px 6px 5px; #999; -webkit-box-shadow: 6px 6px 5px #999; -moz-box-shadow: 6px 6px 5px #999; font-weight: bold; background: #ffff00; color: #000; border-radius: 10px; border: 1px solid #999; font-size: 100%;"
				type="button" value="SignIn Page "
				onclick="window.location.href='SignIn.jsp'" /></td>
		</tr>
	</center>
</body>
</html>