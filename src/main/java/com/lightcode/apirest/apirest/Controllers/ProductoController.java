package com.lightcode.apirest.apirest.Controllers;

import org.springframework.web.bind.annotation.RestController;
import com.lightcode.apirest.apirest.Repository.ProductoRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.lightcode.apirest.apirest.Models.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/productos")
public class ProductoController {

    
    //Esta etiqueta decorador nos permite inyectar una instancia de nuestro repositorio
    @Autowired
    private ProductoRepo productoRepo;

    @GetMapping("/all")
    public List<Producto> obtenerTodosLosProductos(){
        return productoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Producto obtenerUnProductoPorId(@PathVariable Long id){
        return productoRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));
    }
    

    @PostMapping("/create")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoRepo.save(producto);
    }
    
    @PostMapping("/createAll")
    public List<Producto> crearMuchosProductos(@RequestBody List<Producto> arrProductos){
        return productoRepo.saveAll(arrProductos);
    }
    

    @PutMapping("/{id}")
    public Producto actualizarProducto (@PathVariable Long id, @RequestBody Producto productoMod) {
        Producto producto = productoRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));

        producto.setNombre(productoMod.getNombre());
        producto.setPrecio(productoMod.getPrecio());

        return productoRepo.save(producto);
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto (@PathVariable Long id) {
        Producto producto = productoRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));

        productoRepo.deleteById(id);

        return ("Se a eliminado el producto " + producto.getNombre() + ", ID: " + producto.getId());
    }
    


}
