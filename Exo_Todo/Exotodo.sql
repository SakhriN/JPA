CREATE DATABASE exotodo;

USE exotodo;


DROP TABLE todo;

SELECT * FROM todo;

DROP TABLE user;

DELETE FROM todo;

DROP TABLE user;

INSERT INTO user VALUES
(1,"Sakhri","Nassim"),
(2,"Roelens","Clement"),
(3,"Pattinson","Robert"),
(4,"Pigani","Olivia"),
(5,"Petit","Clémence");

CREATE DATABASE TapisDB;

drop table produit;
select * from produit;



-- Création de la table Entreprise
CREATE DATABASE deception_bloup;

USE deception_bloup;
CREATE TABLE Entreprise (

    entreprise_id INT AUTO_INCREMENT PRIMARY KEY,

    nom VARCHAR(100) NOT NULL,

    adresse VARCHAR(255)

);
 
-- Création de la table de base Personne

CREATE TABLE Personne (

    personne_id INT AUTO_INCREMENT PRIMARY KEY,

    nom VARCHAR(100) NOT NULL,

    prenom VARCHAR(100),

    type_personne VARCHAR(50) NOT NULL  -- pour distinguer Employe de Manager

);
 
-- Création de la table Employe étendant Personne

CREATE TABLE Employe (

    personne_id INT PRIMARY KEY,

    salaire DECIMAL(10,2),

    poste VARCHAR(100),

    entreprise_id INT,  -- Clé étrangère pour la relation Many-to-One avec Entreprise

    FOREIGN KEY (personne_id) REFERENCES Personne(personne_id),

    FOREIGN KEY (entreprise_id) REFERENCES Entreprise(entreprise_id)

);
 
-- Création de la table Manager étendant Employe

CREATE TABLE Manager (

    personne_id INT PRIMARY KEY,

    niveau INT,

    FOREIGN KEY (personne_id) REFERENCES Employe(personne_id)

);
 
-- Création de la table Projet

CREATE TABLE Projet (

    projet_id INT AUTO_INCREMENT PRIMARY KEY,

    titre VARCHAR(100) NOT NULL,

    description TEXT

);
 
-- Création d'une table de jonction pour la relation Many-to-Many entre Personne et Projet

CREATE TABLE PersonneProjet (

    personne_id INT,

    projet_id INT,

    PRIMARY KEY (personne_id, projet_id),

    FOREIGN KEY (personne_id) REFERENCES Personne(personne_id),

    FOREIGN KEY (projet_id) REFERENCES Projet(projet_id)

);