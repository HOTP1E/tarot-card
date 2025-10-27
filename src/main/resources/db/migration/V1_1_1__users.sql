CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY ,
    username VARCHAR(50) ,
    email VARCHAR(50) ,
    last_card VARCHAR(50) ,
    last_entry TIMESTAMP
);