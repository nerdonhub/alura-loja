package br.com.alura.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        if (url == null) {
            throw new IllegalArgumentException("URL não pode ser nula");
        }
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP - URL inválida", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }
}
