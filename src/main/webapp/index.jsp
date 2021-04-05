<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="index">
    <jsp:body>
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
                    <button class="blue btn waves-effect waves-light" type="submit" name="action">Entrar</button>
                </div>
                <div class="col s3"></div>
                <div class="col s6">
                    <div class="col s4"></div>
                    <div class="col s8"><p>ou</p></div>
                    <div class="col s12"> </div>
                    <div class="col s2"></div>
                    <div class="col s6">
                        <a>Cadastre-se</a>
                    </div>
                </div>
            </form>
        </div>
    </jsp:body>
</t:template>