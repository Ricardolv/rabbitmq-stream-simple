package com.richard.infrastructure.resources;

import com.richard.domain.Request;
import com.richard.domain.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestResource {

    private final RequestService requestService;

    @PostMapping
    public ResponseEntity<?> request(@RequestBody Request request) {
        requestService.publisher(request);
        return ResponseEntity.noContent()
                .build();
    }

}
