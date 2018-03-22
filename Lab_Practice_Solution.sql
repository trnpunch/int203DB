--1
Create or replace view finance_asset as select * from asset where sectorno=1006  with check option ;
Create or replace view energy_asset as select * from asset where sectorno=1005 with check option ;

--2
Create role r_staff ;
Create role r_manager ;
Grant  select,update on finance_asset to r_staff ;
Grant insert, delete on finame_asset to r_manager ;
Grant  select,update on energy_asset to r_staff ;
Grant insert, delete on energy_asset to r_manager ;
Grant r_staff to r_manager ;

--3
Create index cust_name_idx on customer (custname) ;
Create index Asset_name_idx on asset(assetname) ;

--4
Create or replace view search_cust_asset as 
 Select    h.holdno, h.custno, c.custname, h.assetno, a.assetname, holdqty
 From     holding h    join   customer c   on h.custno = c.custno   join   asset a   on   h.assetno = a.assetno  ;

--5
Create or replace view summary_trdqty_by_sector  as 
select s.sectorDesc as sector, to_char(t.trddate,'MM') month,trdtype type , sum(trdqty) total_qty
 from trade t join holding h on t.holdno = h.holdno 
    join asset a on h.assetno = a.assetno join customer c on  c.custno = h.custno
    join sector s on s.sectorno = a.sectorno 
group by s.sectordesc, to_char(t.trddate,'MM'),trdtype ;

--6
Create user staffxxx   identified by stfxxx ;
Grant create session, create synonym to r_staff;
Grant r_staff to staffxxx ;
Create synonym finance_asset for LQxxx.finance_asset ;
Create synonym energy_asset for LQxxx.energy_asset ;
Create synonym search_cust_asst for LQxxx.search_cust_asst;
Create synonym summary_trdqty_by_sector for LQxxx.summary_trdqty_by_sector  ;

--7
Select * From User_role_privs ;
Select * From Role_sys_privs ;
Select * From Role_tab_privs ;



