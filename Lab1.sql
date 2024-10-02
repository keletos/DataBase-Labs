CREATE TABLE Airline_info (
                              airline_id INT PRIMARY KEY,
                              airline_code VARCHAR(30) NOT NULL,
                              airline_name VARCHAR(50) NOT NULL,
                              airline_country VARCHAR(50) NOT NULL,
                              created_at TIMESTAMP NOT NULL,
                              updated_at TIMESTAMP NOT NULL,
                              info VARCHAR(50)
);

CREATE TABLE Airport (
                         airport_id INT PRIMARY KEY,
                         airport_name VARCHAR(50) NOT NULL,
                         arriving_airport_id INT,
                         departing_airport_id INT,
                         country VARCHAR(50) NOT NULL,
                         state VARCHAR(50),
                         city VARCHAR(50),
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL
);

CREATE TABLE Baggage_check (
                               baggage_check_id INT PRIMARY KEY,
                               check_result VARCHAR(50) NOT NULL,
                               created_at TIMESTAMP NOT NULL,
                               updated_at TIMESTAMP NOT NULL,
                               booking_id INT NOT NULL,
                               passenger_id INT NOT NULL
);

CREATE TABLE Baggage (
                         baggage_id INT PRIMARY KEY,
                         weight_in_kg DECIMAL(4, 2) NOT NULL,
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL,
                         booking_id INT NOT NULL
);

CREATE TABLE Boarding_pass (
                               boarding_pass_id INT PRIMARY KEY,
                               booking_id INT NOT NULL,
                               seat VARCHAR(50) NOT NULL,
                               boarding_time TIMESTAMP NOT NULL,
                               created_at TIMESTAMP NOT NULL,
                               updated_at TIMESTAMP NOT NULL
);

CREATE TABLE Booking_flight (
                                booking_flight_id INT PRIMARY KEY,
                                booking_id INT NOT NULL,
                                flight_id INT NOT NULL,
                                created_at TIMESTAMP NOT NULL,
                                updated_at TIMESTAMP NOT NULL
);

CREATE TABLE Booking (
                         booking_id INT PRIMARY KEY,
                         flight_id INT NOT NULL,
                         passenger_id INT NOT NULL,
                         booking_platform VARCHAR(50) NOT NULL,
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL,
                         status VARCHAR(50) NOT NULL,
                         price DECIMAL(7, 2) NOT NULL
);

CREATE TABLE Flights (
                         flight_id INT PRIMARY KEY,
                         sch_departure_time TIMESTAMP NOT NULL,
                         sch_arrival_time TIMESTAMP NOT NULL,
                         departing_airport_id INT NOT NULL,
                         arriving_airport_id INT NOT NULL,
                         departing_gate VARCHAR(50),
                         arriving_gate VARCHAR(50),
                         airline_id INT NOT NULL,
                         act_departure_time TIMESTAMP,
                         act_arrival_time TIMESTAMP,
                         created_at TIMESTAMP NOT NULL,
                         updated_at TIMESTAMP NOT NULL
);

CREATE TABLE Passengers (
                            passenger_id INT PRIMARY KEY,
                            first_name VARCHAR(50) NOT NULL,
                            last_name VARCHAR(50) NOT NULL,
                            date_of_birth DATE NOT NULL,
                            gender VARCHAR(50) NOT NULL,
                            country_of_citizenship VARCHAR(50) NOT NULL,
                            country_of_residence VARCHAR(50) NOT NULL,
                            passport_number VARCHAR(20) NOT NULL,
                            created_at TIMESTAMP NOT NULL,
                            updated_at TIMESTAMP NOT NULL
);

CREATE TABLE Security_check (
                                security_check_id INT PRIMARY KEY,
                                check_result VARCHAR(20) NOT NULL,
                                created_at TIMESTAMP NOT NULL,
                                updated_at TIMESTAMP NOT NULL,
                                passenger_id INT NOT NULL
);

--Lab1
ALTER TABLE Airline_info
    RENAME TO Airline;

ALTER TABLE Booking
    RENAME COLUMN price TO ticket_price;

ALTER TABLE Flights
ALTER COLUMN departing_gate TYPE TEXT;

