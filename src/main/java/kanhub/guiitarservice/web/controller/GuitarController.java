package kanhub.guiitarservice.web.controller;

import kanhub.guiitarservice.web.model.GuitarDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/guitar")
@RestController
public class GuitarController {

    @GetMapping("/{guitarId}")
    public ResponseEntity<GuitarDto> getGuitarById(@PathVariable("guitarId") UUID guitarId) {
        // ToDo impl
        return new ResponseEntity<>(GuitarDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewGuitar(@RequestBody GuitarDto guitarDto) {
        // ToDo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{guitarId}")
    public ResponseEntity updateGuitarById(@PathVariable("guitarId") UUID guitarId, @RequestBody GuitarDto guitarDto) {
        // ToDo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
