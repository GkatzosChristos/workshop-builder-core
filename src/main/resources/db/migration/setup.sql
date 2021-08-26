CREATE TABLE WB_PROJECT (PROJECT_ID NUMBER(10,0),
						 PROJECT_NAME VARCHAR2(128),
						 CREATED_DATE DATE,
						 STATUS VARCHAR2(128),
						 USER_ID NUMBER(38,0));
CREATE TABLE WB_PROPERTY (NAME VARCHAR2(128),
						  DESCRIPTION VARCHAR2(128),
						  VALUE VARCHAR2(128));
CREATE TABLE WB_USER (USER_ID NUMBER(10,0),
					  USER_NAME VARCHAR2(128),
					  USER_ROLE VARCHAR2(128));