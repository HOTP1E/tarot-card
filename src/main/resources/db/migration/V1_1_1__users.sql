CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY ,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    last_card VARCHAR(50) NOT NULL,
    last_entry TIMESTAMP NOT NULL
);