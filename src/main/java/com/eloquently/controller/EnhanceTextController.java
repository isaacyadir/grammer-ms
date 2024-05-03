package com.eloquently.controller;

import com.eloquently.grammar.EnhanceTextRequest;
import com.eloquently.grammar.EnhanceTextResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class EnhanceTextController {
//    private final EnhanceTextRequest enhanceTextRequest;

    private EnhanceTextRequest enhanceTextRequest;


    @PostMapping("/{userId}/enhance")
    public ResponseEntity<EnhanceTextResponse> enhanceText(
            @RequestBody EnhanceTextRequest enhanceTextRequest
    ) {

//        log.info("inside enhanceText");
        EnhanceTextResponse enhanceTextRequest1 = new EnhanceTextResponse();
        return ResponseEntity.ok(enhanceTextRequest1);

    }

}