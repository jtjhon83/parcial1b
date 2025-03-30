package com.proyecto.torres.mongo.mongoproyecto.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.torres.mongo.mongoproyecto.Modelo.Calificacion;
import com.proyecto.torres.mongo.mongoproyecto.Servicio.Studenserve;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/estudiantes")//url para que vote el resultado en el postam 
public class Studencontrol {

@Autowired
Studenserve Studenserve; //para que se conecte con el servicio 

@PostMapping //metodo insertar datos dependencia de postmapping
public Calificacion guardardatos(@Validated @RequestBody Calificacion estudiante) {
    return this.Studenserve.guardardatos(estudiante);
}
@GetMapping // metodo para que nos muestre los datos guardados en la base de datos
    public ArrayList<Calificacion> listarproductos(){
        return this.Studenserve .listarproductos();
    }
    @GetMapping (path = "/{estudiante}")// metodo para q muestre los datos por medio del id 
    public Optional <Calificacion> burcarporpornombre(@PathVariable("estudiante") String estudiante){
        return this.Studenserve.buscarpornombre(estudiante); 

    }

}
