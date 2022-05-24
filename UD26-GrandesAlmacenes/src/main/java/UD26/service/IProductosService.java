package UD26.service;

import java.util.List;
import UD26.dto.Productos;

public interface IProductosService {

	// Metodos del CRUD
	public List<Productos> listarProductos(); // Listar All

	public Productos guardarProductos(Productos productos); // Guarda un Curso CREATE

	public Productos productos_ID(Integer id_productos); // Leer datos de un Curso READ

	public Productos actualizarProductos(Productos productos); // Actualiza datos del Curso UPDATE

	public void eliminarProductos(Integer id_productos);// Elimina el Curso DELETE
}
