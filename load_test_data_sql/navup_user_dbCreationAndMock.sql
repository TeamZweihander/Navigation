-- Database Creation
----------------------------------------------------------------------------------------------------------------------------------------------------------
--CREATE DATABASE "COS730UserModule"
  --  WITH 
    --OWNER = postgres
   -- ENCODING = 'UTF8'
   -- CONNECTION LIMIT = -1;

-- Schema Creation

--CREATE SCHEMA "navigation_module"
   -- AUTHORIZATION postgres;
COMMENT ON SCHEMA "navigation_module"
    IS 'This schema contains a collection of objects relating to the navigation module implementaion';

-- User Table Creation
----------------------------------------------------------------------------------------------------------------------------------------------------------
	
CREATE TABLE navigation_module.poi
(
    id serial NOT NULL,
    username character varying(50) NOT NULL,
    longitude decimal  NOT NULL,
    latitude decimal  NOT NULL,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE navigation_module.poi
    OWNER to postgres;
	

CREATE UNIQUE INDEX poi_user ON navigation_module.poi (username);
--CREATE extension pgcrypto;

ALTER TABLE navigation_module.poi
    ADD CONSTRAINT username_unique_check UNIQUE (username);
	
-- Insert Statements
----------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO navigation_module.poi (username,  longitude, latitude)
VALUES ('Sipho', 2541.3684,244528.24588);
INSERT INTO navigation_module.poi (username,  longitude, latitude)
VALUES ('Henry', 2541.244,1.24588);
INSERT INTO navigation_module.poi (username,  longitude, latitude)
VALUES ('Lindelo', 2541.42,3654.24588);

----------------------------------------------------------------------------------------------------------------------------------------------------------

select * from navigation_module.poi;

---------------------------------------------------------------------------------------------

--Route Preferences--
--Create Table--
CREATE TABLE navigation_module.routePreferences
(
    id serial NOT NULL,
    username character varying(50) NOT NULL,
	modeOfTravel varchar(30) not null,
	avoidStairs boolean not null default false,
	avoidTraffic boolean not null default true,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

--Make username attribute unique--
CREATE UNIQUE INDEX routePreferences_user ON navigation_module.routePreferences (username);

ALTER TABLE navigation_module.routePreferences
    ADD CONSTRAINT username_unique_check UNIQUE (username);
--Insert test data into routePreferences table--
Insert into navigation_module.routepreferences(username, modeoftravel, avoidtraffic, avoidstairs)
values ('Sipho', 'WALKING', true, false);

Insert into navigation_module.routepreferences(username, modeoftravel, avoidtraffic, avoidstairs)
values ('Henry', 'DRIVING', true, true);

Insert into navigation_module.routepreferences(username, modeoftravel, avoidtraffic, avoidstairs)
values ('Lindelo', 'BICYCLING', true, true);