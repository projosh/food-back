/*
 * DDL = Data Definition Language
 * Command lines from 'foods-db' folder:
 * psql -h localhost -p 5432 -U postgres -d foods
 * \i schema.ddl.sql
 * \q
 */

CREATE TABLE roles(
id SERiAl PRIMARY KEY,
name VARCHAR(255) UNIQUE NOT NULL

);

CREATE TABLE users(
id SERIAL PRIMARY KEY,
username VARCHAR(255) UNIQUE NOT NULL,
password CHAR(60) NOT NULL,
role_id INTEGER,
CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles(id)

);

CREATE TABLE products(id SERIAL PRIMARY KEY,
barcode VARCHAR(60) UNIQUE NOT NULL,
designation VARCHAR(255) NOT NULL,
lactose BOOLEAN NOT NULL,
gluten BOOLEAN NOT NULL,
photo_link VARCHAR(255)
);


CREATE TABLE brands(id SERIAL PRIMARY KEY,
name VARCHAR(255) UNIQUE NOT NULL);


CREATE TABLE categories(id SERIAL PRIMARY KEY,
name VARCHAR(255) UNIQUE NOT NULL);



