DROP DATABASE IF EXISTS bianchi_formula_1;

CREATE DATABASE IF NOT EXISTS bianchi_formula_1;

USE bianchi_formula_1;

-- Versione 2
CREATE TABLE team (
    id INTEGER NOT NULL,
    name VARCHAR(255),
    base VARCHAR(255),
    teamPrincipal VARCHAR(255),
    chassis VARCHAR(255),
    powerUnit VARCHAR(255),
    worldChampionships INTEGER,
    image VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO
    team(
        id,
        name,
        base,
        teamPrincipal,
        chassis,
        powerUnit,
        worldChampionships,
        image
    )
VALUES
    (
        0,
        'Scuderia Ferrari',
        'Maranello, Italy',
        'Mattia Binotto',
        'F1-75',
        'Ferrari',
        16,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/ferrari.png.transform/6col/image.png'
    ),
    (
        1,
        'Mercedes-AMG Petronas F1 Team',
        'Brackley, United Kingdom',
        'Toto Wolff',
        'W13',
        'Mercedes',
        8,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/mercedes.png.transform/6col/image.png'
    ),
    (
        2,
        'Oracle Red Bull Racing',
        'Milton Keynes, United Kingdom',
        'Christian Horner',
        'RB18',
        'Red Bull Powertrains',
        4,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/red-bull-racing.png.transform/6col/image.png'
    ),
    (
        3,
        'McLaren F1 Team',
        'Woking, United Kingdom',
        'Andreas Seidl',
        'MCL36',
        'Mercedes',
        8,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/mclaren.png.transform/6col/image.png'
    ),
    (
        4,
        'BWT Alpine F1 Team',
        'Enstone, United Kingdom',
        'Otmar Szafnauer',
        'A522',
        'Renault',
        2,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/alpine.png.transform/6col/image.png'
    ),
    (
        5,
        'Alfa Romeo F1 Team ORLEN',
        'Hinwil, Switzerland',
        'Frédéric Vasseur',
        'C42',
        'Ferrari',
        0,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/alfa-romeo.png.transform/6col/image.png'
    ),
    (
        6,
        'Haas F1 Team',
        'Kannapolis, United States',
        'Guenther Steiner',
        'VF-22',
        'Ferrari',
        0,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/haas-f1-team.png.transform/6col/image.png'
    ),
    (
        7,
        'Scuderia AlphaTauri',
        'Faenza, Italy',
        'Franz Tost',
        'AT03',
        'Red Bull Powertrains',
        0,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/alphatauri.png.transform/6col/image.png'
    ),
    (
        8,
        'Williams Racing',
        'Grove, United Kingdom',
        'Jost Capito',
        'FW44',
        'Mercedes',
        9,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/williams.png.transform/6col/image.png'
    ),
    (
        9,
        'Aston Martin Aramco Cognizant F1 Team',
        'Silverstone, United Kingdom',
        'Mike Krack',
        'AMR22',
        'Mercedes',
        0,
        'https://www.formula1.com/content/dam/fom-website/teams/2022/aston-martin.png.transform/6col/image.png'
    );

CREATE TABLE driver (
    id INTEGER NOT NULL,
    name VARCHAR(255),
    surname VARCHAR(255),
    dateOfBirth DATE,
    country VARCHAR(255),
    image VARCHAR(255),
    podiums INTEGER,
    worldChampionships INTEGER,
    carNumber INTEGER,
    team INTEGER,
    FOREIGN KEY (team) REFERENCES team(id),
    PRIMARY KEY (id)
);

INSERT INTO
    driver (
        id,
        name,
        surname,
        dateOfBirth,
        country,
        image,
        podiums,
        worldChampionships,
        carNumber,
        team
    )
VALUES
    (
        0,
        'Charles',
        'Leclerc',
        '1997-10-16',
        'Monaco',
        'https://www.formula1.com/content/fom-website/en/drivers/charles-leclerc/_jcr_content/image.img.1920.medium.jpg/1646818893219.jpg',
        16,
        0,
        16,
        0
    ),
    (
        1,
        'George',
        'Russell',
        '1998-02-15',
        'United Kingdom',
        'https://www.formula1.com/content/fom-website/en/drivers/george-russell/_jcr_content/image.img.1920.medium.jpg/1646750994602.jpg',
        2,
        0,
        63,
        1
    ),
    (
        2,
        'Carlos',
        'Sainz',
        '1994-09-01',
        'Spain',
        'https://www.formula1.com/content/fom-website/en/drivers/carlos-sainz/_jcr_content/image.img.1920.medium.jpg/1646818866749.jpg',
        8,
        0,
        55,
        0
    ),
    (
        3,
        'Sergio',
        'Perez',
        '1990-01-26',
        'Mexico',
        'https://www.formula1.com/content/fom-website/en/drivers/sergio-perez/_jcr_content/image.img.1920.medium.jpg/1646819228700.jpg',
        16,
        0,
        11,
        2
    ),
    (
        4,
        'Lewis',
        'Hamilton',
        '1985-01-07',
        'United Kingdom',
        'https://www.formula1.com/content/fom-website/en/drivers/lewis-hamilton/_jcr_content/image.img.1920.medium.jpg/1647334259839.jpg',
        183,
        7,
        44,
        1
    ),
    (
        5,
        'Max',
        'Verstappen',
        '1997-09-30',
        'Netherlands',
        'https://www.formula1.com/content/fom-website/en/drivers/max-verstappen/_jcr_content/image.img.1920.medium.jpg/1646819045507.jpg',
        61,
        1,
        1,
        2
    ),
    (
        6,
        'Esteban',
        'Ocon',
        '1996-09-17',
        'France',
        'https://www.formula1.com/content/fom-website/en/drivers/esteban-ocon/_jcr_content/image.img.1920.medium.jpg/1647334188097.jpg',
        2,
        0,
        31,
        4
    ),
    (
        7,
        'Lando',
        'Norris',
        '1999-11-13',
        'United Kingdom',
        'https://www.formula1.com/content/fom-website/en/drivers/lando-norris/_jcr_content/image.img.1920.medium.jpg/1646819013197.jpg',
        5,
        0,
        4,
        3
    ),
    (
        8,
        'Kevin',
        'Magnussen',
        '1992-10-05',
        'Denmark',
        'https://www.formula1.com/content/fom-website/en/drivers/kevin-magnussen/_jcr_content/image.img.1920.medium.jpg/1647447969295.jpg',
        1,
        0,
        20,
        6
    ),
    (
        9,
        'Valterri',
        'Bottas',
        '1989-08-28',
        'Finland',
        'https://www.formula1.com/content/fom-website/en/drivers/valtteri-bottas/_jcr_content/image.img.1920.medium.jpg/1646819266274.jpg',
        67,
        0,
        77,
        5
    ),
    (
        10,
        'Daniel',
        'Ricciardo',
        '1989-07-01',
        'Australia',
        'https://www.formula1.com/content/fom-website/en/drivers/daniel-ricciardo/_jcr_content/image.img.1920.medium.jpg/1646818924510.jpg',
        32,
        0,
        3,
        3
    ),
    (
        11,
        'Pierre',
        'Gasly',
        '1996-02-07',
        'France',
        'https://www.formula1.com/content/fom-website/en/drivers/pierre-gasly/_jcr_content/image.img.1920.medium.jpg/1646819179303.jpg',
        3,
        0,
        10,
        7
    ),
    (
        12,
        'Yuki',
        'Tsunoda',
        '2000-05-11',
        'Japan',
        'https://www.formula1.com/content/fom-website/en/drivers/yuki-tsunoda/_jcr_content/image.img.1920.medium.jpg/1648134405786.jpg',
        0,
        0,
        22,
        7
    ),
    (
        13,
        'Fernando',
        'Alonso',
        '1981-07-29',
        'Spain',
        'https://www.formula1.com/content/fom-website/en/drivers/fernando-alonso/_jcr_content/image.img.1920.medium.jpg/1647334212592.jpg',
        98,
        2,
        14,
        4
    ),
    (
        14,
        'Zhou',
        'Guanyu',
        '1999-05-30',
        'China',
        'https://www.formula1.com/content/fom-website/en/drivers/guanyu-zhou/_jcr_content/image.img.1920.medium.jpg/1646818979975.jpg',
        0,
        0,
        24,
        5
    ),
    (
        15,
        'Alexander',
        'Albon',
        '1996-03-23',
        'Thailand',
        'https://www.formula1.com/content/fom-website/en/drivers/alexander-albon/_jcr_content/image.img.1920.medium.jpg/1646750995556.jpg',
        2,
        0,
        23,
        8
    ),
    (
        16,
        'Mick',
        'Schumacher',
        '1999-03-22',
        'Germany',
        'https://www.formula1.com/content/fom-website/en/drivers/mick-schumacher/_jcr_content/image.img.1920.medium.jpg/1647334235171.jpg',
        0,
        0,
        47,
        6
    ),
    (
        17,
        'Lance',
        'Stroll',
        '1998-10-29',
        'Canada',
        'https://www.formula1.com/content/fom-website/en/drivers/lance-stroll/_jcr_content/image.img.1920.medium.jpg/1648135171947.jpg',
        3,
        0,
        18,
        9
    ),
    (
        18,
        'Nicholas',
        'Latifi',
        '1995-06-29',
        'Canada',
        'https://www.formula1.com/content/fom-website/en/drivers/nicholas-latifi/_jcr_content/image.img.1920.medium.jpg/1646819118069.jpg',
        0,
        0,
        6,
        8
    ),
    (
        19,
        'Sebastian',
        'Vettel',
        '1987-07-03',
        'Germany',
        'https://www.formula1.com/content/fom-website/en/drivers/sebastian-vettel/_jcr_content/image.img.1920.medium.jpg/1646818813887.jpg',
        122,
        4,
        5,
        9
    );