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
			<div class="table-responsive">
				<table>
					<tr>
						<td>Search Registration</td>
						<td><input type="button" class="btn btn-info" value="Search"
							onClick="window.location.href='Search.jsp' " /></td>
					</tr>
					<tr>
						<td>Update Registration</td>
						<td><input type="button" class="btn btn-info" value="Update"
							onClick="window.location.href='Update.jsp' " /></td>
					</tr>
					<tr>
						<td>Delete Registration</td>
						<td><input type="button" class="btn btn-info" value="Delete"
							onClick="window.location.href='Delete.jsp' " /></td>
					</tr>

				</table>
			</div>
		</div>
	</center>
</BODY>
</html>

