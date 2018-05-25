<%-- 
    Document   : listaUsuarios
    Created on : 21-05-2018, 23:53:01
    Author     : JPOZO-LAPTOP
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gestion de Usuario</title>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <nav class="col s12">
                    <jsp:include page="menuBar.jsp" />
                </nav>
                <div class="col s6 offset-s3">
                    <table class="bordered centered">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Usuario</th>
                                <th>Password</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${applicationScope.lstUsuarios}" var="u">
                                <tr>
                                    <td>${u.nombre}</td>
                                    <td>${u.apellido}</td>
                                    <td>${u.user}</td>
                                    <td>${u.pass}</td>
                                </tr>
                            </c:forEach>    

                        </tbody>
                    </table>
                </div>
            </div>
        </div> 
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(function () {
                $(".button-collapse").sideNav();
            });
        </script>
    </body>
</html>