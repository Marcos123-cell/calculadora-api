package br.com.marcosEduardo.calculadoraApi.dto;

import br.com.marcosEduardo.calculadoraApi.enums.OperacaoEnum;


public record CalculadoraDTO(OperacaoEnum operacao,
                             Double numero1,
                             Double numero2,
                             Double resultado) {
}
