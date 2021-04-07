<%--
  Created by IntelliJ IDEA.
  User: roh
  Date: 03/04/2021
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="historico">
    <jsp:body>
        <h1 class="center">Histórico de conversões</h1>
        <table class="striped">
            <thead>
            <tr>
                <th>Valor</th>
                <th>Da Moeda</th>
                <th>Para</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty conversions}">
                <tr>
                    <c:forEach var="conversion" items="${conversions}">
                        <td>${conversion.value}</td>
                        <td>${conversion.startingCurrency}</td>
                        <td>${conversion.convertedCurrency}</td>
                    </c:forEach>
                </tr>
            </c:if>
            </tbody>
        </table>
    </jsp:body>
</t:template>
