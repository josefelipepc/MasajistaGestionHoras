/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar_clave() {
    var caract_invalido = " ";
    var caract_longitud = 6;
    var password1 = document.mi_formulario.mi_clave.value;
    var password2 = document.mi_formulario.mi_clave2.value;
    if (password1 == '' || password2 == '') {
        alert('Debes introducir tu clave en los dos campos.');
        return false;
    }
    if (document.mi_formulario.mi_clave.value.length < caract_longitud) {
        alert('Tu clave debe constar de ' + caract_longitud + ' caracteres.');
        return false;
    }
    if (document.mi_formulario.mi_clave.value.indexOf(caract_invalido) > -1) {
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