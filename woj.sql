CREATE TABLE uwm.wojewodztwo 
(id serial,
 kod_teryt varchar(20), 
 skrot varchar (2), 
 nazwa varchar(100),
  PRIMARY KEY (id)
);
CREATE INDEX ix_wojewodztwo_nazwa ON uwm.wojewodztwo (nazwa);

INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('2', '02', 'DOLNOŚLĄSKIE', 'DS');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('4', '04', 'KUJAWSKO-POMORSKIE', 'KU');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('6', '06', 'LUBELSKIE', 'LB');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('8', '08', 'LUBUSKIE', 'LU');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('10', '10', 'ŁÓDZKIE', 'LO');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('12', '12', 'MAŁOPOLSKIE', 'MP');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('14', '14', 'MAZOWIECKIE', 'MZ');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('16', '16', 'OPOLSKIE', 'OP');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('18', '18', 'PODKARPACKIE', 'PK');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('20', '20', 'PODLASKIE', 'PD');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('22', '22', 'POMORSKIE', 'PO');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('24', '24', 'ŚLĄSKIE', 'GS');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('26', '26', 'ŚWIĘTOKRZYSKIE', 'SW');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('28', '28', 'WARMIŃSKO-MAZURSKIE', 'WM');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('30', '30', 'WIELKOPOLSKIE', 'WP');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('32', '32', 'ZACHODNIOPOMORSKIE', 'ZP');
INSERT INTO uwm.wojewodztwo (id, kod_teryt, nazwa, skrot) VALUES ('0', '00', 'BRAK DANYCH', '--');(
