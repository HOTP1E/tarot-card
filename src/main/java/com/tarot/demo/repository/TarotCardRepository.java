package com.tarot.demo.repository;

import com.tarot.demo.entity.TarotCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TarotCardRepository extends JpaRepository<TarotCard,Long> {

    @Query(value = "SELECT * FROM cards ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    TarotCard findRandomCard();
}
