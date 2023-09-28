package com.jesus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jesus.entity.Marca;
import com.jesus.entity.Silla;
import com.jesus.service.MarcaService;
import com.jesus.service.SillaService;

@Controller
@RequestMapping("/silla")
public class SillaController {
	@Autowired
	private SillaService servicioSilla;
	
	@Autowired
	private MarcaService servicioMarca;
	
	@RequestMapping("/lista")
	public String index(Model model) {
		model.addAttribute("sillas", servicioSilla.listarSillas());
		model.addAttribute("marca", servicioMarca.listarMarca());		
		return "silla";
	} 
	
	@RequestMapping("/grabar")
	public String grabar(@RequestParam("codigo") Integer cod,
						 @RequestParam("descripcion") String des,
						 @RequestParam("precio") Double pre,
						 @RequestParam("stock") int sto,
						 @RequestParam("tipo") int codMarca,
						 RedirectAttributes redirect) {
		try {
			Silla sil = new Silla();
			sil.setDescripcion(des);
			sil.setPrecio(pre);
			sil.setStock(sto);
			
			Marca mar = new Marca();
			mar.setCodigo(codMarca);
			
			sil.setTipo(mar);
			if(cod == 0) {
				servicioSilla.registrar(sil);
				redirect.addFlashAttribute("MENSAJE", "SILLA REGISTRADA");
			} else {
				sil.setCodigo(cod);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/silla/lista";
	}
}
