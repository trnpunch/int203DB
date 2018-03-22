

GRANT SELECT, UPDATE ON FACULTY TO AA59001 ;

SELECT  facsalary
FROM  faculty
WHERE facssn= '543210987';

UPDATE  faculty 
SET  facrank ='ASST'
WHERE   facssn= '543210987';

ROLLBACK ;


SELECT *
FROM  faculty
WHERE facdept LIKE 'MS%'
FOR UPDATE;


rollback ;


--1
SELECT SUM(facsalary) 
FROM faculty;

UPDATE faculty 
    SET facsalary = 70000 
    WHERE faclastname = 'MACON';
    
UPDATE faculty 
    SET facsalary = 20000 
    WHERE faclastname = 'VINCE';
    
--4
SELECT SUM(facsalary) 
FROM faculty;

--5
SAVEPOINT POINTONE ;

--6
UPDATE faculty 
    SET facsalary = 50000 
    WHERE faclastname = 'FIBON';
--7    
SELECT SUM(facsalary) 
FROM faculty;    

--8
SAVEPOINT POINTTWO ;

--9
UPDATE faculty 
    SET facsalary = 110000 
    WHERE faclastname = 'MILLS';

SELECT SUM(facsalary) 
FROM faculty;    

ROLLBACK TO SAVEPOINT POINTTWO ;


