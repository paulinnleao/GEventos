CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS ENROLLMENTS (
    ID UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    EVENT_ID UUID,
    PARTICIPANT_ID UUID,
    FOREIGN KEY (EVENT_ID) REFERENCES EVENTS(ID) ON DELETE CASCADE,
    FOREIGN KEY (PARTICIPANT_ID) REFERENCES USERS(ID) ON DELETE CASCADE
);