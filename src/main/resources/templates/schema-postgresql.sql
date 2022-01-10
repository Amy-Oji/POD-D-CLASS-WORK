/*
*@author Amarachukwu Ojiakor
 */


DROP TABLE IF EXISTS users_table;

CREATE TABLE IF NOT EXISTS users_table (
                                           user_id serial PRIMARY KEY,
                                           firstname VARCHAR ( 50 ) UNIQUE NOT NULL,
                                           lastname VARCHAR ( 50 ) UNIQUE NOT NULL,
                                           age VARCHAR ( 50 ) NOT NULL,
                                           email VARCHAR ( 255 ) UNIQUE NOT NULL
);