SELECT XMLCAST(  XMLQUERY('/staffs/staff[1]'  
                                          PASSING    data 
                                          RETURNING CONTENT  )  AS VARCHAR2(100))   T
FROM  staffs ;


SELECT  XMLQUERY('for  $i  in  //staff//firstname
                             return <row> {$i}</row>'
                             PASSING  data
                             RETURNING CONTENT)  T
FROM staffs ;


SELECT  XMLQUERY('for  $i  in  /staffs/staff[1]
                             return <row><staff> {$i/@staffno} {$i//firstname/text()} </staff>  </row>'
                             PASSING  data
                             RETURNING CONTENT)  T
FROM staffs ;

SELECT  XMLQUERY('for  $i  in  /staffs/staff[1]
                    return <row><staff staffno="{$i/@staffno}"> {$i//firstname/text()} </staff>  </row>'
                    PASSING  data
                     RETURNING CONTENT)  T
FROM staffs ;
--1
SELECT XMLQUERY('for $i in staffs/staff
where $i/salary>15000
return <row> {$i} </row>'
PASSING data
RETURNING CONTENT) piya 
FROM staffs;
--2
SELECT XMLQUERY('for $i in staffs/staff
where $i/@branchno="B005"
return <row> {$i//firstname} {$i//position} </row>'
PASSING data
RETURNING CONTENT) nawat
FROM staffs;
---3
SELECT XMLQUERY('for $i in staffs/staff
where $i/sex="M" and $i/position="Manager"
return <row> {$i} </row>'
PASSING data
RETURNING CONTENT) TAMAGODEIEI
FROM staffs;

--4
SELECT XMLQUERY('for $i in staffs/staff
order by $i/salary/number() descending
return <row> {$i/@staffno} {$i/name} {$i/salary} </row>'
PASSING data
RETURNING CONTENT) TAMAGODEIEI
FROM staffs;

--5
SELECT XMLQUERY('for $i in staffs/staff[@staffno = "SG14"]
          return <data><staff staffno= "{$i/@staffno}" position="{$i/position}">
          {$i//firstname/text()}{" "}{$i//lastname/text()}</staff></data>'
PASSING data
RETURNING CONTENT) KWAITAMAGODEIEI
FROM staffs;


