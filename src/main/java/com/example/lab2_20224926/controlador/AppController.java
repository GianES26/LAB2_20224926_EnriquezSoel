package com.example.lab2_20224926.controlador;


import com.example.lab2_20224926.entidad.auto;
import com.example.lab2_20224926.entidad.sede;
import com.example.lab2_20224926.entidad.seguro;
import com.example.lab2_20224926.repositorio.AutoRepository;
import com.example.lab2_20224926.repositorio.SedeRepository;
import com.example.lab2_20224926.repositorio.SeguroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {

    final SeguroRepository seguroRepository;
    final SedeRepository sedeRepository;
    final AutoRepository autoRepository;

    public AppController(SeguroRepository seguroRepository, SedeRepository sedeRepository, AutoRepository autoRepository) {
        this.seguroRepository = seguroRepository;
        this.sedeRepository = sedeRepository;
        this.autoRepository = autoRepository;
    }


    @GetMapping(value = "/listaAutos")
    public String listaAutos(Model model) {

        List<auto> listaAutos = autoRepository.findAll();
        model.addAttribute("listaAutos", listaAutos);

        return "autos/lista";
    }

    @GetMapping(value = "/formAuto")
    public String formAuto(Model model) {
        model.addAttribute("listaSedes", sedeRepository.findAll());
        return "autos/form";
    }

    @PostMapping(value = "/crearAuto")
    public String crearAuto(auto auto) {

        autoRepository.save(auto);
        return "redirect:/listaAutos";
    }

    @GetMapping(value = "/borrarAuto/{id}")
    public String borrarAuto(@PathVariable("id") Integer id) {
        autoRepository.deleteById(id);
        return "redirect:/listaAutos";
    }






    @GetMapping(value = "/listaSeguros")
    public String listaSeguros(Model model) {

        List<seguro> listaSeguros = seguroRepository.findAll();
        model.addAttribute("listaSeguros", listaSeguros);

        return "seguros/lista";
    }


    @GetMapping(value = "/listaSedes")
    public String listaSedes(Model model) {

        List<sede> listaSedes = sedeRepository.findAll();
        model.addAttribute("listaSedes", listaSedes);

        return "sedes/lista";
    }


}
