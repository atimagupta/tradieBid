SET ROLE binding_group; --this allows future migrations to have full access to tables etc. DO NOT DELETE THIS LINE!!!

CREATE TABLE BID
(
    id  SERIAL PRIMARY KEY,
    bid_amount  DOUBLE PRECISION,
    number_of_days  INTEGER,
    bidder_id  VARCHAR(255),
    project_id INTEGER references PROJECT
);

CREATE TABLE PROJECT
(
    id  SERIAL PRIMARY KEY,
    project_name  VARCHAR(255),
    deadline  timestamp
);

INSERT into PROJECT values (1,'project1');
INSERT into PROJECT values (2,'project2');
INSERT into PROJECT values (3,'project3');