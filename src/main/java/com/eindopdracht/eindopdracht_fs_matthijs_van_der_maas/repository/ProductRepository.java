package com.eindopdracht.eindopdracht_fs_matthijs_van_der_maas.repository;

import com.eindopdracht.eindopdracht_fs_matthijs_van_der_maas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>  {
}

