INSERT INTO users (username, password, enabled) VALUES ('user', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('Zsa Zsa', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO users (username, password, enabled) VALUES ('mechanic', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('backoffice', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('administrator', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('cashier', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('customer_1', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('customer_2', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('customer_3', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('customer_4', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('Zsa Zsa', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('mechanic', 'ROLE_MECHANIC');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_MECHANIC');
INSERT INTO authorities (username, authority) VALUES ('backoffice', 'ROLE_BACKOFFICE');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_BACKOFFICE');
INSERT INTO authorities (username, authority) VALUES ('administrator', 'ROLE_ADMINISTRATOR');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMINISTRATOR');
INSERT INTO authorities (username, authority) VALUES ('cashier', 'ROLE_CASHIER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_CASHIER');
INSERT INTO authorities (username, authority) VALUES ('customer_1', 'ROLE_CUSTOMER_1');
INSERT INTO authorities (username, authority) VALUES ('customer_2', 'ROLE_CUSTOMER_2');
INSERT INTO authorities (username, authority) VALUES ('customer_3', 'ROLE_CUSTOMER_3');
INSERT INTO authorities (username, authority) VALUES ('customer_4', 'ROLE_CUSTOMER_4');



INSERT INTO customers (First_Name, achternaam, woonplaats, telefoonnummer)
VALUES
('Zsa Zsa', 'Zonnenberg', 'Apeldoorn', '0639303393'),
('Joost', 'van Aartsen', 'Raalte', '088888867');

INSERT INTO employees (job, naam, werknemersnummer)
VALUES
('Mechanic', 'R. Epair', '#0001'),
('Backoffice', 'B. Ack', '#0002'),
('Cashier', 'C. Ash', '#0003'),
('Administrator', 'R. Egister', '#0004');

INSERT INTO supply (itemName, priceInEuro, storageLocation, phoneNumber)
VALUES
('APK-Keuring', '€45', 'Apeldoorn', '0639303393'),
('banden', '€180', 'Apeldoorn', '0639303393'),
('Remmen', '€400', 'Apeldoorn', '0639303393'),
('Ruiten grondig reinigen', '€30', 'Apeldoorn', '0639303393'),
('Nieuwe verlichting', '€40', 'Apeldoorn', '0639004321'),
('Navigatie Software Update Pakket', '€80', 'Apeldoorn', '0639303393'),
('Vergrendeling & gordels', '€350', 'Apeldoorn', '0639303393'),
('Aankoop nieuwe auto incl. APK', '€1400', 'Apeldoorn', '0639303393'),
('nieuwe stuurbekrachtiging', '€250', 'Apeldoorn', '0639303393');

INSERT INTO repair (item, price, Changes made, status)
VALUES
('APK-keuring', '€45', 'algemene kosten voor de APK-Keuring', 'status onbekend'),
('Remmen', '€400', 'remmen vervangen omdat ze versleten zijn', 'status onbekend'),
('banden', '€180', 'banden vervangen voor zomerbanden', 'status onbekend'),
('lichten', '€350', 'knipperlicht linksvoor is kapot', 'status wordt gerepareerd'),
('voorruit', '€250', 'sterretje in de voorruit maken', 'status onbekend');

