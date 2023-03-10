package com.banco.Main.service.impl;

import com.banco.Main.domain.Transacao;
import com.banco.Main.repository.TransacaoRepository;
import com.banco.Main.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoServiceImpl implements TransacaoService {
    @Autowired
    TransacaoRepository transacaoRepository;

    @Override
    public Transacao save(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }



}
