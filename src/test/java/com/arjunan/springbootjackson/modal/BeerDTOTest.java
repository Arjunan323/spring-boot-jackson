package com.arjunan.springbootjackson.modal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDTOTest extends BaseTest{

    @Test
    void testSerializedDto() throws JsonProcessingException {

        BeerDTO beerDTO = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDTO);

        System.out.println(jsonString);
    }

    @Test
    void testDeSerializeDto() throws JsonProcessingException {

        String json = "{\"id\":\"421cece8-bb6f-413f-b3cc-fc448fb9ead6\",\"beerName\":\"New Beer\",\"beerStyle\":\"Ale\",\"upc\":214431243,\"price\":100,\"createdDate\":\"2022-11-16T14:55:55.496043+05:30\",\"lastUpdatedDate\":\"2022-11-16T14:55:55.496043+05:30\"}";

        BeerDTO beerDTO = objectMapper.readValue(json, BeerDTO.class);

        System.out.println(beerDTO);
    }

}