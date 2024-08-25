package com.java.products.repositories;

import org.springframework.data.repository.CrudRepository; // JPA ES UNA INTERFAZ QUE NOS PERMITE HACER OPERACIONES CRUD
import org.springframework.stereotype.Repository;

import com.java.products.models.Product;

@Repository // Indica que la clase es un repositorio por lo tanto un bean y un singleton
public interface ProductRepository extends CrudRepository<Product, Long> {}

// Bean de Spring: Es un objeto que es instanciado, ensamblado y administrado por un contenedor de Spring. Estos beans son creados a partir de la configuración que se realiza en un archivo XML o en una clase Java.