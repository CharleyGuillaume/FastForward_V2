# Nettoyage de précédente version

DROP TABLE colis;
DROP TABLE livraison;
DROP TABLE depot;
DROP TABLE expediteur;
DROP TABLE adresse;
DROP TABLE personne;

# Personne

CREATE TABLE personne (
    id number NOT NUL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    username varchar(150) NOT NULL,
    password varchar(150) NOT NULL,
    primary key (id)
);

# Adresse

CREATE TABLE adresse (
    adr_numero int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    societe varchar(150) DEFAULT NULL,
    nom varchar(150) NOT NULL,
    prenom varchar(150) NOT NULL,
    adr_rue varchar(150) NOT NULL,
    adr_num varchar(150) NOT NULL,
    adr_cp numeric(4) NOT NULL,
    adr_ville varchar(150) NOT NULL,
    adr_pays varchar(150) NOT NULL,
    mail varchar(150) DEFAULT NULL,
    tel varchar(20) NOT NULL, -- INT ??
    PRIMARY KEY (adr_numero)
);

INSERT INTO adresse (societe, nom, prenom, adr_rue, adr_num, adr_cp, adr_ville, adr_pays, mail, tel) VALUES
	('GDuCable', 'Dupiteux', 'Henry', 'Rue du Lombard', '14', 1000, 'Bruxelles', 'Belgique', 'dupiteux.h@gducable.be', '010/234598'),
	('GBeaucoupDeCable', 'Lemaire', 'Arthur', 'Rue Vilette', '56', 4000, 'Liege', 'Belgique', 'lemairehenry@gmail.com', '030/653409'),
	('FastForward', 'Dutilleul', 'Justin', 'Rue Gillon', '12', 1000, 'Bruxelles', 'Belgique', 'dutilleul@fastforward.be', '010/574289'),
	('Librairie Gerard', 'Gérard', 'Christian', 'Avenue des combattants', '10', 5000, 'Namur', 'Belgique', 'gg@hotmail.com', '081/740659'),
	(NULL, 'Dupuis', 'Jean-Luc', 'Rue de Noirmont', '19', 5030, 'Gembloux', 'Belgique', 'dupuisjl@hotmail.com', '081/613478');


# Expéditeur

CREATE TABLE expediteur (
    exp_numero int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    num_adresse int NOT NULL,
    num_compte varchar(20) DEFAULT NULL, -- INT ????? 
    fax varchar(20) DEFAULT NULL,-- INT ????
    PRIMARY KEY (exp_numero),
    FOREIGN KEY (num_adresse) REFERENCES adresse (adr_numero)
);

INSERT INTO expediteur (num_adresse, num_compte, fax) VALUES
	(1, '784-6789456-456', '010/234599'),
	(2, '764-0935712-638', '030/653410');


# Dépôt

CREATE TABLE depot (
    dep_numero int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    num_adresse int NOT NULL,
    libelle varchar(100) NOT NULL,
    dispatch_d boolean DEFAULT NULL, -- int DEFAULT 0 NOT NULL, -- TODO : boolean
    infos_pratiques varchar(250) DEFAULT NULL,
    PRIMARY KEY (dep_numero),
    FOREIGN KEY (num_adresse) REFERENCES adresse (adr_numero)
);

INSERT INTO depot (num_adresse, libelle, dispatch, infos_pratiques) VALUES
	(4, 'Librairie Gerard', 0, 'Ouvert de 10 à 18 la semaine, fermé le dimanche'),
	(3, 'Dispatch', 1, 'Café offert !');


# livraison

CREATE TABLE livraison (
	liv_numero int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	num_expediteur int NOT NULL,
	num_adresse_enlevement int DEFAULT NULL,
	num_adresse_destination int NOT NULL,
	num_depot int DEFAULT NULL,
	date_demande date NOT NULL,
	date_depot date DEFAULT NULL,
	date_enlevement date DEFAULT NULL,
	prix_livraison numeric(10) NOT NULL,
	livraison_payee boolean NOT NULL DEFAULT FALSE,
	date_paiement_livraison varchar(10) DEFAULT NULL,
	montant_contreremb numeric(5) DEFAULT NULL,
	contreremb_dest_paye boolean DEFAULT NULL,
	date_paiement_contreremb_dest date DEFAULT NULL,
	contreremb_exp_paye boolean DEFAULT NULL,
	date_paiement_contreremb_exp date DEFAULT NULL,
	etat int NOT NULL,
	PRIMARY KEY (liv_numero),
	FOREIGN KEY (num_expediteur) REFERENCES expediteur (exp_numero),
	FOREIGN KEY (num_adresse_enlevement) REFERENCES adresse (adr_numero),
	FOREIGN KEY (num_adresse_destination) REFERENCES adresse (adr_numero),
	FOREIGN KEY (num_depot) REFERENCES depot (dep_numero)
);

INSERT INTO livraison (num_expediteur,num_adresse_enlevement,num_adresse_destination,num_depot,date_demande,date_depot,date_enlevement,prix_livraison,livraison_payee,date_paiement_livraison,montant_contreremb,contreremb_dest_paye,date_paiement_contreremb_dest,contreremb_exp_paye,date_paiement_contreremb_exp,etat) VALUES
	(1, 1, 4, NULL, '15/06/2009', NULL, '17/06/2009', 30, TRUE, '15/06/2009', NULL, NULL, NULL, NULL, NULL, 6),
	(2, NULL, 5, 2, '23/08/2012', '24/08/2012', NULL, 4, TRUE, '23/08/2012', NULL, NULL, NULL, NULL, NULL, 7),
	(2, 2, 1, NULL, '15/04/2013', NULL, '18/04/2013', 40, TRUE, '16/04/2013', 200, NULL, NULL, NULL, NULL, 8)
	;


# Colis

CREATE TABLE colis (
	col_numero int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	num_livraison int NOT NULL,
	libelle varchar(100) NOT NULL,
	poids double NOT NULL, -- TODO : Pas de décimale ?
	fragile boolean NOT NULL DEFAULT FALSE,
	hauteur double NOT NULL, -- TODO : Pas de décimale ?
	largeur double NOT NULL, -- TODO : Pas de décimale ?
	profondeur double NOT NULL, -- TODO : Pas de décimale ?
	enl_accepte boolean DEFAULT NULL,
	enl_raison_refus varchar(100) DEFAULT NULL,
	liv_accepte boolean DEFAULT NULL,
	liv_raison_refus varchar(100) DEFAULT NULL,
	PRIMARY KEY (col_numero),
	FOREIGN KEY (num_livraison) REFERENCES livraison (liv_numero)
);

INSERT INTO colis (num_livraison, libelle, poids, fragile, hauteur, largeur, profondeur, enl_accepte, enl_raison_refus, liv_accepte, liv_raison_refus) VALUES
	(1, 'Cable coax 20m', 500, FALSE, 50, 50, 10, TRUE, NULL, TRUE, NULL),
	(1, 'Connecteurs coax 10pc', 100, FALSE, 10, 10, 10, TRUE, NULL, TRUE, NULL),
	(2, 'Kit connexion RJ45', 125, FALSE, 20, 10, 10, TRUE, NULL, FALSE,'Boite abimée' ),
	(3, 'Boiler Daalderop 200l', 10000, TRUE, 200, 100, 100, TRUE, NULL, NULL, NULL);