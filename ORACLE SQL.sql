--1 
SELECT r.PR_HEADER_ID,r.STATUS_CD,r.DESCRIPTION
FROM REQ_HEADER r
WHERE r.REQUESTOR_CD = 'USER1';

--2 
SELECT r.PR_HEADER_ID,r.DESCRIPTION,rl.DESCRIPTION , rl.QUANTITY
FROM REQ_HEADER r 
INNER JOIN REQ_LINE rl ON r.PR_HEADER_ID = rl.PR_HEADER_ID
WHERE r.STATUS_CD = 'ACTIVE' AND r.REQUESTOR_CD = 'USER1';

--3
SELECT TOP (2) * 
FROM REQ_HEADER r
ORDER BY r.REQUIRED_BY_DATE DESC;

--4 
SELECT SUM(rl.QUANTITY * rl.UNIT_PRICE) as TOTAL_AMOUNT
FROM REQ_LINE rl 
WHERE rl.PR_HEADER_ID = '2022550836'

--5
SELECT SUM(rl.QUANTITY * rl.UNIT_PRICE) as TOTAL_AMOUNT
FROM REQ_LINE rl 
WHERE rl.PR_HEADER_ID = '2022550836' AND rl.STATUS_CD = 'ACTIVE'

--6 
CREATE TABLE MANUFACTURE_PART_NUMBERS(
	PR_MANUFACTURE_IDE char(30) NOT NULL,
	PR_REQ_LINE char(30) NOT NULL,
	NUMBER char(30) NOT NULL
	);

--7 
ALTER TABLE REQ_HEADER 
ADD VENDOR_ID char(30);

--8 
DROP TABLE DBO.MANUFACTURE_PART_NUMBERS

--9

CREATE TRIGGER VALIDATE_REQ_DATE 
  BEFORE INSERT
  ON REQ_HEADER FOR EACH ROW 
  WHEN (new.REQUIRED_BY_DATE = '')
BEGIN
	UPDATE REQ_HEADER SET REQUIRED_BY_DATE = REQ_UTILS.GET_DEFAULT_REQDATE();	
END;


