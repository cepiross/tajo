CREATE TABLE INDEXES (
  DB_ID INT NOT NULL,
  TID INT NOT NULL,
  INDEX_NAME VARCHAR(128) NOT NULL,
  COLUMN_NAME VARCHAR(128) NOT NULL,
  DATA_TYPE VARCHAR(128) NOT NULL,
  INDEX_TYPE CHAR(32) NOT NULL,
  IS_UNIQUE BOOLEAN NOT NULL,
  IS_CLUSTERED BOOLEAN NOT NULL,
  IS_ASCENDING BOOLEAN NOT NULL,
  PRIMARY KEY (DB_ID, INDEX_NAME),
  FOREIGN KEY (DB_ID) REFERENCES DATABASES_ (DB_ID) ON DELETE CASCADE,
  FOREIGN KEY (TID) REFERENCES TABLES (TID) ON DELETE CASCADE,
  UNIQUE INDEX IDX_DB_ID_NAME (DB_ID, INDEX_NAME),
  INDEX IDX_TID_COLUMN_NAME (TID, COLUMN_NAME)
)