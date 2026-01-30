package com.tarot.demo.controller;

import com.tarot.demo.entity.TarotCard;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tarot.demo.service.TarotCardService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
public class TarotCardController {

    private final TarotCardService tarotCardService;

    @GetMapping("/random/users/{id}")
    public ResponseEntity<TarotCard> findRandomCard(@PathVariable Long id) {
        return ResponseEntity.ok(tarotCardService.findRandomCard(id));
    }
}
