<%@ include file="/WEB-INF/imports.jsp"%>

<%@taglib prefix="util" tagdir="/WEB-INF/tags/util"%>


<spring:message var="telepUrl" code="telep.url.main"/>
<spring:message var="modulsystemUrl" code="modulsystem.url.main"/>
<spring:message var="cybercomUrl" code="cybercom.url.main"/>




<footer class="footer">


  <hr class="hr"/>	

    <div class="container text-left">
        <ul class="list-inline pull-right">
        	<li><util:language language="en"/></li>
            <li><util:language language="fr"/></li>
            <li><util:language language="de"/></li>            
        </ul>
        <p>
            <spring:message code="application.name"/>&nbsp;<spring:message code="application.version"/>
        </p>
        <ul class="list-inline">
            <li>
                <a href="${telepUrl}" target="_blank">Tele P</a>
            </li>
            <li>-</li>
            <li>
                <a href="${modulsystemUrl}" target="_blank">ModulSystem</a>
            </li>
            <li>-</li>
            <li>
                <a href="${cybercomUrl}" target="_blank">Cybercom Poland</a>
            </li>
        </ul>
        <p>
            Copyright &copy; 2015 fkh 
        </p>
    </div>

</footer>