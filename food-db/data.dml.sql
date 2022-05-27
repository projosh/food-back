/*
 * DML = Data Lanipulation Language
 * Command lines from 'foods-db' folder:
 * psql -h localhost -p 5432 -U postgres -d foods
 * \i data.dml.sql
 * \q
 */

INSERT INTO roles (name) VALUES
('admin'),('client');

INSERT INTO users (username,password,role_id) VALUES
('steve.berenger@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id FROM roles r WHERE r.name  = 'client'));
INSERT INTO users (username,password,role_id) VALUES
('steve.berenger56@gmail.com', 'ironman', (SELECT r.id FROM roles r WHERE r.name  = 'client')); 


INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('7622210449283', 
'prince chocolat', 
true, 
true,
'https://fr.openfoodfacts.org/images/products/762/221/024/5281/front_fr.15.full.jpg');

INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('5000112547412', 
'Coca cola', 
false, 
false,
'https://images.openfoodfacts.org/images/products/500/011/254/7412/front_de.30.100.jpg');

INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('3017760002035', 
'Petit écolier Chocolat fin ', 
true, 
true,
'https://fr.openfoodfacts.org/images/products/301/776/000/2035/front_fr.34.full.jpg');

INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('3161711001971', 
'Caprice des dieux - 300 g', 
false, 
false,
'https://fr.openfoodfacts.org/images/products/316/171/100/1971/front_fr.88.400.jpg');


INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('8076809513388 ', 
'Barilla sauce tomates arrabbiata 400g - 400 g', 
false, 
false,
'https://fr.openfoodfacts.org/images/products/807/680/951/3388/front_fr.184.400.jpg');

INSERT INTO products (barcode,designation,lactose,gluten,photo_link) VALUES
('8000500310427', 
'Nutella Biscuits biscuits fourrés pâte à tartiner et cacao x22 - 304 g', 
true, 
true,
'https://fr.openfoodfacts.org/images/products/800/050/031/0427/ingredients_fr.95.400.jpg');


INSERT INTO brands (name) VALUES ('Lu');

INSERT INTO categories (name) VALUES ('biscuits');

















































































































