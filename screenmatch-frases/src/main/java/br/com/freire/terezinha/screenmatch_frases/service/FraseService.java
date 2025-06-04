package br.com.freire.terezinha.screenmatch_frases.service;

import br.com.freire.terezinha.screenmatch_frases.DTO.FraseDTO;
import br.com.freire.terezinha.screenmatch_frases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FraseService {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
