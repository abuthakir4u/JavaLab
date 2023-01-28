package org.javalab.JsonParsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.javalab.JsonParsing.pojos.AuthorPojo;
import org.javalab.JsonParsing.pojos.BookPojo;
import org.javalab.JsonParsing.pojos.DatePojo;
import org.javalab.JsonParsing.pojos.SimplePojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonUtilTest {

    private String jsonSource = """
            {
                "title": "My title",
                "author": "Abuthakir"
            }
        """;

    private String case1 = """
            {
                "date": "2022-12-25",
                "localDate": "2022-12-25",
                "name": "Christmas Day"
            }
        """;

    private String case2 = """
            {
                "authorName": "Abuthakir",
                "books": [
                    {
                        "title": "title1",
                        "inPrint": true,
                        "publishDate": "2019-12-25"
                    },
                    {
                        "title": "title2",
                        "inPrint": false,
                        "publishDate": "2019-01-01"
                    }
                ]
            }
        """;

    @org.junit.jupiter.api.Test
    void parse() throws JsonProcessingException {
        JsonNode node = JsonUtil.parse(jsonSource);
        String title = node.get("title").asText();
        System.out.println("title: " + title);

        assertEquals(title, "My title");
    }

    @org.junit.jupiter.api.Test
    void fromJson() throws JsonProcessingException {
        JsonNode node = JsonUtil.parse(jsonSource);
        SimplePojo simplePojo = JsonUtil.fromJson(node, SimplePojo.class);

        System.out.println("title from pojo: " + simplePojo.getTitle());
        assertEquals(simplePojo.getTitle(), "My title");
    }

    @org.junit.jupiter.api.Test
    void toJson() throws JsonProcessingException {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setTitle("My title");
        JsonNode node = JsonUtil.toJson(simplePojo);
        assertEquals(simplePojo.getTitle(), node.get("title").asText());
    }

    @org.junit.jupiter.api.Test
    void stringify() throws JsonProcessingException {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setTitle("My title");
        JsonNode node = JsonUtil.toJson(simplePojo);
        System.out.println(JsonUtil.stringify(node));
        //assertEquals(simplePojo.getTitle(), node.get("title").asText());
    }

    @org.junit.jupiter.api.Test
    void prettyStringify() throws JsonProcessingException {
        SimplePojo simplePojo = new SimplePojo();
        simplePojo.setTitle("My title");
        JsonNode node = JsonUtil.toJson(simplePojo);
        System.out.println(JsonUtil.prettyStringify(node));
        //assertEquals(simplePojo.getTitle(), node.get("title").asText());
    }

    @org.junit.jupiter.api.Test
    void fromDateJson_Case1() throws JsonProcessingException {
        JsonNode node = JsonUtil.parse(case1);
        DatePojo datePojo = JsonUtil.fromJson(node, DatePojo.class);

        System.out.println("name: " + datePojo.getName());
        System.out.println("name: " + datePojo.getDate());
        System.out.println("name: " + datePojo.getLocalDate());
        assertEquals("2022-12-25", datePojo.getLocalDate().toString());
    }

    @org.junit.jupiter.api.Test
    void Case2() throws JsonProcessingException {
        JsonNode node = JsonUtil.parse(case2);
        AuthorPojo authorPojo = JsonUtil.fromJson(node, AuthorPojo.class);

        System.out.println("authorName: " + authorPojo.getAuthorName());
        for(BookPojo bookPojo: authorPojo.getBooks()) {
            System.out.println("books: " + bookPojo.getTitle());
            System.out.println("books: " + bookPojo.getPublishDate());
            System.out.println("books: " + bookPojo.isInPrint());
        }

    }
}