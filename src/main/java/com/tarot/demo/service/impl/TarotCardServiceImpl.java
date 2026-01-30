package com.tarot.demo.service.impl;

import com.tarot.demo.entity.TarotCard;
import com.tarot.demo.entity.User;
import com.tarot.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.tarot.demo.repository.TarotCardRepository;
import com.tarot.demo.service.TarotCardService;

@Service
@RequiredArgsConstructor
public class TarotCardServiceImpl implements TarotCardService {

    private final TarotCardRepository tarotCardRepository;
    private final UserRepository userRepository;

    @Override
    public TarotCard findRandomCard(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalStateException("User not found!"));
        TarotCard card = tarotCardRepository.findRandomCard();
        user.setLastCard(card.getCardTitle());
        userRepository.save(user);
        return card;
    }
}