ALTER TABLE Airline
    DROP COLUMN info;

SELECT * from Flights;


--Lab2
--1
SELECT Passengers.passenger_id, Security_check.passenger_id, Booking.passenger_id, Baggage_check.passenger_id
FROM Passengers
JOIN Security_check ON Passengers.passenger_id = Security_check.passenger_id
JOIN Booking ON Passengers.passenger_id = Security_check.passenger_id
Join Baggage_check ON Passengers.passenger_id = Baggage_check.passenger_id;

SELECT Booking.booking_id, Baggage_check.booking_id, Baggage.booking_id, Boarding_pass.booking_id, Booking_flight.booking_id
FROM Booking
JOIN  Baggage_check ON Booking.booking_id = Baggage_check.booking_id
JOIN Baggage ON Booking.booking_id = Baggage.booking_id
JOIN Boarding_pass ON Booking.booking_id = Boarding_pass.booking_id
JOIN Booking_flight ON Booking.booking_id = Booking_flight.booking_id;

SELECT Flights.flight_id, Booking_flight.flight_id
FROM Flights
JOIN Booking_flight ON Flights.flight_id = booking_flight.flight_id;

SELECT Airport.departing_airport_id, Flights.departing_airport_id
FROM Airport
JOIN Flights ON Airport.departing_airport_id = Flights.departing_airport_id;

SELECT Airport.arriving_airport_id, Flights.arriving_airport_id
FROM Airport
JOIN Flights ON Airport.arriving_airport_id = Flights.arriving_airport_id;

SELECT Airline.airline_id, Flights.airline_id
FROM Airline
JOIN Flights ON Airline.airline_id = Flights.airline_id;

