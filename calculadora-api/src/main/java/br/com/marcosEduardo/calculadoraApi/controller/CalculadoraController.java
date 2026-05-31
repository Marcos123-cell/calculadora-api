package br.com.marcosEduardo.calculadoraApi.controller;

import br.com.marcosEduardo.calculadoraApi.Service.CalculadoraService;
import br.com.marcosEduardo.calculadoraApi.dto.CalculadoraDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcular")
@RequiredArgsConstructor
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @GetMapping("/somar/{n1}/{n2}")
    public CalculadoraDTO somar(@PathVariable Double n1, @PathVariable Double n2){
        return calculadoraService.somar(n1,n2);
    }

    @GetMapping("/subtrair/{n1}/{n2}")
    public CalculadoraDTO subtrair(@PathVariable Double n1, @PathVariable Double n2){
        return calculadoraService.subtracao(n1,n2);
    }

    @GetMapping("/multiplicar/{n1}/{n2}")
    public CalculadoraDTO multiplicar(@PathVariable Double n1, @PathVariable Double n2){
        return calculadoraService.multiplicacao(n1,n2);
    }

    @GetMapping("/dividir/{n1}/{n2}")
    public CalculadoraDTO dividir(@PathVariable Double n1, @PathVariable Double n2){
        return calculadoraService.divisao(n1,n2);
    }

}
