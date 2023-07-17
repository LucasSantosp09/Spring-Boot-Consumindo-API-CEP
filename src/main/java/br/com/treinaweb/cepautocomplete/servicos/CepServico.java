package br.com.treinaweb.cepautocomplete.servicos;

import br.com.treinaweb.cepautocomplete.dto.WebManiaResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepServico {
    private static final String URL_TEMPLATE = "https://webmaniabr.com/api/1/cep/%s/?app_key=QpgzByU0G8bRalamUzgxmwk92BUc9sa3&app_secret=yoXv0oOpAEgFT0qDL4waWTA4P0lrAIWBXktLoZrC4AK6g69m";

    public WebManiaResponse consultar (String cep){
        String url = String.format(URL_TEMPLATE, cep);
        RestTemplate restTemplate = new RestTemplate();
        WebManiaResponse response = restTemplate.getForObject(url, WebManiaResponse.class);
        return response;
    }

    public boolean validar (String cep){

        WebManiaResponse response = consultar(cep);

        return response.getCep() != null;
    }

}
