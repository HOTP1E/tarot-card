CREATE TABLE cards (
    id BIGSERIAL PRIMARY KEY,
    card_title VARCHAR(50) NOT NULL,
    description VARCHAR(1000) NOT NULL
);