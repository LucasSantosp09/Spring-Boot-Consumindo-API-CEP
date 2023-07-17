package br.com.treinaweb.cepautocomplete.controles;

import br.com.treinaweb.cepautocomplete.dto.WebManiaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.cepautocomplete.servicos.CepServico;

@RestController
@RequestMapping("/cep")
public class CepControle {

    @Autowired
    private CepServico cepServico;

    @GetMapping("/{cep}")
    public WebManiaResponse consultar(@PathVariable String cep) {
        return cepServico.consultar(cep);
    }

}
