package com.conference.gui.article;

import com.conference.gui.entities.Articulo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author sonhuila
 */
public class Article implements IArticleRest {

    private static final String USER_AGENT = "GUIArticles";
    private final String urlArticleService = "http://localhost:8080/article";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Articulo save(Articulo articulo) {
        Articulo savedArticle = null;
        try {
            // Convertir el objeto `Articulo` a JSON
            String jsonInputString = objectMapper.writeValueAsString(articulo);

            // Crear la solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlArticleService.concat("/save"))) // Asume que tu endpoint es "/save"
                    .header("Content-Type", "application/json")
                    .header("User-Agent", USER_AGENT)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonInputString))
                    .build();

            // Enviar la solicitud y obtener la respuesta
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar y procesar la respuesta
            if (response.statusCode() == 200) {
                savedArticle = objectMapper.readValue(response.body(), Articulo.class);
            } else {
                System.out.println("Error al guardar el artículo: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return savedArticle;
    }
}
