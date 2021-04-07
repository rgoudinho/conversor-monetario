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
            <form class="col s12" action="conversor" method="post">
                <div class="row">
                    <div class="input-field col s3">
                        <input id="input-value" type="text" name="value" data-length="10">
                        <label for="input-value">Valor</label>
                    </div>
                    <div class="input-field col s3">
                        <select id="selected-starting-currency" name="selected-starting-currency" class="browser-default">
                            <option value="" disabled selected>Da moeda:</option>
                        </select>
                    </div>
                    <div class="input-field col s1">
                        <button class="blue btn waves-effect waves-light" type="submit" name="action">⇄</button>
                    </div>
                    <div class="input-field col s3">
                        <select id="selected-converted-currency" name="selected-converted-currency" class="browser-default">
                            <option value="" disabled selected>Para a moeda:</option>
                        </select>
                    </div>
                    <div class="input-field col s2">
                        <button class="blue btn waves-effect waves-light" type="submit" name="action">Converter</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="center">
            ${original_value} = ${converted_value}
        </div>
        <script>
            window.onload =  function (){
                //ajax get para listar moedas
                $.get('currency', function(data) {
                    let $select = $('#selected-starting-currency');

                    $.each(data, function(index, item) {
                        $('<option>').val(index).text(item).appendTo($select);
                    });
                });

                //evento de seleção de moeda no select
                $('#selected-starting-currency').change(function (){
                    //parâmetro a ser enviado
                    let params = {
                        startingCurrency: $(this).find(':selected').text()
                    }
                    //armazenamento no localstorage
                    localStorage.setItem('currency', params.startingCurrency);
                });

                //ajax get para listar moedas
                $.get('currency', function(data) {
                    let $select = $('#selected-converted-currency');

                    $.each(data, function(index, item) {
                        $('<option>').val(index).text(item).appendTo($select);
                    });
                });

                //evento de seleção de estado no select
                $('#selected-converted-currency').change(function (){
                    //parâmetro a ser enviado
                    let params = {
                        convertedCurrency: $(this).find(':selected').text()
                    }
                    //armazenamento no localstorage
                    localStorage.setItem('currency', params.convertedCurrency);
                });
            }
        </script>
    </jsp:body>
</t:template>
