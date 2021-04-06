<%--
  Created by IntelliJ IDEA.
  User: roh
  Date: 03/04/2021
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="cadastro">
    <jsp:body>
        </div>
        <div class="row center-">
            <div class="col s3"></div>
            <form class="col s6" action="cadastrar" method="post">
                <div class="center"><h3>Cadastro</h3></div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="email" name="email" type="email" class="validate">
                        <label for="email">Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="username" name="username" type="text" class="validate">
                        <label for="username">usuario</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="password" name="password" type="password" class="validate">
                        <label for="password">Password</label>
                    </div>
                </div>
                <div class="col s4"></div>
                <div>
                    <button class="blue btn waves-effect waves-light" type="submit" name="action">Cadastrar</button>
                </div>
            </form>
        </div>
    </jsp:body>
</t:template>
