/*
 * DDL = Data Definition Language
 * Command lines from 'foods-db' folder:
 * psql -h localhost -p 5432 -U postgres -d foods
 * \i schema.ddl.sql
 * \q
 */

DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS brands;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;

CREATE TABLE roles(
	id SERIAl PRIMARY KEY,
	name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	username VARCHAR(255) UNIQUE NOT NULL,
	password CHAR(60) NOT NULL,
	role_id INTEGER,
	CONSTRAINT fk_role_id FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE brands(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE categories(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE products(
	id SERIAL PRIMARY KEY,
	barcode VARCHAR(60) UNIQUE NOT NULL,
	designation VARCHAR(255) NOT NULL,
	lactose BOOLEAN NOT NULL,
	gluten BOOLEAN NOT NULL,
	photo_link VARCHAR(255),
	category_id INTEGER NOT NULL,
	brand_id INTEGER NOT NULL,/* retirer NOT NULL si j'utilise uniquement la category*/
	CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES categories(id),
	CONSTRAINT fk_brand_id FOREIGN KEY (brand_id) REFERENCES brands(id)
);
