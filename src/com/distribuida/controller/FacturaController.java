package com.distribuida.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.FacturaDetalle;
 
@Controller
@RequestMapping("/facturacion")     
public class FacturaController {
	
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	
	@Autowired
	private FacturaDetalle facturadetalleDAO;
	
	
	@GetMapping("/findOne")
	public String findAll(ModelMap modelMap) {
		
		modelMap.addAttribute("facturas", facturaDAO.findAll());
		
		return "Listar-facturas";
		
		
		
	}
	
	
	
	
	
	
}