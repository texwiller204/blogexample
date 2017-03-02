<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"    uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn"     uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<c:set var="fontThemeHref" 	value="${baseHref}/assets/styles" />
<c:set var="cssHref" 		value="${baseHref}/assets/styles" />
<c:set var="jsHref" 		value="${baseHref}/assets/scripts" />
<c:set var="bootstrapHref" 	value="${baseHref}/assets/bootstrap" />


<c:set var="baseThemeHref" 		value="${pageContext.request.contextPath}/Assets/FrondEndTemplate"/>

<c:set var="imagesThemeHref" 	value="${baseThemeHref}/images" />
<c:set var="jsThemeHref" 		value="${baseThemeHref}/js" />
<c:set var="cssThemeHref" 		value="${baseThemeHref}/css" />
<c:set var="fontsThemeHref" 	value="${baseThemeHref}/fonts" />
<c:set var="vendorsThemeHref" 	value="${baseThemeHref}/vendor" />





<%--
<spring:url var="projectCssUrl" value="${cssThemeHref}/styles.css" />
<spring:url var="flagsCssUrl" value="${cssThemeHref}/flags.css" />
<spring:url var="faviconUrl" value="${imgThemeHref}/favicon.png" />
--%>
   


<%--
<c:set var="baseHref" value="${pageContext.request.contextPath}"/>
<c:set var="baseThemeHref" value="${pageContext.request.contextPath}/static/FrondEndTemplate"/>

<c:set var="baseThemeHref" value="${pageContext.request.contextPath}/static/FrondEndTemplate"/>
<c:set var="imgThemeHref" value="${baseThemeHref}/img" />
<c:set var="vendorsThemeHref" value="${baseThemeHref}/vendor" />
<c:set var="jsThemeHref" value="${baseThemeHref}/js" />
<c:set var="cssThemeHref" value="${baseThemeHref}/css" />
<c:set var="fontsThemeHref" value="${baseThemeHref}/fonts" />

<c:set var="imgsHref" value="${baseThemeHref}/img" />
<c:set var="viewHref" value="${baseHref}/view" />
<c:set var="guestHref" value="${viewHref}/guest" />
<c:set var="userHref" value="${viewHref}/user" />
<c:set var="adminHref" value="${viewHref}/admin" />


 --%>
 
 
<c:set var="baseHref" value="${pageContext.request.contextPath}"/>