CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS USERS (
    ID UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    NAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(50) NOT NULL UNIQUE,
    PASSWORD VARCHAR(100) NOT NULL,
    ROLE VARCHAR(11) NOT NULL,
    CHECK (ROLE = 'ADMIN' OR ROLE = 'PARTICIPANT')
);
