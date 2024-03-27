function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe de proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if(password.value == "" || password.value.length < 3){
        alert("Debe proporcionar uu password de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkTecnologias = false; 

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkTecnologias = true; 
            break; 
        }
    }

    if (!checkTecnologias) { 
        alert("Debe seleccionar al menos una tecnología");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i = 0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
            return false;
        }
        
    var ocupacion = forma.ocupacion;
    if(ocupacion.value ==""){
        alert("Debe proporcionar una ocupacion");
        return false;
    }
    
    //formulario valido
    alert("Formulario valido, enviando datos al servidor");
    return true;
}



