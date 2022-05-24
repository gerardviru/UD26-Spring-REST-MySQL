package UD26.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import UD26.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