--2
insert into Airline (airline_name, airline_country) values ('Herman, Huels and Hoeger', 'Sweden');
insert into Airline (airline_name, airline_country) values ('Pouros, Stamm and Turner', 'Canada');
insert into Airline (airline_name, airline_country) values ('Carroll Inc', 'China');
insert into Airline (airline_name, airline_country) values ('Lind Inc', 'China');
insert into Airline (airline_name, airline_country) values ('Morissette-Volkman', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Murphy, Kunde and Kilback', 'Uganda');
insert into Airline (airline_name, airline_country) values ('Hudson-Daniel', 'China');
insert into Airline (airline_name, airline_country) values ('Hessel, Romaguera and Hauck', 'Bolivia');
insert into Airline (airline_name, airline_country) values ('Schmeler LLC', 'Greece');
insert into Airline (airline_name, airline_country) values ('Mayer-Borer', 'Finland');
insert into Airline (airline_name, airline_country) values ('Runte and Sons', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Lang-Osinski', 'Russia');
insert into Airline (airline_name, airline_country) values ('Schiller-Prohaska', 'Greece');
insert into Airline (airline_name, airline_country) values ('Boyer-Leuschke', 'Poland');
insert into Airline (airline_name, airline_country) values ('Gutmann LLC', 'China');
insert into Airline (airline_name, airline_country) values ('Jacobs, Franecki and Erdman', 'China');
insert into Airline (airline_name, airline_country) values ('Nienow and Sons', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Ankunding-Marvin', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Mante-Haag', 'Thailand');
insert into Airline (airline_name, airline_country) values ('Hagenes, Fadel and Weissnat', 'China');
insert into Airline (airline_name, airline_country) values ('Kerluke, Connelly and Morar', 'Belarus');
insert into Airline (airline_name, airline_country) values ('Feeney-Kulas', 'China');
insert into Airline (airline_name, airline_country) values ('Larkin, Bergnaum and Koepp', 'Saint Kitts and Nevis');
insert into Airline (airline_name, airline_country) values ('VonRueden, Rau and Gislason', 'Ivory Coast');
insert into Airline (airline_name, airline_country) values ('Hand-Lowe', 'Germany');
insert into Airline (airline_name, airline_country) values ('Fritsch, Hyatt and Bogan', 'Russia');
insert into Airline (airline_name, airline_country) values ('Beer and Sons', 'China');
insert into Airline (airline_name, airline_country) values ('Parker LLC', 'Russia');
insert into Airline (airline_name, airline_country) values ('Armstrong, Ward and Mills', 'Portugal');
insert into Airline (airline_name, airline_country) values ('Reilly, Schiller and Bergnaum', 'Guatemala');
insert into Airline (airline_name, airline_country) values ('Dach-Lynch', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Walsh, Kautzer and Schmidt', 'United States');
insert into Airline (airline_name, airline_country) values ('Thompson Inc', 'Ireland');
insert into Airline (airline_name, airline_country) values ('Weimann, Fadel and Corkery', 'China');
insert into Airline (airline_name, airline_country) values ('Mayert-Greenholt', 'United States');
insert into Airline (airline_name, airline_country) values ('Gleichner-Jaskolski', 'Brazil');
insert into Airline (airline_name, airline_country) values ('Legros-Senger', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Flatley, Reilly and Lowe', 'Micronesia');
insert into Airline (airline_name, airline_country) values ('Goldner, Pouros and Brakus', 'Kenya');
insert into Airline (airline_name, airline_country) values ('Jenkins-Schinner', 'China');
insert into Airline (airline_name, airline_country) values ('Walsh-Kuhlman', 'Poland');
insert into Airline (airline_name, airline_country) values ('Beier Inc', 'Luxembourg');
insert into Airline (airline_name, airline_country) values ('Nikolaus Inc', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Schinner-Yost', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Armstrong LLC', 'Poland');
insert into Airline (airline_name, airline_country) values ('Okuneva-Kutch', 'Sweden');
insert into Airline (airline_name, airline_country) values ('Schuppe, O''Connell and Rempel', 'Vietnam');
insert into Airline (airline_name, airline_country) values ('Fahey, Welch and O''Keefe', 'Peru');
insert into Airline (airline_name, airline_country) values ('Dare, Fritsch and Kozey', 'Brazil');
insert into Airline (airline_name, airline_country) values ('Ryan and Sons', 'Dominican Republic');
insert into Airline (airline_name, airline_country) values ('Fahey, Ferry and Conn', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Bartoletti Inc', 'Russia');
insert into Airline (airline_name, airline_country) values ('Morar, Lemke and Ward', 'Botswana');
insert into Airline (airline_name, airline_country) values ('Kreiger, Hermiston and Cartwright', 'Peru');
insert into Airline (airline_name, airline_country) values ('Frami-Beahan', 'Macedonia');
insert into Airline (airline_name, airline_country) values ('Zemlak Group', 'Brazil');
insert into Airline (airline_name, airline_country) values ('Kessler LLC', 'Russia');
insert into Airline (airline_name, airline_country) values ('Mertz-Thiel', 'Russia');
insert into Airline (airline_name, airline_country) values ('Herman, Herman and Kertzmann', 'China');
insert into Airline (airline_name, airline_country) values ('Ruecker and Sons', 'China');
insert into Airline (airline_name, airline_country) values ('Carter LLC', 'China');
insert into Airline (airline_name, airline_country) values ('Walker LLC', 'Thailand');
insert into Airline (airline_name, airline_country) values ('Bahringer Inc', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Wiza, Kihn and Schultz', 'Tunisia');
insert into Airline (airline_name, airline_country) values ('Denesik Group', 'Russia');
insert into Airline (airline_name, airline_country) values ('Parisian-Sipes', 'Russia');
insert into Airline (airline_name, airline_country) values ('Gleichner and Sons', 'Argentina');
insert into Airline (airline_name, airline_country) values ('Weissnat Group', 'Thailand');
insert into Airline (airline_name, airline_country) values ('Cummings LLC', 'Sudan');
insert into Airline (airline_name, airline_country) values ('Johnston and Sons', 'Ecuador');
insert into Airline (airline_name, airline_country) values ('Russel-Willms', 'Albania');
insert into Airline (airline_name, airline_country) values ('Strosin Inc', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Romaguera-Barrows', 'Bangladesh');
insert into Airline (airline_name, airline_country) values ('Rohan-Casper', 'China');
insert into Airline (airline_name, airline_country) values ('Olson, Smitham and D''Amore', 'China');
insert into Airline (airline_name, airline_country) values ('Gleason, Pfannerstill and Koss', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Lindgren, Kunze and Hoppe', 'Russia');
insert into Airline (airline_name, airline_country) values ('Ratke-Kassulke', 'Russia');
insert into Airline (airline_name, airline_country) values ('Harber, DuBuque and Paucek', 'United States');
insert into Airline (airline_name, airline_country) values ('Bruen-Rutherford', 'China');
insert into Airline (airline_name, airline_country) values ('Rice, Konopelski and Carter', 'Georgia');
insert into Airline (airline_name, airline_country) values ('Schuster-Champlin', 'Afghanistan');
insert into Airline (airline_name, airline_country) values ('Bode Inc', 'Indonesia');
insert into Airline (airline_name, airline_country) values ('Hoeger-Weissnat', 'Brazil');
insert into Airline (airline_name, airline_country) values ('Homenick-Lind', 'Brazil');
insert into Airline (airline_name, airline_country) values ('Glover Group', 'Ukraine');
insert into Airline (airline_name, airline_country) values ('Hodkiewicz, Mayert and King', 'Afghanistan');
insert into Airline (airline_name, airline_country) values ('Thiel and Sons', 'Argentina');
insert into Airline (airline_name, airline_country) values ('Dickens Group', 'China');
insert into Airline (airline_name, airline_country) values ('Herzog, Kirlin and Tremblay', 'Philippines');
insert into Airline (airline_name, airline_country) values ('Marvin, Raynor and Beatty', 'Mauritius');
insert into Airline (airline_name, airline_country) values ('Walker Group', 'Canada');
insert into Airline (airline_name, airline_country) values ('Lynch-Schiller', 'Russia');
insert into Airline (airline_name, airline_country) values ('Bailey, Toy and Hand', 'China');
insert into Airline (airline_name, airline_country) values ('Daniel-Bahringer', 'Yemen');
insert into Airline (airline_name, airline_country) values ('Moore-Kunde', 'Argentina');
insert into Airline (airline_name, airline_country) values ('Larson, Homenick and Borer', 'Iran');
insert into Airline (airline_name, airline_country) values ('Pollich LLC', 'Uzbekistan');
insert into Airline (airline_name, airline_country) values ('Turcotte-Deckow', 'Colombia');
insert into Airline (airline_name, airline_country) values ('Von-Durgan', 'Indonesia');


--3
INSERT INTO Airline (airline_id,airline_name, airline_country) VALUES (21001,'KazAir', 'Kazakhstan');
--4
UPDATE Airline SET airline_country = 'Turkey' WHERE airline_country = 'Kazakhstan';
--5
DELETE FROM Airline WHERE airline_name = 'SIT';
--6
INSERT INTO Airline (airline_name, airline_country) VALUES ('AirEasy', 'France'), ('FlyHigh', 'Brazil'), ('FlyFly', 'Poland');
--7
DELETE FROM Flights
WHERE sch_arrival_time >= '2024-01-01 00:00:00'
  AND sch_arrival_time < '2025-01-01 00:00:00';
--8
UPDATE Booking SET ticket_price = ticket_price * 1.1;
--9
DELETE FROM Booking WHERE ticket_price <= 1000;


--Lab3

--1
SELECT * FROM Passengers WHERE first_name == last_name;
--2
SELECT DISTINCT last_name FROM Passengers;
--3
SELECT * FROM Passengers WHERE gender == 'Male' AND date_of_birth BETWEEN 1990 AND 2000;
--4
SELECT * FROM Booking ORDER BY price;
--5
SELECT * FROM Flights WHERE arriving_airport_id == 122134; --IDK what is China airport ids
--6
SELECT * FROM Airline WHERE airline_country == 'Kazakhstan';
--7
UPDATE Booking SET ticket_price = ticket_price *0.9 WHERE created_at < '12-12-2010';
--8
SELECT * FROM Baggage WHERE  weight_in_kg >= 25 ORDER BY weight_in_kg LIMIT 3;
--9
SELECT first_name and last_name FROM Passengers ORDER BY date_of_birth DESC LIMIT 1;
--10
SELECT * FROM booking ORDER BY ticket_price;