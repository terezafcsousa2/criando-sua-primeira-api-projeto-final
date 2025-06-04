package br.com.freire.terezinha.screenmatch_frases.Controller;

import br.com.freire.terezinha.screenmatch_frases.DTO.FraseDTO;
import br.com.freire.terezinha.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

        @Autowired
        private FraseService servico;
        @GetMapping("/series/frases")
        FraseDTO obterFraseAleatoria(){
            return servico.obterFraseAleatoria();
    }
}
