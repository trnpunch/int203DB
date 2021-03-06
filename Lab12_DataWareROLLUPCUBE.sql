--1
SELECT I.ITEMCATEGORY,T.TIMEMONTH,SUM(S.SALESCOST)
FROM SALES S JOIN ITEM I ON S.ITEMID = I.ITEMID
JOIN TIMEDIM T ON S.TIMENO = T.TIMENO
GROUP BY ROLLUP (I.ITEMCATEGORY,T.TIMEMONTH);
--2
SELECT T.TIMEYEAR,T.TIMEQUARTER,T.TIMEMONTH,SUM(S.SALESDOLLAR)
FROM TIMEDIM T JOIN SALES S ON T.TIMENO = S.TIMENO
WHERE T.TIMEYEAR BETWEEN '2005' AND '2006'
GROUP BY ROLLUP(T.TIMEYEAR,T.TIMEQUARTER,T.TIMEMONTH);
--3
SELECT C.CUSTCITY,I.ITEMNAME,T.TIMEYEAR,SUM(S.SALESUNITS)
FROM ITEM I JOIN SALES S ON I.ITEMID = S.ITEMID
JOIN TIMEDIM T ON S.TIMENO = T.TIMENO JOIN CUSTOMER C ON S.CUSTID = C.CUSTID
WHERE C.CUSTCITY = 'Seattle'OR C.CUSTCITY = 'Vancouver'
GROUP BY CUBE(C.CUSTCITY,I.ITEMNAME,T.TIMEYEAR);
1.1 678
1.2 1440
1.3 3312
--4
SELECT C.CUSTCITY,I.ITEMNAME,T.TIMEYEAR,GROUPING(C.CUSTCITY),GROUPING(I.ITEMNAME),GROUPING(T.TIMEYEAR),SUM(S.SALESUNITS)
FROM ITEM I JOIN SALES S ON I.ITEMID = S.ITEMID
JOIN TIMEDIM T ON S.TIMENO = T.TIMENO JOIN CUSTOMER C ON S.CUSTID = C.CUSTID
WHERE C.CUSTCITY = 'Seattle'OR C.CUSTCITY = 'Vancouver'
GROUP BY CUBE(C.CUSTCITY,I.ITEMNAME,T.TIMEYEAR);
--5
SELECT T.TIMEYEAR,T.TIMEQUARTER,T.TIMEMONTH,SUM(S.SALESDOLLAR - S.SALESCOST)
FROM SALES S JOIN TIMEDIM T ON S.TIMENO = T.TIMENO
GROUP BY ROLLUP(T.TIMEYEAR,T.TIMEQUARTER,T.TIMEMONTH);
