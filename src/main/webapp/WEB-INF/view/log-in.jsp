<%--
  Created by IntelliJ IDEA.
  User: roh
  Date: 04/04/2021
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="log-in">
    <jsp:body>
        </div>
        <div class="row">
            <div class="col s3"></div>
            <form class="col s6" action="log-in" method="post">
                <div class="center"><h3>Log-in</h3></div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="email" type="email" class="validate">
                        <label for="email">Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="password" type="password" class="validate">
                        <label for="password">Password</label>
                    </div>
                </div>
                <div class="col s4"></div>
                <div class="s6">
                    <button class="btn waves-effect waves-light" type="submit" name="action">Entrar</button>
                </div>
                <div class="col s3"></div>
                <div class="col s6 center">
                    <div class="col s12"> </div>
                    <div class="col s1"></div>
                    <div class="col s6">
                        <p>ou</p><a>Cadastre-se</a>
                    </div>
                </div>
            </form>
        </div>
    </jsp:body>
</t:template>
