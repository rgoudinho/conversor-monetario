<%--
  Created by IntelliJ IDEA.
  User: roh
  Date: 02/04/2021
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="conversor">
    <jsp:body>
        <h1 class="center">Conversor monetário</h1>
        <div class="row">
            <form class="col s12">
                <div class="row">
                    <div class="input-field col s3">
                        <input id="input_value" type="text" data-length="10">
                        <label for="input_value">Valor</label>
                    </div>
                    <div class="input-field col s3">
                        <select class="browser-default">
                            <option value="" >Da moeda:</option>
                            <option value="1">Dolar (USD)</option>
                            <option value="2">Real (BRL)</option>
                            <option value="3">Euro (EUR)</option>
                            <option value="4">Iene (JPY)</option>
                            <option value="5">Libra Esterlina (GBP)</option>
                        </select>
                    </div>
                    <div class="input-field col s1">
                        <button class="blue btn waves-effect waves-light" type="submit" name="action">⇄</button>
                    </div>
                    <div class="input-field col s3">
                        <select class="browser-default">
                            <option value="" >Para a moeda:</option>
                            <option value="1">Dolar (USD)</option>
                            <option value="2">Real (BRL)</option>
                            <option value="3">Euro (EUR)</option>
                            <option value="4">Iene (JPY)</option>
                            <option value="5">Libra Esterlina (GBP)</option>
                        </select>
                    </div>
                    <div class="input-field col s2">
                        <button class="blue btn waves-effect waves-light" type="submit" name="action">Converter</button>
                    </div>
                </div>
            </form>
        </div>
    </jsp:body>
</t:template>
