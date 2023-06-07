SET ROLE binding_group; --this allows future migrations to have full access to tables etc. DO NOT DELETE THIS LINE!!!

CREATE TABLE PROJECTBID
(
    id  SERIAL PRIMARY KEY,
    bidAmount  DOUBLE PRECISION,
    numberOfDays  INTEGER,
    bidderId  VARCHAR(255),
    project_project_id INTEGER references PROJECT
);

CREATE TABLE PROJECT
(
    projectId  SERIAL PRIMARY KEY,
    projectName  VARCHAR(255),
    deadLine  timestamp
);