package UD26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD26.dao.IVentaDAO;
import UD26.dto.Venta;

@Service
public class VentasServiceImpl implements IVentasService {

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {

		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {

		return iVentaDAO.save(venta);
	}

	@Override
	public Venta Venta_ID(Integer id_venta) {

		return iVentaDAO.findById(id_venta).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {

		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(Integer id_venta) {
		iVentaDAO.deleteById(id_venta);

	}

}
