package com.banco.Main.useCases.util;

import com.banco.Main.useCases.adapters.ContaAdapter;
import com.banco.Main.useCases.adapters.DepositoAdapter;
import com.banco.Main.useCases.dtos.DepositoDto;
import com.banco.Main.useCases.exceptionHandler.DocumentoInvalidoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DepositarUtil {
    @Autowired
    DepositoAdapter depositoAdapter;
    @Autowired
    ContaAdapter contaAdapter;

//    public DepositoDto depositar(DepositoDto depositoDto) {
//        var documento = depositoDto.getDocumento();
//        var res = contaAdapter.findByDocumento(documento);
//        if (res.isEmpty())  {
//            throw new DocumentoInvalidoException();
//        }
//        if ()
//    }

}
