package com.tarot.demo.service;

import com.tarot.demo.entity.TarotCard;

public interface TarotCardService {

    TarotCard findRandomCard(Long userId);
}
