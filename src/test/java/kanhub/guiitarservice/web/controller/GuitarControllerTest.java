package kanhub.guiitarservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kanhub.guiitarservice.web.model.GuitarDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class GuitarControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getGuitarById() throws Exception {
        mockMvc.perform(get("/api/v1/guitar/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewGuitar() throws Exception {
        GuitarDto guitarDto = GuitarDto.builder().build();
        String guitarDtoJson = objectMapper.writeValueAsString(guitarDto);

        mockMvc.perform(post("/api/v1/guitar/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(guitarDtoJson))
                .andExpect(status().isCreated());

    }

    @Test
    void updateGuitarById() throws Exception {
        GuitarDto guitarDto = GuitarDto.builder().build();
        String guitarDtoJson = objectMapper.writeValueAsString(guitarDto);

        mockMvc.perform(put("/api/v1/guitar/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(guitarDtoJson))
                .andExpect(status().isNoContent());
    }
}