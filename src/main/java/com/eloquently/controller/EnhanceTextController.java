package com.eloquently.controller;

import java.net.URI;

import com.eloquently.grammar.EnhanceTextRequest;
import com.eloquently.grammar.EnhanceTextResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/protected/1012349/grammar-ms")
@RequiredArgsConstructor
@Slf4j
public class EnhanceTextController {

    private final EnhanceTextRequest enhanceTextRequest;


    @PostMapping("/{userId}/enhance")
    public ResponseEntity<EnhanceTextResponse> enhanceText(@RequestBody EnhanceTextRequest enhanceTextRequest) {

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand()
                .toUri();

        return ResponseEntity.created(location)
                .build();

    }

}