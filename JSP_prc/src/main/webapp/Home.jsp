<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP Directives</h1>
	
	<pre>
		
		JSP directives includes
			=> @page
				
				It used to specify some attributes for the entire page.
				So to specify attributes, we have tag attributes=value
				<!-- <%@ //page   attribute=value ... %>  -->
				
				
				these attributes can be:
				
					language = "Scripting language"
					extends = "class name"
					import = "import list"
					session = "true / false"
					info = "Information"
				
				
			=> @include
				
				To include other page content we can use this directive.
				<!-- <%@ // inlcude file="file_Name.jsp" %>  -->
				
	</pre>


</body>
</html>