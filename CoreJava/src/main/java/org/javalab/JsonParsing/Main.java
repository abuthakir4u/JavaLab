package org.javalab.JsonParsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

public class Main {
    public static void main(String[] args) {
        String jsonSource = """
            {
                "title": "My title",
                "name": "Abuthakir"
            }
        """;
        try {
            JsonNode node = JsonUtil.parse(jsonSource);
            String title = node.get("title").asText();
            System.out.println("title: " + title);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
