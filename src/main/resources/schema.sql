DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS(
    id BIGINT NOT NULL AUTO_INCREMENT,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    role VARCHAR(50) not null,
    PRIMARY KEY (id)
);