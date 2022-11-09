CREATE DATABASE IF NOT EXISTS webshop ;

USE webshop;

DROP TABLE IF EXISTS product;

create table product
(
    id int auto_increment primary key,
    name varchar(255),
    price int
);

INSERT INTO product (name, price) VALUES ('Kaffe', 12.00);
INSERT INTO product (name, price) VALUES ('Mælk', 22.00);
INSERT INTO product (name, price) VALUES ('Æbler', 2.00);