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

INSERT INTO brands (name) VALUES ('Lu'), ('Danone'), ('Belin'), ('Ferrero'), ('Panzani') , ('Coca-Cola');

INSERT INTO categories (name) VALUES ('Biscuits'), ('Sauces tomate'), ('Pâtes à tartiner'), ('Boissons') ;

INSERT INTO products (barcode,designation,lactose,gluten,photo_link,category_id,brand_id) VALUES
('7622210449283', 
'prince chocolat', 
true, 
true,
'https://fr.openfoodfacts.org/images/products/762/221/024/5281/front_fr.15.full.jpg',
1,
1
),('5000112547412', 
'Coca cola',
false,
false,
'https://images.openfoodfacts.org/images/products/500/011/254/7412/front_de.30.100.jpg',
4,
6
),('3017760002035','Petit écolier Chocolat fin',true,true,'https://fr.openfoodfacts.org/images/products/301/776/000/2035/front_fr.34.full.jpg',
1,1),('8076809513388','Barilla sauce tomates arrabbiata 400g',false,false,'https://fr.openfoodfacts.org/images/products/807/680/951/3388/front_fr.184.400.jpg',4,2),
('8000500310427','Nutella Biscuit',true,true,'https://fr.openfoodfacts.org/images/products/800/050/031/0427/ingredients_fr.95.400.jpg',4,3);

