CREATE TABLE  "EQ4_APARCA" 
   (	"ID" NUMBER(*,0), 
	"LASTUPDATED" DATE, 
	"ICON" VARCHAR2(80), 
	"TITLE" VARCHAR2(30), 
	"HORARIO" VARCHAR2(20), 
	"ACCESOPEATON" VARCHAR2(30), 
	"ACCESOS" VARCHAR2(4), 
	"ACCESOVEHICULO" VARCHAR2(20), 
	"COORDX" NUMBER(4,0), 
	"COORDY" NUMBER(4,0), 
	 PRIMARY KEY ("ID") ENABLE
   ) ;
/
CREATE TABLE  "EQ4_BICI" 
   (	"ID" NUMBER(*,0), 
	"LASTUPDATED" DATE, 
	"ICON" VARCHAR2(80), 
	"TITLE" VARCHAR2(30), 
	"COORDX" NUMBER, 
	"COORDY" NUMBER, 
	 PRIMARY KEY ("ID") ENABLE
   ) ;
/

			
	