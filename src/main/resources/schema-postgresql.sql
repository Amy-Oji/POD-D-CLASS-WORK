/*
*@author flora
 */


DROP TABLE IF EXISTS questions cascade ;

CREATE TABLE IF NOT EXISTS questions (
                          id serial PRIMARY KEY,
                          title VARCHAR ( 50 ) UNIQUE NOT NULL,
                          description VARCHAR ( 255 ) UNIQUE NOT NULL
);