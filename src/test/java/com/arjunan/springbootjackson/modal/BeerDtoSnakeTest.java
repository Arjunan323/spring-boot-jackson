package com.arjunan.springbootjackson.modal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends  BaseTest{

    @Test
    void testSnake() throws JsonProcessingException {

        BeerDTO beerDTO = getDto();

        String beerString = objectMapper.writeValueAsString(beerDTO);

        System.out.println(beerString);

    }
}
