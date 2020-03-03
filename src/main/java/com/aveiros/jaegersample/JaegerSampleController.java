package com.aveiros.jaegersample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JaegerSampleController {
    @GetMapping(path = "/test")
    public ResponseEntity<Map<String, Object>> getTest() {
        Map<String, Object> body = new HashMap<>();
        return ResponseEntity.ok(body);
    }
}
