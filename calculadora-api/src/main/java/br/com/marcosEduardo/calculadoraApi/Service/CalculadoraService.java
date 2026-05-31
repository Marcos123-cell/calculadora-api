package br.com.marcosEduardo.calculadoraApi.Service;

import br.com.marcosEduardo.calculadoraApi.dto.CalculadoraDTO;
import br.com.marcosEduardo.calculadoraApi.enums.OperacaoEnum;
import br.com.marcosEduardo.calculadoraApi.exceptions.DivisaoPorZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculadoraDTO somar(Double num1, Double num2) {
        Double resultado = num1 + num2;

        CalculadoraDTO calculadoraDTO = new CalculadoraDTO(
                OperacaoEnum.SOMA,
                num1,
                num2, resultado
        );

        return calculadoraDTO;
    }

    public CalculadoraDTO subtracao(Double num1, Double num2){
        Double resultado = num1 - num2;

        CalculadoraDTO calculadoraDTO = new CalculadoraDTO(
                OperacaoEnum.SUBTRACAO,
                num1,
                num2,
                resultado
        );

        return calculadoraDTO;
    }

    public CalculadoraDTO multiplicacao(Double num1, Double num2){
        Double resultado = num1 * num2;

        CalculadoraDTO calculadoraDTO = new CalculadoraDTO(
                OperacaoEnum.MULTIPLICACAO,
                num1,
                num2,
                resultado
        );

        return calculadoraDTO;
    }

    public CalculadoraDTO divisao(Double num1, Double num2){

        if(num2 == 0){
            throw new DivisaoPorZeroException();
        }
        Double resultado = num1 / num2;

        CalculadoraDTO calculadoraDTO = new CalculadoraDTO(
                OperacaoEnum.DIVISAO,
                num1,
                num2,
                resultado

        );

        return calculadoraDTO;
    }
}