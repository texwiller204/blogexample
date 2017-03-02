<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/imports.jsp"%>


<c:set var="language" value="${pageContext.response.locale.language}"/>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="${language}">

<head>
  

  
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		
	<meta name="keywords" content="web online" />
	<meta name="description" content="Simple web Application ">
	<meta name="author" content="heinstein">
	
	
	<!-- Mobile Configurations -->
	<meta name="GOOGLEBOT" content="index follow" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta name="apple-mobile-web-app-status-bar-style" content="black" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0 user-scalable=no" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	    
	    
    
    <title>Sample App | <sitemesh:write property='title' /></title>
    
   	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
      
    
  
    <link type="image/x-icon" href="${imgThemeHref}/favicon.png" rel="shortcut icon">
    <%-- <link type="text/css" href="${projectCssUrl}" rel="stylesheet"> --%>
    <link type="text/css" href="${cssThemeHref}/flags.css" rel="stylesheet">
        
    
    <sitemesh:write property='head' />
    
    <%@include file="shim.jsp" %>
    
    
   </head>
  <body>
  
	<%@include file="header.jsp" %>
           
	<div id="wrapper" class="container">
	
		<div class="row">
		
			
			<div class="col-md-12">
			
			<p>  DEBUG</p>
			

			
			<hr class="hr"/>
			
				<c:if test="${not empty global.error[inputName]}">
					<span class="alert alert-error">${global.error[inputName]}</span>
				</c:if>
				<c:if test="${not empty global.warn[inputName]}">
					<span class="alert alert-warning">${global.warn[inputName]}</span>
				</c:if>
				<c:if test="${not empty global.info[inputName]}">
					<span class="alert alert-info">${global.info[inputName]}</span>
				</c:if>
				
				
				<sitemesh:write property="body" />
				
				<hr class="hr"/>			
			<small> 
			<p> link bootstrapHref:  ${bootstrapHref} </p>
			<p> link baseHref:  ${baseHref} </p>
			<p> link baseThemeHref:  ${baseThemeHref} </p>
			<p> link vendorsThemeHref:  ${vendorsThemeHref} </p>
			<p> link imgThemeHref:  ${imgThemeHref} </p>
			
			<p> link jsThemeHref:  ${jsThemeHref} </p>
			<p> link cssThemeHref:  ${cssThemeHref} </p>
			<p> link fontsThemeHref:  ${fontsThemeHref} </p>
			</small>
			<%-- --%>
			</div>
		</div>
	</div>
     
    
     
     <%@include file="footer.jsp" %>
          

	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    
    
    <script type="text/javascript" charset="UTF-8">

	</script>
    
    
  </body>
</html>