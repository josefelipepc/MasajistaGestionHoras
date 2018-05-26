<%-- 
    Document   : inscribirUsuario
    Created on : 21-05-2018, 23:40:10
    Author     : JPOZO-LAPTOP
--%>

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
                    <form class="col s12" action="registroUsuario.do" method="post" name="formularioRegistro" onSubmit="return validar_password()">
                        <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix">account_circle</i>
                                <input name="txtNombre" id="nombre" type="text" class="validate">
                                <label for="nombre">Nombre</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">account_circle</i>
                                <input name="txtApellido" id="apellido" type="text" class="validate">
                                <label for="apellido">Apellido</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">account_circle</i>
                                <input name="txtUser" id="user" type="text" class="validate">
                                <label for="user">User</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">lock</i>
                                <input name="txtPass1" id="pass" type="password" class="validate">
                                <label for="pass">Ingrese Password</label>
                            </div>
                            <div class="input-field col s12">
                                <i class="material-icons prefix">lock</i>
                                <input name="txtPass2" id="pass" type="password" class="validate">
                                <label for="pass2">Ingrese Password Nuevamente</label>
                            </div>
                            <div class="row center-align">
                                <button class="btn waves-effect waves-light" type="submit" name="action">
                                                Enviar <class ="material-icons right">Registrar</i>
                                </button>
                            </div>
                        </div>
                    </form>
                    <div class="red-text center-align">
                        ${requestScope.msg}
                    </div>
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
        <script type="text/javascript">
            function validar_password() {
                var caract_invalido = " ";
                var caract_longitud = 6;

                var password1 = document.formularioRegistro.txtPass1.value;
                var password2 = document.formularioRegistro.txtPass2.value;

                if (password1 == '' || password2 == '') {
                    alert('Debes introducir tu clave en los dos campos.');
                    return false;
                }
                if (password1.length < caract_longitud) {
                    alert('Tu clave debe constar de ' + caract_longitud + ' caracteres.');
                    return false;
                }
                if (password1.indexOf(caract_invalido) > -1) {
                    alert("Las claves no pueden contener espacios");
                    return false;
                } else {
                    if (password1 != password2) {
                        alert("Las claves introducidas no son iguales");
                        return false;
                    } else {
                        alert('Contraeña correcta');
                        return true;
                    }
                }
            }

        </script>
    </body>
</html>